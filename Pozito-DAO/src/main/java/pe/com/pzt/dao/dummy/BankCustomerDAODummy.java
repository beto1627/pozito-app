package pe.com.pzt.dao.dummy;

import pe.com.pzt.commons.dto.CustomerDTO;

public interface BankCustomerDAODummy {

	void createCustomer(CustomerDTO customerDTO);
	CustomerDTO getCustomer(String tipDoc, String nroDoc);
	boolean isCustomer(String tipDoc, String nroDoc);
	
}
