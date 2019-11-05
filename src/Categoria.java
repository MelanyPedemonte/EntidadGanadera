
public class Categoria implements Criterio{
	Criterio criterio;
	String nombre;
	
public Categoria(Criterio criterio, String nombre) {
		this.criterio = criterio;
		this.nombre = nombre;
	}

public Criterio getCriterio() {
		return criterio;
	}

public void setCriterio(Criterio criterio) {
		this.criterio = criterio;
	}

public String getNombre() {
		return nombre;
	}

public void setNombre(String nombre) {
		this.nombre = nombre;
	}

public boolean cumple(EntidadGanadera e){
	return(this.criterio.cumple(e));
}

}
