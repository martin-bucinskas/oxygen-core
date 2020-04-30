package martinb.oxygen.oxygencore.accounts.providers;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.annotation.JsonValue;

public enum AccountType {

    PERSONAL("personal"),

    @JsonEnumDefaultValue
    UNKNOWN("unknown");

    @JsonValue
    private final String type;

    AccountType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
}
