package ar.edu.unlam.pb2.eva03;

import java.util.Map;

import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;

public class Club {

	private String nombre;
	private Set<Deportista> socios;
	private Map<String, Evento> competencias;
	
	public Club(String nombre) {
		this.nombre=nombre;
		this.socios=new HashSet<Deportista>();
		this.competencias=new HashMap<String, Evento>();
	}

	public void crearEvento(TipoDeEvento evento, String nombre){
		competencias.put(nombre, new Evento(evento));
	}
	
	public void agregarDeportista(Deportista deportista) {
		socios.add(deportista);
	}

	public Integer getCantidadSocios() {
		return socios.size();
	}

	public Integer inscribirEnEvento(String nombreEvento, Deportista deportista) throws NoEstaPreparado {
		return competencias.get(nombreEvento).inscribirParticipante(deportista);
	}
	
	
}

	
	

