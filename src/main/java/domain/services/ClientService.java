package domain.services;

import domain.models.*;
import persistence.Persistence;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


public class ClientService {

    public Client register(Client c) {

        c.setIdentifier(UUID.randomUUID()); //BR: client unique identifier

        createAccount(c);


        return Persistence.addCLient(c);

    }

    public  List<Client> findAll() {

        return  Persistence.findAllClients();


    }

    private void createAccount(Client c) {


        Account account = new Account();

        account.setIdentifier(UUID.randomUUID());

        createCard(c);


        if (c.getAccounts() == null || c.getAccounts().isEmpty()) {

            List<Account> accountsList = new ArrayList<>();


            c.setAccounts(accountsList);


        }
        c.getAccounts().add(account);


    }

    private void createCard(Client c) {

        Card card = new Card();

        card.setIdentifier(UUID.randomUUID());

        if (c.getCards() == null || c.getCards().isEmpty()) {


            List<Card> cardsList = new ArrayList<>();

            card.setType(CardType.DEBIT);
            c.setCards(cardsList);


        }
        c.getCards().add(card);


    }


}


