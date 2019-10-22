
public class Animal extends EntidadGanadera {
	int id;
	String raza;
	int edad;
	String sexo;
	double peso;
	boolean capado;
	int paridos;	
	
public Animal(int id, String raza, int edad, String sexo, double peso,
			boolean capado, int paridos) {
		this.id = id;
		this.raza = raza;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.capado = capado;
		this.paridos = paridos;
	}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getRaza() {
	return raza;
}

public void setRaza(String raza) {
	this.raza = raza;
}

public String getSexo() {
	return sexo;
}

public void setSexo(String sexo) {
	this.sexo = sexo;
}

public boolean getCapado() {
	return capado;
}

public void setCapado(boolean capado) {
	this.capado = capado;
}

public int getParidos() {
	return paridos;
}

public void setParidos(int paridos) {
	this.paridos = paridos;
}

public void setEdad(int edad) {
	this.edad = edad;
}

public void setPeso(double peso) {
	this.peso = peso;
}

public int getCantidad(){
	return (1);
}

public double getPeso(){
	return peso;
}

public int getEdad(){
	return edad;
}


}
