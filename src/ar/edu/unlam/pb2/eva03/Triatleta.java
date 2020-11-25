package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;

public class Triatleta extends Deportista {

	private Integer numeroDeSocio;
	private String nombre;
	private String distanciaPreferida;
	private TipoDeBicicleta tipoDeBicicleta;
	
	public Triatleta(Integer numeroDeSocio, String nombre, String distanciaPreferida, TipoDeBicicleta tipoDeBicicleta) {
		super(numeroDeSocio, nombre);
		this.distanciaPreferida = distanciaPreferida;
		this.tipoDeBicicleta = tipoDeBicicleta;
	}

	public String getDistanciaPreferida() {
		return distanciaPreferida;
	}

	public Integer getNumeroDeSocio() {
		return this.numeroDeSocio;
	}
	
	public TipoDeBicicleta getTipoDeBicicleta() {
		return this.tipoDeBicicleta;
	}

	public void setTipoDeBicicleta(TipoDeBicicleta tipoDeBicicleta) {
		this.tipoDeBicicleta = tipoDeBicicleta;
	}
}
