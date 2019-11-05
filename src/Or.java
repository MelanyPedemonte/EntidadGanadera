
public class Or implements Criterio{
private	Criterio c1;
private	Criterio c2;
	

public Or(Criterio c1, Criterio c2) {
		super();
		this.c1 = c1;
		this.c2 = c2;
	}

public Criterio getC1() {
	return c1;
}

public void setC1(Criterio c1) {
	this.c1 = c1;
}

public Criterio getC2() {
	return c2;
}

public void setC2(Criterio c2) {
	this.c2 = c2;
}

public boolean cumple(EntidadGanadera e){
	return (c1.cumple(e) || c2.cumple(e));
}

}
