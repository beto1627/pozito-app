package pe.com.pzt.business.bank;

import java.util.List;

import pe.com.pzt.commons.dto.AccountDTO;

public interface BankAccountService {

	void createBankAccount(AccountDTO accountDTO);
	AccountDTO getBankAccount(String accountId);
	List<AccountDTO> getAllAccountsByIdUser(String idUser);
}
