package EjercicioClaseGenerica;

import java.util.ArrayList;
import java.util.List;

public class Bodega <T> {
     List<T> lista = new ArrayList<>();
     public void add(T objeto){
         lista.add(objeto);
     }
     public List<T> getLista(){
         return lista;
     }
}
