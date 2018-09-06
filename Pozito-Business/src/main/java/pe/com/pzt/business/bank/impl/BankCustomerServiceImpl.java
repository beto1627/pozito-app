package pe.com.pzt.business.bank.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.pzt.business.bank.BankCustomerService;
import pe.com.pzt.client.BankCustomerClient;
import pe.com.pzt.commons.dto.CustomerDTO;

@Service
public class BankCustomerServiceImpl implements BankCustomerService {

	@Autowired
	private BankCustomerClient bankCustomerClient;

	@Override
	public void createCustomer(CustomerDTO customerDTO) {
		bankCustomerClient.createCustomer(customerDTO);
	}

	@Override
	public CustomerDTO getCustomer(String tipDoc, String nroDoc) {
		return bankCustomerClient.getCustomer(tipDoc, nroDoc);
	}

	@Override
	public boolean isCustomer(String tipDoc, String nroDoc) {
		return bankCustomerClient.isCustomer(tipDoc, nroDoc);
	}

}
