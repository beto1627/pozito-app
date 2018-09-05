package pe.com.pzt.business;

import pe.com.pzt.domain.Account;

public interface AccountService {

	Account obtenerAccount(String idFacebook);

	void registrarAccount(Account Account);

}
