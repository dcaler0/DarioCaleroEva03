package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;

public class Corredor extends Deportista implements ICorredor {
	
	private Integer cantidadDeKilometrosEntrenados;
	private String nombre;
	private Integer numeroDeSocio;
	private Integer distanciaPreferida;
	
	
	public Corredor(Integer numeroDeSocio, String nombre, Integer distanciaPreferida) {
		super(numeroDeSocio, nombre);
		this.distanciaPreferida= distanciaPreferida;
		this.cantidadDeKilometrosEntrenados= 0;
	}

	@Override
	public void setCantidadDeKilometrosEntrenados(Integer km) {
		this.cantidadDeKilometrosEntrenados = km;
	}

	@Override
	public Integer getCantidadDeKilometrosEntrenados() {
		return cantidadDeKilometrosEntrenados;
	}
	
	public Integer getNumeroDeSocio() {
		return numeroDeSocio;
	}

	public Integer getDistanciaPreferida() {
		return distanciaPreferida;
	}
	
}
