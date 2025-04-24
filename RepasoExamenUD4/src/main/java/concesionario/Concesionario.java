package concesionario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Concesionario {
    private String nombre;
    private HashSet<Cliente> clientes = new HashSet<>(); //Los clientes se distinguen por DNI
    private HashMap<Coche,Integer> cochesDisponibles = new HashMap<>();
    private HashMap<String,Cliente> transacciones = new HashMap<>();

    public Concesionario() {
    }

    public Concesionario(String nombre) {
        this.nombre = nombre;
    }

    public void insertarCocheDisponible(Coche coche, Integer precio){
        cochesDisponibles.put(coche,precio); //Puede haber varios coches iguales
    }

    public void comprarCoche(Coche coche, Integer importe, Cliente cliente) throws Exception{

        //Buscar si el coche existe
        if (cochesDisponibles.containsKey(coche)){ //Si el coche existe
            if (cochesDisponibles.get(coche).equals(importe)){ //Si el importe se corresponde con el precio
                    //Comprar el coche
                    String mensaje = "Coche: " + coche.getMarca().getNombre() + " " + coche.getModelo() + " por " + importe + "€ el " + LocalDate.now();
                    clientes.add(cliente); //Si el mismo cliente compra 2 veces se añade solo 1 vez
                    transacciones.put(mensaje,cliente);
                    cochesDisponibles.remove(coche);
                    cliente.insertarCoche(coche); //Añadir el coche a la lista de coches del cliente
            }else {
                throw new Exception("El importe es erroneo! Introduce el importe para comprar el coche exacto.");
            }
        }else{
            throw new Exception("No tenemos ese coche!");
        }
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public HashSet<Cliente> getClientes() {
        return clientes;
    }

    public HashMap<Coche, Integer> getCochesDisponibles() {
        return cochesDisponibles;
    }

    public HashMap<String, Cliente> getTransacciones() {
        return transacciones;
    }

    @Override
    public String toString() {
        return "Concesionario{" +
                "nombre='" + nombre + '\'' +
                ", clientes=" + clientes +
                ", cochesDisponibles=" + cochesDisponibles +
                ", transacciones=" + transacciones +
                '}';
    }
}
