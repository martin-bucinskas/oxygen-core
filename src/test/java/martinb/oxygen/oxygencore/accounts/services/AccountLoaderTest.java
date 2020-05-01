package martinb.oxygen.oxygencore.accounts.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import martinb.oxygen.oxygencore.accounts.IAccount;
import martinb.oxygen.oxygencore.accounts.providers.AccountProvider;
import martinb.oxygen.oxygencore.accounts.providers.AccountType;
import org.junit.jupiter.api.Test;

public class AccountLoaderTest {

    private final AccountProvider accountProvider = AccountProvider.REVOLUT;
    private final String token = "this-is-my-test-token";
    private final String accountId = "0001";

    private AccountLoader accountLoader = new AccountLoader();

    @Test
    public void loadAccountTest() {

        IAccount account = accountLoader.loadAccount(accountProvider, token, accountId);

        assertEquals(AccountProvider.REVOLUT, account.getAccountProvider());
        assertEquals(AccountType.PERSONAL, account.getAccountType());
        assertEquals("A001-002-0003", account.getAccountId());
        assertEquals("Jane Doe", account.getAccountName());
    }

    @Test
    public void throwsRuntimeExceptionWhenUnknownOrUnhandledProvider() {
        Throwable throwable = assertThrows(RuntimeException.class, () -> accountLoader.loadAccount(AccountProvider.UNKNOWN, token, accountId));
        assertEquals("Unknown provider.", throwable.getMessage());
    }

    @Test
    public void loadRevolutAccountTest() {

        IAccount account = accountLoader.loadRevolutAccount(token, accountId);

        assertEquals(AccountProvider.REVOLUT, account.getAccountProvider());
        assertEquals(AccountType.PERSONAL, account.getAccountType());
        assertEquals("A001-002-0003", account.getAccountId());
        assertEquals("Jane Doe", account.getAccountName());
    }
}
