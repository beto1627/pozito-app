package pe.com.pzt.client.impl;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.pzt.client.BankCustomerClient;
import pe.com.pzt.commons.dto.CustomerDTO;
import pe.com.pzt.dao.dummy.BankCustomerDAODummy;

@Service
public class BankCustomerClientImpl implements BankCustomerClient {
	@Autowired
	BankCustomerDAODummy bankCustomerDAODummy;
	
	@Override
	public CustomerDTO getCustomer(String tipDoc, String nroDoc) {
		try {			
			return bankCustomerDAODummy.getCustomer(tipDoc, nroDoc);
		} catch (NoResultException e) {
			return new CustomerDTO();
		} catch (RuntimeException e) {
			throw e;
		}
	}

	@Override
	public void createCustomer(CustomerDTO customerDTO) {
		try {
			bankCustomerDAODummy.createCustomer(customerDTO);
		} catch (RuntimeException e) {
			throw e;
		}
	}

	
	@Override
	public boolean isCustomer(String tipDoc, String nroDoc) {
		try {
			return bankCustomerDAODummy.isCustomer(tipDoc, nroDoc);
		} catch (RuntimeException e) {
			throw e;
		}
	}
	
}
