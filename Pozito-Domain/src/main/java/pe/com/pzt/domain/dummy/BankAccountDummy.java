package pe.com.pzt.domain.dummy;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "D_ACCOUNT")
public class BankAccountDummy {

	@Id
	@Basic(optional = false)
	@Column(name = "CUENTA")
	private String cuenta;
	
	@Column(name = "PRODUCT")
	private String product;
	
	@Column(name = "SUBPRODUCT")
	private String subproduct;
	
	@Column(name = "INDMANC")
	private String indManc;
	
	@Column(name = "AMOUNT")
	private String amount;
	
	@Column(name = "CODCLIE")
	private String codClie;
	
	@Column(name = "CODOFI")
	private String codOfic;
	
	@Column(name = "CODCCI")
	private String codCci;
	
	@Column(name = "CURRENCY")
	private String currency;

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getSubproduct() {
		return subproduct;
	}

	public void setSubproduct(String subproduct) {
		this.subproduct = subproduct;
	}

	public String getIndManc() {
		return indManc;
	}

	public void setIndManc(String indManc) {
		this.indManc = indManc;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCodClie() {
		return codClie;
	}

	public void setCodClie(String codClie) {
		this.codClie = codClie;
	}

	public String getCodOfic() {
		return codOfic;
	}

	public void setCodOfic(String codOfic) {
		this.codOfic = codOfic;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public String getCodCci() {
		return codCci;
	}

	public void setCodCci(String codCci) {
		this.codCci = codCci;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	
}

