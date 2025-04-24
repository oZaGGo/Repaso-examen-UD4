package concesionario;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Cliente extends Persona{
    private ArrayList<Coche> coches = new ArrayList<>();
    private int saldo;
    private Stack<String> historialPagos = new Stack<>();

    public Cliente(String nombre, String apellido, String dni, int saldo) {
        super(nombre, apellido, dni);
        this.saldo = saldo;
    }

    public void insertarCoche(Coche coche){
        coches.add(coche);
    }

    public void insertarPago(String linea, Integer importe){
        historialPagos.push(linea);
        this.saldo-=importe;
    }

    public ArrayList<Coche> getCoches() {
        return coches;
    }

    public Stack<String> getHistorialPagos() {
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
