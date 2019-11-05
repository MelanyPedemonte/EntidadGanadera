import java.util.*;


public class GrupoAnimales extends EntidadGanadera {
private	Vector<EntidadGanadera> entidadesG; 
	
public GrupoAnimales(Criterio criterio) {
	super(criterio);
	entidadesG = new Vector<EntidadGanadera>();
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
