package devopsdistilled.operp.client.context.party;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import devopsdistilled.operp.client.party.panes.models.CustomerPaneModel;
import devopsdistilled.operp.client.party.panes.models.ListCustomerPaneModel;
import devopsdistilled.operp.client.party.panes.models.ListVendorPaneModel;
import devopsdistilled.operp.client.party.panes.models.VendorPaneModel;
import devopsdistilled.operp.client.party.panes.models.impl.CustomerPaneModelImpl;
import devopsdistilled.operp.client.party.panes.models.impl.ListCustomerPaneModelImpl;
import devopsdistilled.operp.client.party.panes.models.impl.ListVendorPaneModelImpl;
import devopsdistilled.operp.client.party.panes.models.impl.VendorPaneModelImpl;

@Configuration
public class MvcModelContext {

	@Bean
	public VendorPaneModel vendorPaneModel() {
		return new VendorPaneModelImpl();
	}

	@Bean
	public ListVendorPaneModel listVendorPaneModel() {
		return new ListVendorPaneModelImpl();
	}

	@Bean
	public CustomerPaneModel customerPaneModel() {
		return new CustomerPaneModelImpl();
	}

	@Bean
	public ListCustomerPaneModel listCustomerPaneModel() {
		return new ListCustomerPaneModelImpl();
	}
}
