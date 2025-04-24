import concesionario.Cliente;
import concesionario.Coche;
import concesionario.Concesionario;
import concesionario.Marca;
import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class Testeos {
    @Test
    void tests() throws Exception{

        //Creo un cliente

        Cliente ivan = new Cliente("Ivan", "Diaz Miragaya","66666666x");

        System.out.println("CLIENTE: ");

        System.out.println(ivan.toString());

        System.out.println();

        //Creo unas marcas

        Marca mercedes = new Marca("Mercedes");
        Marca bmw = new Marca("BMW");
        Marca ford = new Marca("Ford");

        //Creo coches

        Coche coche1 = new Coche(mercedes,"SSL220");
        Coche coche2 = new Coche(mercedes,"SSL320");
        Coche coche3 = new Coche(ford,"Fiesta");
        Coche coche4 = new Coche(bmw,"e45");

        //Creo el concesionario

        Concesionario concesionario = new Concesionario("Gran Turismo");

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

        HashMap<String, Cliente> transacciones = concesionario.getTransacciones();

        for (String key : transacciones.keySet()){
            Cliente aux = transacciones.get(key);
            System.out.println("Cliente: " + aux.getNombre() + " " + aux.getApellido());
            System.out.println(key);
        }

        Assertions.assertEquals(1,1);
    }
}
