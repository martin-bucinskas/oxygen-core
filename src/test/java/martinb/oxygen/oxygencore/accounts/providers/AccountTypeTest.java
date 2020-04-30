package martinb.oxygen.oxygencore.accounts.providers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountTypeTest {

    @Test
    public void haveAllValuesBeenAdded() {
        Assertions.assertEquals(2, AccountType.values().length);
    }

    @Test
    public void hasCorrectValues() {
        Assertions.assertEquals("personal", AccountType.PERSONAL.toString());
        Assertions.assertEquals("unknown", AccountType.UNKNOWN.toString());
    }
}
