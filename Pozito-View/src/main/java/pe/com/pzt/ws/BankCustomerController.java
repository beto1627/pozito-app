package pe.com.pzt.ws;

import javax.ws.rs.QueryParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pe.com.pzt.business.bank.BankCustomerService;
import pe.com.pzt.commons.ResponseRS;
import pe.com.pzt.commons.dto.AccountDTO;
import pe.com.pzt.commons.dto.CustomerDTO;

@RestController
public class BankCustomerController {
	
	@Autowired
	private BankCustomerService bankCustomerService;

	@GetMapping("/bankcustomer")
	public ResponseRS getBankCustomer(@QueryParam(value = "tipDoc") String tipDoc,
			@QueryParam(value = "nroDoc") String nroDoc) {
		CustomerDTO customer = bankCustomerService.getCustomer(tipDoc,nroDoc);
		ResponseRS responseRS = new ResponseRS();
		responseRS.setCode(customer != null ? "S" : "N");
		responseRS.setResult(customer);
		return responseRS;
	}
	

	@PostMapping("/bankcustomer")
	public ResponseRS postCustomer(@RequestBody CustomerDTO customerDTO) {
		try {
			bankCustomerService.createCustomer(customerDTO);
		} catch (Exception e) {
		}
		ResponseRS responseRS = new ResponseRS();
		responseRS.setCode(customerDTO != null ? "S" : "N");
		responseRS.setResult(customerDTO);
		return responseRS;
	}
	
	@GetMapping("/bankcustomer/validate")
	public ResponseRS isCustomer(@QueryParam(value = "tipDoc") String tipDoc,
			@QueryParam(value = "nroDoc") String nroDoc) {
		boolean result = bankCustomerService.isCustomer(tipDoc,nroDoc);
		ResponseRS responseRS = new ResponseRS();
		responseRS.setCode(result ? "S" : "N");
		responseRS.setResult(result);
		return responseRS;
	}

}
