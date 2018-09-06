package pe.com.pzt.dao;

import java.util.List;

import pe.com.pzt.domain.Account;

public interface AccountDAO {
	
	Account getAccount(String idAccount);

	void createAccount(Account account);

	List<Account> getAllAccountsByIdFacebook(String idFacebook);

}
