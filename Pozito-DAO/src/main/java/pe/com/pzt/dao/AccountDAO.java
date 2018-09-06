package pe.com.pzt.dao;

import java.util.List;

import pe.com.pzt.domain.BankAccount;

public interface AccountDAO {
	
	BankAccount getAccount(String idAccount);

	void createAccount(BankAccount account);

	List<BankAccount> getAllAccountsByIdFacebook(String idFacebook);

}
