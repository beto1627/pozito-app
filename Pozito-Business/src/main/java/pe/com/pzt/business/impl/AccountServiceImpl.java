package pe.com.pzt.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.com.pzt.business.AccountService;
import pe.com.pzt.dao.AccountDAO;
import pe.com.pzt.domain.Account;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountDAO AccountDAO;

	@Override
	public Account getAccount(String idAccount) {
		return AccountDAO.getAccount(idAccount);
	}
	
	@Override
	public List<Account> getAllAccountsByIdFacebook(String idFacebook) {
		return AccountDAO.getAllAccountsByIdFacebook(idFacebook);
	}

	@Override
	@Transactional
	public void registrarAccount(Account account) {
		AccountDAO.createAccount(account);
	}

}
