package pe.com.pzt.commons.dto;

public class AccountDTO {
	private String idAccount;
	private String idCustomer;
	private String currency;
	private String amount;
	public String getIdAccount() {
		return idAccount;
	}
	public void setIdAccount(String idAccount) {
		this.idAccount = idAccount;
	}
	public String getIdCustomer() {
		return idCustomer;
	}
	public void setIdCustomer(String idCustomer) {
		this.idCustomer = idCustomer;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "AccounDTO [idAccount=" + idAccount + ", idCustomer=" + idCustomer + ", currency=" + currency
				+ ", amount=" + amount + "]";
	}
	
	

}
