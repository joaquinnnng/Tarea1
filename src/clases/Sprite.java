package clases;

public class Sprite extends Bebida{
    public Sprite(){
        super(TipoProducto.SPRITE);
    }
    public String beber(){
        return "sprite";
    }
}
