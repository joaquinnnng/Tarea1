package clases;

public class Comprador{
    private String sonido;
    private int vuelto;

    public Comprador(Moneda m, int cual, Expendedor exp) throws PagoIncorrectoException, NoHayProductoException{
        if(m==null){
            sonido = null;
            vuelto = 0;
            throw new PagoIncorrectoException("No se ingreso una moneda");

        }else if((cual!=1 && cual!=2 && cual!=3 && cual!=4 && cual!=5)){
            sonido = null;
            vuelto = m.getValor();
            return;
        }

        Bebida b = null;
        Dulce d = null;
        int suma = 0;
        Moneda v = null;

        switch(cual){
            case 1:
                try{
                    b = exp.comprarBebida(m,cual);
                    if(b==null){
                        vuelto = m.getValor();
                        sonido = null;
                        throw new NoHayProductoException("Producto agotado");
                    }
                    sonido = b.beber();
                    suma = 0;
                    v = null;
                    while ((v = exp.getVuelto()) != null) { //sacamos el vuelto
                        suma = suma + v.getValor();
                    }
                    vuelto = suma;
                } catch (PagoIncorrectoException e) {
                    sonido=null;
                    vuelto=m.getValor();
                    System.out.println("Error:" + e.getMessage());
                }

                break;

            case 2:
                try{
                    b = exp.comprarBebida(m,cual);
                    if(b==null){
                        vuelto = m.getValor();
                        sonido = null;
                        throw new NoHayProductoException("Producto agotado");
                    }
                    sonido = b.beber();
                    suma = 0;
                    v = null;
                    while ((v = exp.getVuelto()) != null) { //sacamos el vuelto
                        suma = suma + v.getValor();
                    }
                    vuelto = suma;
                }catch(PagoIncorrectoException e){
                    sonido=null;
                    vuelto=m.getValor();
                    System.out.println("Error: " + e.getMessage());
                }
                break;
            case 3:
                try {
                    b = exp.comprarBebida(m, cual);
                    if (b == null) {
                        vuelto = m.getValor();
                        sonido = null;
                        throw new NoHayProductoException("Producto agotado");
                    }
                    sonido = b.beber();
                    suma = 0;
                    v = null;
                    while ((v = exp.getVuelto())!=null) {
                        suma = suma + v.getValor();
                    }
                    vuelto = suma;
                }catch (PagoIncorrectoException e){
                    sonido=null;
                    vuelto=m.getValor();
                    System.out.println("Error: " + e.getMessage());
                }
                break;
            case 4:
                try {
                    d = exp.comprarDulce(m,cual);
                    if (d == null) {
                        sonido = null;
                        vuelto = m.getValor();
                        throw new NoHayProductoException("Producto agotado");
                    }
                    sonido = d.comer();
                    suma = 0;
                    v = null;
                    while ((v = exp.getVuelto()) != null) { //sacamos el vuelto
                        suma = suma + v.getValor();
                    }
                    vuelto = suma;
                }catch (PagoIncorrectoException e){
                    vuelto=m.getValor();
                    sonido=null;
                    System.out.println("Error: " +e.getMessage());

                }
                break;
            case 5:
                try {
                    d = exp.comprarDulce(m, cual);
                    if (d == null) {
                        sonido = null;
                        vuelto = m.getValor();
                        throw new NoHayProductoException("Producto agotado");
                    }
                    sonido = d.comer();
                    suma = 0;
                    v = null;
                    while ((v = exp.getVuelto()) != null) { //sacamos el vuelto
                        suma = suma + v.getValor();
                    }
                    vuelto = suma;
                }catch (PagoIncorrectoException e){
                    sonido=null;
                    vuelto=m.getValor();
                    System.out.println("Error: " + e.getMessage());
                }

                break;
        }
    }
    public int cuantoVuelto(){
        return vuelto;
    }

    public String queConsumiste(){
        return sonido;
    }
}

