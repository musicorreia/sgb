package sgb;

import domain.services.ClientService;
import org.junit.Assert;

import domain.models.Client;
import org.junit.Test;


public class ClientServiceTest {

	
	private ClientService clientService;

	@Test
	public void registerClient_returnsValidIdentifier() {

	    clientService = new ClientService();
	  //  Client c = new Client();
	  //  c.setName("cenas");

	    Client c = Client.builder()
				.name("cenas")
				.build();

        Client savedClient = clientService.register(c);
	    Assert.assertEquals("cenas", savedClient.getName());
	    Assert.assertNotNull(savedClient.getIdentifier());

		clientService = new ClientService();
		Client c2 = new Client();
		c2.setName("cenas");
		Client savedClient2 = clientService.register(c);
		Assert.assertNotNull(savedClient2.getIdentifier());
		//Assert.assertNotNull(savedClient.getIdentifier(), savedClient2.getIdentifier());

	}

	@Test
	public void registerClient_returnsWithValidAccounts() {

		clientService = new ClientService();
		Client c = new Client();
		c.setName("cenas");
		Client savedClient = clientService.register(c);
		Assert.assertEquals("cenas", savedClient.getName());
		Assert.assertNotNull(savedClient.getIdentifier());
		Assert.assertFalse(savedClient.getAccounts().isEmpty());
		Assert.assertTrue(savedClient.getAccounts().size()>=1);
		Assert.assertNotNull(savedClient.getAccounts().get(0).getIdentifier());




	}
}
