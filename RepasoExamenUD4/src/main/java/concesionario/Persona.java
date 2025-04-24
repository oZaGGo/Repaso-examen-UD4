package concesionario;

import utilidades.Formateador;

import java.util.Objects;

public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected String dni;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String dni) {
        this.nombre = Formateador.nameFormatter(nombre);
        this.apellido = Formateador.nameFormatter(apellido);
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "concesionario.Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(dni, persona.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }
}
