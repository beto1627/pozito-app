package pe.com.pzt.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.com.pzt.business.AccountService;
import pe.com.pzt.dao.AccountDAO;
import pe.com.pzt.domain.BankAccount;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountDAO accountDAO;

	@Override
	public BankAccount getAccount(String idAccount) {
		return accountDAO.getAccount(idAccount);
	}
	
	@Override
	public List<BankAccount> getAllAccountsByIdFacebook(String idFacebook) {
		return accountDAO.getAllAccountsByIdFacebook(idFacebook);
	}

	@Override
	@Transactional
	public void registrarAccount(BankAccount account) {
		accountDAO.createAccount(account);
	}

}
