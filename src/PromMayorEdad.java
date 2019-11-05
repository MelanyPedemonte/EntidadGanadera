
public class PromMayorEdad implements Criterio{
		int limite;
		
	public PromMayorEdad(int limite) {
			super();
			this.limite = limite;
		}

	public int getLimite() {
		return limite;
	}

	public void setLimite(int limite) {
		this.limite = limite;
	}

	public boolean cumple(EntidadGanadera e) {
		return (e.promedioEdad()>limite);	
		}
	
	}

