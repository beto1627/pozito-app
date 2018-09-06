package pe.com.pzt.commons;

import java.util.Arrays;
import java.util.stream.Stream;

public enum EstadoEnum {

	REGISTRADO("R", "Registrado"), INICIADO("I", "Iniciado"), TERMINADO("T", "Terminado");

	private String codigo;
	private String descripcion;

	private EstadoEnum(String codigo, String descripcion) {
		this.codigo = codigo;
		this.descripcion = descripcion;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public static EstadoEnum getDescripcion(String codigo) {
		return Arrays.asList(EstadoEnum.values()).stream().filter(s -> s.getCodigo().equals(codigo)).findFirst().get();
	}

}
