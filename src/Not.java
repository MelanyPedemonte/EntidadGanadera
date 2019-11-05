
public class Not implements Criterio{
private	Criterio c;
	
public Not(Criterio c) {
		super();
		this.c = c;
	}

public Criterio getC() {
	return c;
}

public void setC(Criterio c) {
	this.c = c;
}
public boolean cumple(EntidadGanadera e){
	return (!c.cumple(e));
}

}
