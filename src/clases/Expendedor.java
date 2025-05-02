package clases;

public class Expendedor {
    private Deposito<Bebida> coca;
    private Deposito<Bebida> fanta;
    private Deposito<Bebida> sprite;
    private Deposito<Dulce> snickers;
    private Deposito<Dulce> super8;
    private Deposito<Moneda> monVU;


    public Expendedor(int cantidadproducto) { //toda Bebida vale lo mismo y los Dulces tambien
        coca = new Deposito<Bebida>();  //creamos el deposito de cocacolas
        sprite = new Deposito<Bebida>();  //creamos el deposito de sprites
        fanta = new Deposito<Bebida>();  //creamos el deposito para las fantas
        snickers = new Deposito<Dulce>(); //creamos el deposito para los snickers
        super8 = new Deposito<Dulce>(); //creamos el deposito para los super8
        monVU = new Deposito<Moneda>(); //creamos el deposito de monedas vuelto

        for (int i = 0; i < cantidadproducto; i++) {
            CocaCola cocacolas = new CocaCola();
            coca.addElemento(cocacolas); //añade las coca colas al deposito de cocacola llamado coca, metodo addElemento() de clase Deposito
        }
        for (int i = 0; i < cantidadproducto; i++) {
            Fanta fantas = new Fanta();
            fanta.addElemento(fantas); //añade las fantas al deposito de fanta llamado fanta, metodo addElemento() de clase Deposito
        }
        for (int i = 0 ;i < cantidadproducto; i++){
            Sprite sprites = new Sprite();
            sprite.addElemento(sprites); //añade las sprites al deposito de sprite llamado sprite, metodo addElemento() de clase Deposito
        }

        for(int i = 0 ; i < cantidadproducto ; i++){
            Snickers snickeres = new Snickers();
            snickers.addElemento(snickeres); //añade los snickers al deposito de snickers llamado snickers, metodo addElemento() de clase Deposito
        }
        for(int i = 0 ; i < cantidadproducto ; i++){
            Super8 super8s = new Super8();
            super8.addElemento(super8s); //añade los super8s al deposito de super8 llamado super8, metodo addElemento() de clase Deposito
        }
    }
    //no programamos el caso en que la moneda sea null pues esa exception la maneja comprador
    //El unico exception que puede manejar expendedor es pago insuficiente
    public Bebida comprarBebida(Moneda m ,int cual) throws PagoIncorrectoException{
        switch (cual){
            case 1:
                if(m.getValor() < Producto.TipoProducto.COCACOLA.getPrecio()){
                    monVU.addElemento(m);
                    throw new PagoIncorrectoException("El dinero ingresado es insuficiente");
                }

                Bebida cola = coca.getElemento();
                if (cola != null) {
                    int vuelto = m.getValor() - Producto.TipoProducto.COCACOLA.getPrecio();
                    for (int i = 100; i <= vuelto; i = i + 100) {
                        Moneda100 gamba = new Moneda100();
                        monVU.addElemento(gamba);
                    }
                    return cola;

                } else {
                    monVU.addElemento(m);
                    return cola;
                }

            case 2:
                if(m.getValor()< Producto.TipoProducto.FANTA.getPrecio()){
                    monVU.addElemento(m);
                    throw new PagoIncorrectoException("El dinero ingresado es insuficiente");
                }
                Bebida naranja = fanta.getElemento();
                if(naranja!=null){
                    int vuelto = m.getValor()-Producto.TipoProducto.FANTA.getPrecio();
                    for(int i = 100; i<=vuelto ; i=i+100) {
                        Moneda100 gamba = new Moneda100();
                        monVU.addElemento(gamba);
                    }
                    return naranja;
                }else{
                    monVU.addElemento(m);
                    return naranja;
                }
            case 3:
                if(m.getValor()< Producto.TipoProducto.SPRITE.getPrecio()){
                    monVU.addElemento(m);
                    throw new PagoIncorrectoException("El dinero ingresado es insuficiente");
                }
                Bebida blanca = fanta.getElemento();
                if(blanca!=null){
                    int vuelto = m.getValor()-Producto.TipoProducto.FANTA.getPrecio();
                    for(int i = 100; i<=vuelto ; i=i+100) {
                        Moneda100 gamba = new Moneda100();
                        monVU.addElemento(gamba);
                    }
                    return blanca;
                }else{
                    monVU.addElemento(m);
                    return blanca;
                }
        }
        return null;
    }


    public Dulce comprarDulce(Moneda m ,int cual) throws PagoIncorrectoException{
        switch (cual) {
            case 4:
                if(m.getValor() < Producto.TipoProducto.SNICKERS.getPrecio()){
                    monVU.addElemento(m);
                    throw new PagoIncorrectoException("El dinero ingresado es insuficiente");
                }
                Dulce sneakers = snickers.getElemento();
                if (sneakers != null) {
                    int vuelto = m.getValor()-Producto.TipoProducto.SNICKERS.getPrecio();
                    for(int i = 100; i<=vuelto ; i=i+100) {
                        Moneda100 gamba = new Moneda100();
                        monVU.addElemento(gamba);
                    }
                    return sneakers;
                } else {
                    monVU.addElemento(m);
                    return sneakers;
                }

            case 5:
                if(m.getValor() < Producto.TipoProducto.SUPER8.getPrecio()){
                    monVU.addElemento(m);
                    throw new PagoIncorrectoException("El dinero ingresado es insuficiente");
                }
                Dulce super8s = super8.getElemento();
                if (super8s != null) {
                    int vuelto = m.getValor()-Producto.TipoProducto.SUPER8.getPrecio();
                    for(int i = 100; i<=vuelto ; i=i+100) {
                        Moneda100 gamba = new Moneda100();
                        monVU.addElemento(gamba);
                    }
                    return super8s;
                }else{
                    monVU.addElemento(m);
                    return null;
                }
        }
        return null;
    }

    public Moneda getVuelto(){
        return monVU.getElemento();
    }
}




