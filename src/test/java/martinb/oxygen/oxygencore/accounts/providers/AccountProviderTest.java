package martinb.oxygen.oxygencore.accounts.providers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountProviderTest {

    @Test
    public void haveAllValuesBeenAdded() {
        Assertions.assertEquals(2, AccountProvider.values().length);
    }

    @Test
    public void hasCorrectValues() {
        Assertions.assertEquals("revolut", AccountProvider.REVOLUT.toString());
        Assertions.assertEquals("unknown", AccountProvider.UNKNOWN.toString());
    }
}
