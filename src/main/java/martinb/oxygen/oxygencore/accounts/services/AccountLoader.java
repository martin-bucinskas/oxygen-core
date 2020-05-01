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
        switch(accountProvider) {
            case REVOLUT:
                return loadRevolutAccount(token, accountId);
            case UNKNOWN:
            default:
                throw new RuntimeException("Unknown provider.");
        }
    }

    public IAccount loadRevolutAccount(String token, String accountId) {
        return new RevolutAccount(AccountType.PERSONAL, "A001-002-0003", "Jane Doe");
    }
}
