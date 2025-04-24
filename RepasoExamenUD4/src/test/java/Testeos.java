import concesionario.*;
import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class Testeos {
    @Test
    void tests() throws Exception{

        //Creo un cliente

        Cliente ivan = new Cliente("Ivan", "Diaz Miragaya","66666666x",500000);

        System.out.println("CLIENTE: ");

        System.out.println(ivan.toString());

        System.out.println();

        //Creo unas marcas

        Marca mercedes = new Marca("Mercedes");
        Marca bmw = new Marca("BMW");
        Marca ford = new Marca("Ford");

        //Creo coches

        Coche coche1 = new Coche(mercedes,"SSL220", Combustible.GASOLINA);
        Coche coche2 = new Coche(mercedes,"SSL320", Combustible.GASOLINA);
        Coche coche3 = new Coche(ford,"Fiesta", Combustible.GASOLINA);
        Coche coche4 = new Coche(bmw,"e45", Combustible.ELECTRICO);

        //Creo el concesionario

        Concesionario concesionario = new Concesionario("gran turismo");

        //Añado coches al concesionario

        concesionario.insertarCocheDisponible(coche1,80000);
        concesionario.insertarCocheDisponible(coche2,50000);
        concesionario.insertarCocheDisponible(coche3,20000);
        concesionario.insertarCocheDisponible(coche4,6000);

        System.out.println("CONCESIONARIO: ");

        System.out.println(concesionario.toString());

        System.out.println();

        //Comprar un coche

        concesionario.comprarCoche(coche2,50000,ivan);

        //Comprar otros

        concesionario.comprarCoche(coche4,6000,ivan);
        concesionario.comprarCoche(coche1,80000,ivan);

        System.out.println("RESULTADO DE HACER LAS COMPRAS:");

        System.out.println(concesionario.toString());

        System.out.println(ivan.toString());

        System.out.println();

        //Podemos imprimir las transacciones de forma ordenada

        HashMap<Cliente, List<String>> transacciones = concesionario.getTransacciones();

        concesionario.imprimirHistorial();

        //Imprimir con iterator

        Iterator<Cliente> i = transacciones.keySet().iterator();

        System.out.println("TRANSACCIONES USANDO ITERATOR:");
        while (i.hasNext()){
            Cliente aux = i.next();
            System.out.println("Cliente: " + aux.getNombre() + " " + aux.getApellido());
            for (String value : transacciones.get(aux)){
                System.out.println(value);
            }
        }
        System.out.println();


        //Imprimir el historial del cliente

        ivan.imprimirHistorial();

        Assertions.assertEquals(1,1);
    }
}
