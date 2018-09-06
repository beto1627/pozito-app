package pe.com.pzt.business.bank;

import pe.com.pzt.commons.dto.CustomerDTO;

public interface BankCustomerService {

	void createCustomer(CustomerDTO customerDTO);
	CustomerDTO getCustomer(String tipDoc, String nroDoc);
	boolean isCustomer(String tipDoc, String nroDoc);
}
