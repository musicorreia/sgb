package persistence;

import java.util.ArrayList;
import java.util.List;

import domain.models.Client;

public class Persistence {

	private static List<Client> clientBag = new ArrayList<>();
	
	public static Client addCLient(Client c) {
		clientBag.add(c);
		return c;
	}

	public static List<Client> findAllClients() {

		return clientBag;
	}
}
