package martinb.oxygen.oxygencore.accounts;

import martinb.oxygen.oxygencore.accounts.providers.AccountProvider;
import martinb.oxygen.oxygencore.accounts.providers.AccountType;

public interface IAccount {

    AccountProvider getAccountProvider();

    String getAccountId();

    AccountType getAccountType();

    String getAccountName();
}
