package martinb.oxygen.oxygencore.accounts.services;

import martinb.oxygen.oxygencore.accounts.IAccount;
import martinb.oxygen.oxygencore.accounts.providers.AccountProvider;
import martinb.oxygen.oxygencore.accounts.providers.AccountType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountLoaderTest {

    private final AccountProvider accountProvider = AccountProvider.REVOLUT;
    private final String token = "this-is-my-test-token";
    private final String accountId = "0001";

    private AccountLoader accountLoader = new AccountLoader();

    @Test
    public void loadAccountTest() {
        IAccount account = accountLoader.loadAccount(accountProvider, token, accountId);

        Assertions.assertEquals(AccountProvider.REVOLUT, account.getAccountProvider());
        Assertions.assertEquals(AccountType.PERSONAL, account.getAccountType());
        Assertions.assertEquals("A001-002-0003", account.getAccountId());
        Assertions.assertEquals("Jane Doe", account.getAccountName());
    }
}
