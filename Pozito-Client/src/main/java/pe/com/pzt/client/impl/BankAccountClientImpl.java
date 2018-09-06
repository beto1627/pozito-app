package pe.com.pzt.client.impl;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.pzt.client.BankAccountClient;
import pe.com.pzt.commons.dto.AccountDTO;
import pe.com.pzt.dao.dummy.BankAccountDAODummy;

@Service
public class BankAccountClientImpl implements BankAccountClient {
	@Autowired
	BankAccountDAODummy bankAccountDAODummy;
	
	@Override
	public AccountDTO getAccount(String idAccount) {
		try {			
			return bankAccountDAODummy.getBankAccount(idAccount);
		} catch (NoResultException e) {
			return new AccountDTO();
		} catch (RuntimeException e) {
			throw e;
		}
	}

	@Override
	public void createAccount(AccountDTO accountDTO) {
		try {
			bankAccountDAODummy.createBankAccount(accountDTO);
		} catch (RuntimeException e) {
			throw e;
		}
	}
}
