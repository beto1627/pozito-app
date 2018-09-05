package pe.com.pzt.business.impl;

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
	public Account obtenerAccount(String idFacebook) {
		return AccountDAO.obtenerAccount(idFacebook);
	}

	@Override
	@Transactional
	public void registrarAccount(Account Account) {
		AccountDAO.registrarAccount(Account);
	}

}
