package martinb.oxygen.oxygencore.accounts.providers;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.annotation.JsonValue;

public enum AccountProvider {

    REVOLUT("revolut"),

    @JsonEnumDefaultValue
    UNKNOWN("unknown");

    @JsonValue
    private final String providerName;

    AccountProvider(String providerName) {
        this.providerName = providerName;
    }

    @Override
    public String toString() {
        return providerName;
    }
}
