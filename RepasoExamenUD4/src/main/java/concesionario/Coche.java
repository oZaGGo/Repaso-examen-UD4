package concesionario;

import java.util.Comparator;

public class Coche implements Comparable<Coche> {
    private Marca marca;
    private String modelo;
    private Combustible combustible;

    public Coche() {
    }

    public Coche(Marca marca, String modelo, Combustible combustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.combustible = combustible;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    @Override
    public int compareTo(Coche o) {
        return this.getMarca().getNombre().compareTo(o.getMarca().getNombre()); //Ordenar por nombre de marca
    }
}
