package clases;
import java.util.ArrayList;

public class Deposito<T>{
    private ArrayList<T> elementos;

    public Deposito(){
        elementos = new ArrayList<>();
    }

    public void addElemento(T cosa){
        elementos.add(cosa);
    }

    public T getElemento() {
        if (elementos.size()==0) {
            return null;
        } else {
            return elementos.remove(0);
        }
    }
}
