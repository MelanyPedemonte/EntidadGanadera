import java.util.*;


public class GrupoAnimales extends EntidadGanadera {
private String nombre;
private	Vector<EntidadGanadera> entidadesG; 
	
public GrupoAnimales(String nombre) {
	this.nombre= nombre;
	entidadesG = new Vector<EntidadGanadera>();
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public int getCantidad(){
	int suma=0;
	for (EntidadGanadera i: entidadesG ){
		suma= suma+ i.getCantidad();
	}
	return suma;
}

public double getPeso() {
	double suma=0;
	for (EntidadGanadera i: entidadesG ){
		suma= suma+ i.getPeso();
	}
	return suma;
}

public int getEdad(){
	int suma=0;
	for(EntidadGanadera i: entidadesG){
		suma= suma+ i.getEdad();
	}
	return suma;
}

public void llenarCamion(Camion c){
	for(int i= 0; i<= c.getCapacidad(); i++){
		this.llenarCamion(c);
	}
}


public void addEntidades(EntidadGanadera e1){
	entidadesG.add(e1);
}

public boolean borrar(Animal a){
	if(!entidadesG.removeElement(a)){
		for(EntidadGanadera i: entidadesG){
			if(i.borrar(a)){
				return true;
			}
		}
	}
	return true;
}


}
