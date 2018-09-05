package pe.com.pzt.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ACCOUNT_SETTINGS")
public class Account {

	@Id
	@Basic(optional = false)
	@Column(name = "FACEBOOK_ID")
	private String idFacebook;

}
