package pe.com.pzt.client;

import pe.com.pzt.commons.dto.CustomerDTO;

public interface BankCustomerClient {
	
	CustomerDTO getCustomer(String tipDoc, String nroDoc);

	void createCustomer(CustomerDTO customerDTO);
	
	boolean isCustomer(String tipDoc, String nroDoc);

}
