import java.util.*;



public abstract class EntidadGanadera {
	Criterio criterio;
	
public abstract int getCantidad();

public abstract double getPeso();

public abstract int getEdad();

public abstract Vector<String> getRaza();

public abstract boolean getCapado(Animal a);

public abstract int getParidos(Animal a);

public abstract void llenarCamion(Camion c);

public int promedioEdad(){
	
	return (getEdad()/ getCantidad());
}

public double promedioPeso() {
	return (getPeso()/ getCantidad());
}

public boolean listoVenta(Criterio c){
	return (c.cumple(this));
}

public abstract boolean borrar(Animal a);

public void controlCamion(Camion c){
	Vector<Animal> aux= new Vector<Animal>();
	this.llenarCamion(c);
	for(Animal a: aux){
		this.borrar(a);
	}
}

}


