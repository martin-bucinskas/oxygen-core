package martinb.oxygen.oxygencore.accounts.services;

import martinb.oxygen.oxygencore.accounts.IAccount;
import martinb.oxygen.oxygencore.accounts.providers.AccountProvider;
import martinb.oxygen.oxygencore.accounts.providers.AccountType;
import martinb.oxygen.oxygencore.accounts.providers.revolut.RevolutAccount;
import org.springframework.stereotype.Service;

@Service
public class AccountLoader implements IAccountLoader {

    @Override
    public IAccount loadAccount(AccountProvider accountProvider, String token, String accountId) {
        //TODO: write an account loader service to load an account
        return new RevolutAccount(AccountType.PERSONAL, "A001-002-0003", "Jane Doe");
    }
}
