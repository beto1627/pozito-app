package pe.com.pzt.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pe.com.pzt.business.AccountService;
import pe.com.pzt.commons.ResponseRS;
import pe.com.pzt.domain.BankAccount;

@RestController
public class AccountController {
	
	@Autowired
	private AccountService accountService;

	@GetMapping("/account/{idAccount}")
	public ResponseRS getAccount(@PathVariable(value = "idAccount") String idAccount) {
		BankAccount account = accountService.getAccount(idAccount);
		System.out.println("idAccount" + idAccount);
		ResponseRS responseRS = new ResponseRS();
		responseRS.setCode(account != null ? "S" : "N");
		responseRS.setResult(account);
		return responseRS;
	}
	
	@GetMapping("/accounts/{idFacebook}")
	public ResponseRS getAllAccountsByIdFacebook(@PathVariable(value = "idFacebook") String idFacebook) {
		List<BankAccount> accounts = accountService.getAllAccountsByIdFacebook(idFacebook);
		
		ResponseRS responseRS = new ResponseRS();
		responseRS.setCode(!accounts.isEmpty() ? "S" : "N");
		responseRS.setResult(accounts);
		return responseRS;
	}

	@PostMapping("/account")
	public ResponseRS postAccount(@RequestBody BankAccount account) {
		try {
			accountService.registrarAccount(account);
		} catch (Exception e) {
		}
		ResponseRS responseRS = new ResponseRS();
		responseRS.setCode(account != null ? "S" : "N");
		responseRS.setResult(account);
		return responseRS;
	}

}
