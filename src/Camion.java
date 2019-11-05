import java.util.*;


public class Camion {
private	int capacidad;
private	Criterio criterio;
private Vector<Animal> camiones;


public Camion(int capacidad, Criterio criterio) {
	this.capacidad = capacidad;
	this.criterio = criterio;
	this.camiones= new Vector<Animal>();
}

public Vector<Animal> getCamiones(){
	return (this.camiones);
}

public int getCapacidad() {
	return capacidad;
}


public void setCapacidad(int capacidad) {
	this.capacidad = capacidad;
}


public Criterio getCriterio() {
	return criterio;
}


public void setCriterio(Criterio criterio) {
	this.criterio = criterio;
}

}
