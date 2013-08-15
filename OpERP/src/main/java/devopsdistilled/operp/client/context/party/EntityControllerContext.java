package devopsdistilled.operp.client.context.party;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import devopsdistilled.operp.client.party.controllers.VendorController;
import devopsdistilled.operp.client.party.controllers.impl.VendorControllerImpl;

@Configuration
public class EntityControllerContext {

	@Bean
	public VendorController vendorController() {
		return new VendorControllerImpl();
	}
}
