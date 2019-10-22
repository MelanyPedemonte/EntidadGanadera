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

public void addEntidades(EntidadGanadera e1){
	entidadesG.add(e1);
}

}
