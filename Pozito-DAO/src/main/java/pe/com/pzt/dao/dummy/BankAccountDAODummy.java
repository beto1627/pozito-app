package pe.com.pzt.dao.dummy;

import java.util.List;

import pe.com.pzt.commons.dto.AccountDTO;
import pe.com.pzt.domain.dummy.BankAccountDummy;

public interface BankAccountDAODummy {

	void createBankAccount(AccountDTO accountDTO);
	AccountDTO getBankAccount(String accountId);
	List<AccountDTO> getBankAccounts(String idUser);
	
}
