package clases;

public class CocaCola extends Bebida{
    public CocaCola(){
        super(TipoProducto.COCACOLA);
    }
    public String beber(){
        return "cocacola";
    }
}
