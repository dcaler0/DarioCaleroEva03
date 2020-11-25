package ar.edu.unlam.pb2.eva03;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;


import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;
import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;
import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;
import ar.edu.unlam.pb2.eva03.interfaces.INadador;

public class Evento {

	private TipoDeEvento tipo;
	private Integer numeroDeInscripcion;
	private Map<Integer, Deportista> participantes;
	
	public Evento(TipoDeEvento tipo) {
		this.tipo = tipo;
		this.numeroDeInscripcion = 0;
		this.participantes = new HashMap<Integer, Deportista>();
	}
	
	public Integer inscribirParticipante(Deportista deportista) throws NoEstaPreparado {
		
		switch(tipo) {
		case TRIATLON_SHORT:
		case TRIATLON_OLIMPICO:
		case TRIATLON_MEDIO:
		case TRIATLON_IRONMAN:
			if(deportista instanceof ICiclista || deportista instanceof ICorredor) {
				throw new NoEstaPreparado();
			}
			break;
			
		case CARRERA_5K:
		case CARRERA_10K:
		case CARRERA_21K:
		case CARRERA_42K:
			if(deportista instanceof ICiclista || deportista instanceof INadador) {
				throw new NoEstaPreparado();
			}
			break;
			
		case CARRERA_NATACION_EN_PICINA:
		case CARRERA_NATACION_EN_AGUAS_ABIERTAS:
			if(deportista instanceof ICorredor || deportista instanceof ICiclista) {
				throw new NoEstaPreparado();
			}
			break;	
		}

		return ++numeroDeInscripcion;
	}
	
}
