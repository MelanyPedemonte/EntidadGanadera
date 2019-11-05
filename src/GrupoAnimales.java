import java.util.*;


public class GrupoAnimales extends EntidadGanadera {
	Vector<EntidadGanadera> entidadesG; 
	
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

public Vector<String> getRaza(){  
	Vector<String> aux= new Vector<String>();
	for(EntidadGanadera i: entidadesG){
		   aux.addAll(i.getRaza());
	}
	return aux;	
}

public void llenarCamion(Camion c){
	for(int i= 0; i<= c.getCapacidad(); i++){
		this.llenarCamion(c);
	}
}


public void addEntidades(EntidadGanadera e1){
	entidadesG.add(e1);
}

public boolean getCapado(Animal a) {                    
	return this.getCapado(a);
}

public int getParidos(Animal a) {                          
	return this.getParidos(a);
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
