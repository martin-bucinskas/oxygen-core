package martinb.oxygen.oxygencore.accounts;

import martinb.oxygen.oxygencore.accounts.providers.AccountProvider;
import martinb.oxygen.oxygencore.accounts.providers.AccountType;

public abstract class Account implements IAccount {

    private final AccountProvider accountProvider;
    private final AccountType accountType;
    private final String accountId;
    private final String accountName;

    public Account(
        AccountProvider accountProvider,
        AccountType accountType,
        String accountId,
        String accountName
    ) {
       this.accountProvider = accountProvider;
       this.accountType = accountType;
       this.accountId = accountId;
       this.accountName = accountName;
    }

    @Override
    public AccountProvider getAccountProvider() {
        return accountProvider;
    }

    @Override
    public AccountType getAccountType() {
        return accountType;
    }

    @Override
    public String getAccountId() {
        return accountId;
    }

    @Override
    public String getAccountName() {
        return accountName;
    }
}
