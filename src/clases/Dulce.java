package clases;

public abstract class Dulce extends Producto{
    public Dulce(TipoProducto p){
        super(p);
    }
    public abstract String comer();
}
