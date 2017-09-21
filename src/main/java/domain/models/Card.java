package domain.models;

import java.util.UUID;

public class Card {

    private UUID identifier;

    private CardType type;


    public UUID getIdentifier() {

        return identifier;
    }

    public void setIdentifier(UUID identifier) {

        this.identifier = identifier;
    }

    public CardType getType() {
        return type;
    }

    public void setType(CardType type) {
        this.type = type;
    }
}
