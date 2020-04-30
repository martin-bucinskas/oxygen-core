package martinb.oxygen.oxygencore.accounts.services;

import martinb.oxygen.oxygencore.accounts.IAccount;
import martinb.oxygen.oxygencore.accounts.providers.AccountProvider;

public interface IAccountLoader {

    IAccount loadAccount(AccountProvider accountProvider, String token, String accountId);
}
