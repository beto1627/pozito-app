package pe.com.pzt.business.bank.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.pzt.business.bank.BankAccountService;
import pe.com.pzt.client.BankAccountClient;
import pe.com.pzt.commons.dto.AccountDTO;

@Service
public class BankAccountServiceImpl implements BankAccountService {
	@Autowired
	private BankAccountClient bankAccountClient;

	@Override
	public void createBankAccount(AccountDTO accountDTO) {
		bankAccountClient.createAccount(accountDTO);
	}

	@Override
	public AccountDTO getBankAccount(String accountId) {
		return bankAccountClient.getAccount(accountId);
	}

}
