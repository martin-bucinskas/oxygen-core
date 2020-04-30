package martinb.oxygen.oxygencore.accounts.providers.revolut;

import martinb.oxygen.oxygencore.accounts.IAccount;
import martinb.oxygen.oxygencore.accounts.providers.AccountProvider;
import martinb.oxygen.oxygencore.accounts.providers.AccountType;
import martinb.oxygen.oxygencore.accounts.providers.revolut.RevolutAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RevolutAccountTest {

    private final AccountProvider expectedAccountProvider = AccountProvider.REVOLUT;
    private final AccountType expectedAccountType = AccountType.PERSONAL;
    private final String expectedAccountId = "A1086696-D134-472D-B83E-A3F4D201C058";
    private final String getExpectedAccountName = "Ms Jane Doe";

    private IAccount account;

    @BeforeEach
    public void setUp() {
        account = new RevolutAccount(
            expectedAccountType,
            expectedAccountId,
            getExpectedAccountName
        );
    }

    @Test
    public void shouldNotChangeProvidedValues() {
        Assertions.assertEquals(expectedAccountProvider, account.getAccountProvider());
        Assertions.assertEquals(expectedAccountType, account.getAccountType());
        Assertions.assertEquals(expectedAccountId, account.getAccountId());
        Assertions.assertEquals(getExpectedAccountName, account.getAccountName());
    }
}
