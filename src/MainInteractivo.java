import java.util.Scanner;
import clases.*;
import java.util.Random;

public class MainInteractivo {
    public static void main(String[] args){
        Random rand = new Random();
        int random = rand.nextInt(2);
        Moneda m = null;

        switch (random){
            case(0):
                m = new Moneda500();
                break;
            case(1):
                m = new Moneda1000();
                break;
        }


        System.out.println(
                "Se le encargo comprar pan y llegar con este y el vuelto a la casa.\n" +
                "Usted compra el pan pero ve que en el negocio tambien agregaron una nueva maquina expendedora,\n"+
                "a usted le encanta hacer caso, pero esa maquina estaba nueva y alguien tiene que probarla.\n"+
                "Por suerte hoy usted puede ser ese alguien pues le sobraron: " + m.getValor() +" pesos de la compra\n"+
                "Asi es que tiene la opcion de comprar alguno de estos productos: "
        );

    }
}
