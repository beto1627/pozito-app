package pe.com.pzt.domain.dummy;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "D_CUSTOMER")
public class BankCustomerDummy {

	@Id
	@Basic(optional = false)
	@Column(name = "NDOI")
	private String ndoi;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "LAST_NAME_P")
	private String lastNameP;
	
	@Column(name = "LAST_NAME_M")
	private String lastNameM;
	
	@Column(name = "ADDRESS")
	private String address;
	
	@Column(name = "PEP")
	private String pep;
	
	@Column(name = "OCUPACION")
	private String ocupacion;
	
	@Column(name = "RUBRO")
	private String rubro;
	
	@Column(name = "EMPRESA")
	private String empresa;
	
	@Column(name = "TDOC")
	private String tdoc;
	
	@Column(name = "IS_CLIENT")
	private String isClient;
	
	@Column(name = "COD_CLIENT")
	private String codClient;

	public String getNdoi() {
		return ndoi;
	}

	public void setNdoi(String ndoi) {
		this.ndoi = ndoi;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastNameP() {
		return lastNameP;
	}

	public void setLastNameP(String lastNameP) {
		this.lastNameP = lastNameP;
	}

	public String getLastNameM() {
		return lastNameM;
	}

	public void setLastNameM(String lastNameM) {
		this.lastNameM = lastNameM;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPep() {
		return pep;
	}

	public void setPep(String pep) {
		this.pep = pep;
	}

	public String getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}

	public String getRubro() {
		return rubro;
	}

	public void setRubro(String rubro) {
		this.rubro = rubro;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getTdoc() {
		return tdoc;
	}

	public void setTdoc(String tdoc) {
		this.tdoc = tdoc;
	}

	public String getIsClient() {
		return isClient;
	}

	public void setIsClient(String isClient) {
		this.isClient = isClient;
	}

	public String getCodClient() {
		return codClient;
	}

	public void setCodClient(String codClient) {
		this.codClient = codClient;
	}

}

