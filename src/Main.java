import clases.*;


public class Main {
    public static void main(String[] args) {
        Expendedor exp = new Expendedor(5);
        Moneda1000 luca = new Moneda1000();
        Moneda500 quina = new Moneda500();
        Moneda100 gamba = new Moneda100();
        C:\Users\joaqu\IdeaProjects\tarea1
        try{
            Dulce comprado = exp.comprarDulce(quina,5);
            System.out.println("me comi un: " + comprado.comer() + " y me sobro: " + (exp.getVuelto().getValor()*4));//probando que expendedor funcione
            Comprador prueba2 = new Comprador(gamba,1,exp);
            System.out.println("Compraste: "+ prueba2.queConsumiste() + " y tu vuelto es de: " + prueba2.cuantoVuelto());
            Comprador prueba3 = new Comprador(gamba,2,exp);
            System.out.println("Compraste: " + prueba3.queConsumiste() + " y tu vuelto es de. " + prueba3.cuantoVuelto());
            Comprador prueba = new Comprador(null,4,exp);
        } catch (PagoIncorrectoException e) { //este catch entra solo cuando las monedas ingresadas son null, el otro tipo de pago incorrecto lo atrapa expendedor.
            System.out.println("Error: "+ e.getMessage());
        } catch (NoHayProductoException e) { //este catch entra solo cuando el producto que se intenta comprar se acabo.
            System.out.println("Erorr: "+ e.getMessage());
        }

    }
}