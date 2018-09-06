package pe.com.pzt.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "POZO")
public class Pozo {

	@Id
	@Basic(optional = false)
	@Column(name = "POZO_ID")
	private String idPozo;

	@Column(name = "FACEBOOK_ID")
	private String idFacebook;

	@Column(name = "NAME")
	private String name;

	@Column(name = "AMOUNT")
	private String amount;

	@Column(name = "POZO_TYPE")
	private String tipoPozo;

	@Column(name = "NUM_PART")
	private String numeroParticipantes;

	@Column(name = "VIEW_TYPE")
	private String tipoVisibilidad;

	@Column(name = "STATE")
	private String estado;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getTipoPozo() {
		return tipoPozo;
	}

	public void setTipoPozo(String tipoPozo) {
		this.tipoPozo = tipoPozo;
	}

	public String getNumeroParticipantes() {
		return numeroParticipantes;
	}

	public void setNumeroParticipantes(String numeroParticipantes) {
		this.numeroParticipantes = numeroParticipantes;
	}

	public String getTipoVisibilidad() {
		return tipoVisibilidad;
	}

	public void setTipoVisibilidad(String tipoVisibilidad) {
		this.tipoVisibilidad = tipoVisibilidad;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
