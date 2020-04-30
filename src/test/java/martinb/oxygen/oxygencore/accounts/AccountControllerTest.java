package martinb.oxygen.oxygencore.accounts;

import martinb.oxygen.oxygencore.accounts.providers.AccountProvider;
import martinb.oxygen.oxygencore.accounts.providers.AccountType;
import martinb.oxygen.oxygencore.accounts.providers.revolut.RevolutAccount;
import martinb.oxygen.oxygencore.accounts.services.AccountLoader;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@WebMvcTest(AccountController.class)
public class AccountControllerTest {

    @Autowired
    private AccountController accountController;

    @MockBean
    private AccountLoader accountLoader;

    @BeforeEach
    public void setUp() {
        when(accountLoader.loadAccount(AccountProvider.REVOLUT, "abcd", "001"))
            .thenReturn(new RevolutAccount(
                AccountType.PERSONAL, "001", "Jane Doe")
            );
    }

    @Test
    public void getAccountTest() {
        ResponseEntity<Object> response =  accountController.getAccount("revolut", "abcd", "001");
        String expectedBody = "Provider: revolut<br />Token: abcd<br />ID: 001<br />Retrieved Account Name: Jane Doe";

        assertEquals(expectedBody, response.getBody());
        assertEquals(HttpStatus.OK, response.getStatusCode());
    }
}
