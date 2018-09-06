package pe.com.pzt.business;

import java.util.List;

import pe.com.pzt.domain.Account;

public interface AccountService {

	Account getAccount(String idAccount);
	
	List<Account> getAllAccountsByIdFacebook(String idFacebook);

	void registrarAccount(Account account);

}
