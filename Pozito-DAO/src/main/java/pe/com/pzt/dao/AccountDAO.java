package pe.com.pzt.dao;

import pe.com.pzt.domain.Account;

public interface AccountDAO {

	Account obtenerAccount(String idFacebook);

	void registrarAccount(Account Account);

}
