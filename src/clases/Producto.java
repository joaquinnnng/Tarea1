package clases;

public abstract class Producto {
    public enum TipoProducto{
        COCACOLA(500),
        SPRITE(500),
        FANTA(500),
        SNICKERS(300),
        SUPER8(100);

        private int precio;

        TipoProducto(int precio){
            this.precio=precio;
        }

        public int getPrecio(){
            return precio;
        }
    }

    private TipoProducto producto;

    public Producto(TipoProducto p){
        producto=p;
    }

    public TipoProducto getTipo(){
        return producto;
    }

}
