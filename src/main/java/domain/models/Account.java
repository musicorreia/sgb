package domain.models;

import java.util.UUID;

public class Account {



    private UUID identifier;

    public UUID getIdentifier() {
        return identifier;
    }

    public void setIdentifier(UUID identifier) {
        this.identifier = identifier;
    }
}
