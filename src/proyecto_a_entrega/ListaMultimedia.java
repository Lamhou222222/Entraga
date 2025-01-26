package proyecto_a_entrega;
import java.util.ArrayList;
import proyecto_a_entrega.multimidia;


public class ListaMultimedia {
	// Atributos
    private multimidia[] lista;
    private int count;
    
 // Constructor
    public ListaMultimedia(int maxTamano) {
        this.lista = new multimidia[maxTamano];
        this.count = 0;
    }
    
  //metodo size
    public int size() {
        return this.count;
    }
    
   //metodo add
    public boolean add(multimidia m) {
        if (count < lista.length) {
            lista[count] = m;
            count++;
            return true;
        } else {
            return false;
        }
    }
    
    public multimidia get(int position) {
        if (position >= 0 && position < count) {
            return lista[position];
        } else {
            return null;
        }
    }
    
    //toString
    @Override
    public String toString() {
    	return "Lista Multimedia; "+lista;
    }
    
    
}
