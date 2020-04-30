package martinb.oxygen.oxygencore;

import martinb.oxygen.oxygencore.accounts.AccountController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class SmokeTest {

    @Autowired
    private AccountController accountController;

    @Test
    public void contextLoads() {
        assertThat(accountController).isNotNull();
    }
}
