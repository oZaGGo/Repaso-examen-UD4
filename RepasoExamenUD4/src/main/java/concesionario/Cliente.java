package concesionario;

import java.util.ArrayList;

public class Cliente extends Persona{
    private ArrayList<Coche> coches = new ArrayList<>();

    public Cliente(String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);
    }

    public void insertarCoche(Coche coche){
        coches.add(coche);
    }

    public ArrayList<Coche> getCoches() {
        return coches;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "coches=" + coches +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }
}
