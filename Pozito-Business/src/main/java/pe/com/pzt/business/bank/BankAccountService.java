package pe.com.pzt.business.bank;

import pe.com.pzt.commons.dto.AccountDTO;

public interface BankAccountService {

	void createBankAccount(AccountDTO accountDTO);
	AccountDTO getBankAccount(String accountId);
}
