
public abstract class EntidadGanadera {
	
public abstract int getCantidad();

public abstract double getPeso();

public abstract int getEdad();

public int promedioEdad(){
	
	return (getEdad()/ getCantidad());
}

public double promedioPeso() {
	return (getPeso()/ getCantidad());
}

}
