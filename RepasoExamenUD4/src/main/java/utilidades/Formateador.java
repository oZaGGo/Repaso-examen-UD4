package utilidades;

public class Formateador {
    public static String nameFormatter(String s){
        // Poner la primera letra en mayúsculas y el resto en minúsculas
        String[] palabras = s.split(" ");
        String output = "";

        for (String palabra : palabras) {
            if (palabra.length() > 0) {
                String inicial = palabra.substring(0, 1).toUpperCase();
                String continuacion = "";
                if (palabra.length() > 1) {
                    continuacion = palabra.substring(1).toLowerCase();
                }
                output += inicial + continuacion + " ";
            }
        }

        return output.trim(); // para quitar el espacio final
    }
}

