package pe.com.pzt.client;

import java.util.List;

import pe.com.pzt.commons.dto.AccountDTO;

public interface BankAccountClient {
	
	AccountDTO getAccount(String idAccount);

	void createAccount(AccountDTO accountDTO);
	
	List <AccountDTO> getAccounts(String idUser);

}
