package pe.com.pzt.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "POZERO")
public class Pozero {

	@Id
	@Basic(optional = false)
	@Column(name = "POZO_ID")
	private String idPozo;

	@Column(name = "FACEBOOK_ID")
	private String idFacebook;

	@Column(name = "ACCOUNT_ID")
	private String idAccount;

	@Transient
	private String fullName;

	@Transient
	private Integer reputation;

	public String getIdPozo() {
		return idPozo;
	}

	public void setIdPozo(String idPozo) {
		this.idPozo = idPozo;
	}

	public String getIdFacebook() {
		return idFacebook;
	}

	public void setIdFacebook(String idFacebook) {
		this.idFacebook = idFacebook;
	}

	public String getIdAccount() {
		return idAccount;
	}

	public void setIdAccount(String idAccount) {
		this.idAccount = idAccount;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Integer getReputation() {
		return reputation;
	}

	public void setReputation(Integer reputation) {
		this.reputation = reputation;
	}

}
