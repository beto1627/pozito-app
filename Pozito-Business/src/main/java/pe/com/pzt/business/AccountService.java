package pe.com.pzt.business;

import java.util.List;

import pe.com.pzt.domain.BankAccount;

public interface AccountService {

	public BankAccount getAccount(String idAccount);
	
	public List<BankAccount> getAllAccountsByIdFacebook(String idFacebook);

	public void registrarAccount(BankAccount account);

}
