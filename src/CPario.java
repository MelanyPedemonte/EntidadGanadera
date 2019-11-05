
public class CPario implements Criterio {
	
public boolean cumple(EntidadGanadera e){
	return (((Animal)e).getParidos()>1);
}

}
