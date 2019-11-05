
public class Main {
	public static void main(String[] args){
		GrupoAnimales rodeo= new GrupoAnimales("rodeo");
		GrupoAnimales empresa= new GrupoAnimales("empresa");
		
		Animal a1= new Animal(1,"Holstein",3,"femenino",0,false,0);
		Animal a2= new Animal(2,"angus",12,"femenino",0,false,1);
		Animal a3= new Animal(3,"angus",8,"masculino",0,false,0);
		Animal a4= new Animal(4,"angus",5,"masculino",0,false,0);
		Animal a5= new Animal(5,"Hereford",24,"masculino",0,true,0);
		
		rodeo.addEntidades(a1);
		rodeo.addEntidades(a2);
		rodeo.addEntidades(a3);
		rodeo.addEntidades(a4);
		
		empresa.addEntidades(rodeo);
		empresa.addEntidades(a5);
		
		IgualRaza c1= new IgualRaza("angus");
		
		Camion camion= new Camion(2,c1);
		
		empresa.controlCamion(camion);
	}

}
