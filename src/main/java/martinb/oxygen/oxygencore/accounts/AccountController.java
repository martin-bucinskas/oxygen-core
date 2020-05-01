package martinb.oxygen.oxygencore.accounts;

import martinb.oxygen.oxygencore.accounts.providers.AccountProvider;
import martinb.oxygen.oxygencore.accounts.services.AccountLoader;
import martinb.oxygen.oxygencore.accounts.services.IAccountLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AccountController {

    private IAccountLoader accountLoader;

    @Autowired
    public AccountController(AccountLoader accountLoader) {
        this.accountLoader = accountLoader;
    }

    @RequestMapping(value = "/get/account/{id}")
    public ResponseEntity<Object> getAccount(
        @RequestParam(
            name = "provider",
            defaultValue = "unknown"
        ) String accountProviderString,
        @RequestParam(
            name = "token",
            required = false,
            defaultValue = ""
        ) String token,
        @PathVariable("id") String id) {

        IAccount account = accountLoader.loadAccount(AccountProvider.valueOf(accountProviderString.toUpperCase()), token, id);

        String body = "Provider: " +
            accountProviderString +
            "<br />Token: " +
            token +
            "<br />ID: " +
            id + "<br />Retrieved Account Name: " +
            account.getAccountName();

        return new ResponseEntity<>(body, HttpStatus.OK);
    }
}
