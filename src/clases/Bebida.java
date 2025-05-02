package clases;

public abstract class Bebida extends Producto{
    public Bebida(TipoProducto p){
        super(p);
    }

    public abstract String beber();
}
