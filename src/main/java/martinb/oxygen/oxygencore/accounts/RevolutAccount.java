package martinb.oxygen.oxygencore.accounts;

import martinb.oxygen.oxygencore.accounts.providers.AccountProvider;
import martinb.oxygen.oxygencore.accounts.providers.AccountType;

public class RevolutAccount extends Account {

    public RevolutAccount(
        AccountProvider accountProvider,
        AccountType accountType,
        String accountId,
        String accountName
    ) {
        super(accountProvider, accountType, accountId, accountName);
    }
}
