import java.util.HashMap;

public class QueEs {
    public void queEs(){
        // ==============================
        // 1. ¿Qué es un HashMap?
        // ==============================

        // Un HashMap es una estructura de datos que guarda pares clave → valor.
        // Permite acceder rápidamente a los valores mediante una función hash.
        // Ejemplo: como una libreta de contactos (nombre → número).

        // ¿Por qué se llama HashMap?

        // Viene de la funcion hash, una operación matemática que toma una clave y la transforma en un número entero (un índice). Ese índice sirve para ubicar rápidamente dónde guardar o buscar el valor en memoria.
        
        // Map es la estrucura de datos que asocia pares clave-valor. Es decir, cada clave apunta a un valor.
        
        // Entonces, un HashMap es un Map que usa una función hash para organizar y acceder a sus elementos de forma muy rápida (normalmente en tiempo O(1)).

        HashMap<String, Integer> edades = new HashMap<>();
        edades.put("Ana", 20);
        edades.put("Luis", 25);

        System.out.println("Edad de Ana: " + edades.get("Ana")); // 20
    }
}
