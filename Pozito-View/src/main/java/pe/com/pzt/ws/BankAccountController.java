package pe.com.pzt.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pe.com.pzt.business.bank.BankAccountService;
import pe.com.pzt.commons.ResponseRS;
import pe.com.pzt.commons.dto.AccountDTO;

@RestController
public class BankAccountController {
	
	@Autowired
	private BankAccountService bankAccountService;

	@GetMapping("/bankaccount/{idAccount}")
	public ResponseRS getBankAccount(@PathVariable(value = "idAccount") String idAccount) {
		AccountDTO account = bankAccountService.getBankAccount(idAccount);
		ResponseRS responseRS = new ResponseRS();
		responseRS.setCode(account != null ? "S" : "N");
		responseRS.setResult(account);
		return responseRS;
	}
	
	@GetMapping("/bankaccounts/{idUser}")
	public ResponseRS getAllAccountsByIdUser(@PathVariable(value = "idUser") String idUser) {
		List<AccountDTO> accounts = bankAccountService.getAllAccountsByIdUser(idUser);
		
		ResponseRS responseRS = new ResponseRS();
		responseRS.setCode(!accounts.isEmpty() ? "S" : "N");
		responseRS.setResult(accounts);
		return responseRS;
	}

	@PostMapping("/bankaccount")
	public ResponseRS postAccount(@RequestBody AccountDTO accountDTO) {
		try {
			bankAccountService.createBankAccount(accountDTO);
		} catch (Exception e) {
		}
		ResponseRS responseRS = new ResponseRS();
		responseRS.setCode(accountDTO != null ? "S" : "N");
		responseRS.setResult(accountDTO);
		return responseRS;
	}

}
