package martinb.oxygen.oxygencore.accounts.providers.revolut;

import martinb.oxygen.oxygencore.accounts.Account;
import martinb.oxygen.oxygencore.accounts.providers.AccountProvider;
import martinb.oxygen.oxygencore.accounts.providers.AccountType;

public class RevolutAccount extends Account {

    public RevolutAccount(
        AccountType accountType,
        String accountId,
        String accountName
    ) {
        super(AccountProvider.REVOLUT, accountType, accountId, accountName);
    }
}
