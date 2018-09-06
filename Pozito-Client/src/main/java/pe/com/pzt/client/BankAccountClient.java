package pe.com.pzt.client;

import pe.com.pzt.commons.dto.AccountDTO;

public interface BankAccountClient {
	
	AccountDTO getAccount(String idAccount);

	void createAccount(AccountDTO accountDTO);

}
