import java.util.HashMap;

public class Creacion {
    public void creacion(){
        // ==============================
        // 3. Qué debe tener un HashMap en su creación
        // ==============================

        // 1. Declaración: especificar tipo de clave y valor
        HashMap<String, Integer> mapa = new HashMap<>();

        // 2. La clave debe implementar equals() y hashCode()
        //    Ejemplo: si usamos una clase como clave, hay que sobrescribir esos métodos.

        // 3. Los valores pueden ser cualquier objeto (incluyendo otros HashMap).
        // 4. Los primitivos usan Wrappers (int → Integer, double → Double).
        // 5. Llaves únicas.
    }

}
