import java.util.*;


public class Camion {
	int capacidad;
	Criterio criterio;
	Vector<Animal> camiones;
	
public Camion(int capacidad){
	this.capacidad= capacidad;
	camiones = new Vector<Animal>();
}

public int getCapacidad(){
	return (this.capacidad);
}

public void setCapacidad(int capacidad){
	this.capacidad= capacidad;
}



}
