package concesionario;

import java.util.*;

public class Cliente extends Persona{
    private ArrayList<Coche> coches = new ArrayList<>();
    private int saldo;
    private LinkedList<String> historialPagos = new LinkedList<>();

    public Cliente(String nombre, String apellido, String dni, int saldo) {
        super(nombre, apellido, dni);
        this.saldo = saldo;
    }

    public void insertarCoche(Coche coche){
        coches.add(coche);
    }

    public void insertarPago(String linea, Integer importe){
        historialPagos.addFirst(linea);
        this.saldo-=importe;
    }

    public ArrayList<Coche> getCoches() {
        return coches;
    }

    public LinkedList<String> getHistorialPagos() {
        return historialPagos;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        Collections.sort(coches);
        return "Cliente{" +
                "coches=" + coches +
                ", saldo=" + saldo +
                ", historialPagos=" + historialPagos +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }
}
