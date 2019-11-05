
public class PesoMayor implements Criterio{
	Double limite;

public PesoMayor(Double limite) {
		super();
		this.limite = limite;
	}

public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}

public boolean cumple(EntidadGanadera e){
	return (e.getPeso() > limite);
}
}
