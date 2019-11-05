	import java.util.*;


public class Categorizador {
private Vector<Categoria> categorias;

public Categorizador(Vector<Categoria> categorias) {
			this.categorias = categorias;
		}

public String CategorizarAnimal(EntidadGanadera e){
			String cat=" ";
			for(Categoria c:categorias) {
				if(c.cumple(e)){
					cat+=c.getNombre();
				}
			}
			return cat;
		}

}
