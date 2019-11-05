
public class EdadMayor implements Criterio{
private	int limite;

public EdadMayor(int limite) {
		super();
		this.limite = limite;
	}

public int getLimite() {
		return limite;
	}

	public void setLimite(int limite) {
		this.limite = limite;
	}

public boolean cumple(EntidadGanadera e){
	return (e.getEdad()> limite);
}

}
