import java.util.HashMap;

public class QueEs {
    public void queEs(){
        // ==============================
        // 1. ¿Qué es un HashMap?
        // ==============================

        // Un HashMap es una estructura de datos que guarda pares clave → valor.
        // Permite acceder rápidamente a los valores mediante una función hash.
        // Ejemplo: como una libreta de contactos (nombre → número).

        HashMap<String, Integer> edades = new HashMap<>();
        edades.put("Ana", 20);
        edades.put("Luis", 25);

        System.out.println("Edad de Ana: " + edades.get("Ana")); // 20
    }
}
