
public class EstaCapado implements Criterio{
	
public boolean cumple(EntidadGanadera e){
	return (((Animal)e).getCapado());
}
}
