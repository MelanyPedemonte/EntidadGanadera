

public class IgualRaza implements Criterio{
	String raza;
	
public IgualRaza(String raza) {
		super();
		this.raza = raza;
	}

public String getRaza() {
	return raza;
}

public void setRaza(String raza) {
	this.raza = raza;
}

public boolean cumple(EntidadGanadera e){
	return (e.getRaza().equals(raza));
}


}
