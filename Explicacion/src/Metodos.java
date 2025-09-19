import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Metodos {
    // AGREGAR / ACTUALIZAR
    // put, putIfAbsent, replace
    public void agregarYReemplazar() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Ana", 20);

        map.putIfAbsent("Luis", 25);

        map.replace("Ana", 21);

        System.out.println("Agregar / Reemplazar → " + map);
    }

    // OBTENER
    // get
    public void obtenerValores() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Ana", 21);

        System.out.println("get → " + map.get("Ana")); // 21
        System.out.println("getOrDefault → " + map.getOrDefault("Pedro", 0)); // 0
    }

    // ELIMINAR
    public void eliminarClaves() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Ana", 20);
        map.put("Luis", 25);

        map.remove("Ana");
        map.remove("Luis", 25);
        System.out.println("Eliminar → " + map);
    }

    // COMPROBAR
    public void comprobarExistencia() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Ana", 21);

        System.out.println("containsKey → " + map.containsKey("Ana"));
        System.out.println("containsValue → " + map.containsValue(21));
    }

    // FOREACH
    public void recorrerConForEach() {
        HashMap<String, Integer> notas = new HashMap<>();
        notas.put("Ana", 80);
        notas.put("Luis", 90);

        notas.forEach((k, v) -> System.out.println(k + " → " + v));
    }

    // RECORRER CON entrySet
    public void recorrerConEntrySet() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Ana", 21);
        map.put("Luis", 25);

        // [ ("Ana"=21), ("Luis"=25) ]

        // keySet ["Ana", "Luis"]

        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
            entry.setValue(99); // modificar valor
        }
        System.out.println("Después de modificar con entrySet → " + map);

        /// ////////

        HashMap<Integer, Persona> personas = new HashMap<>();
        personas.put(1, new Persona("Ana", 20));
        personas.put(2, new Persona("Luis", 25));

        for (Map.Entry<Integer, Persona> entry : personas.entrySet()) {
            Persona p = entry.getValue();

            // Modificamos el objeto directamente
            p.edad += 1; // sumar 1 año

            // Si quieres, también puedes reemplazar el objeto completo
//             entry.setValue(new Persona(p.nombre, p.edad + 1));
        }

    }

    // ESTADO DEL MAPA
    public void estadoDelMapa() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Ana", 21);

        System.out.println("size → " + map.size());
        System.out.println("isEmpty → " + map.isEmpty());
        map.clear();
        System.out.println("Después de clear → " + map);
    }

    // REPLACEALL
    public void reemplazarTodos() {
        HashMap<String, Integer> notas = new HashMap<>();
        notas.put("Ana", 80);
        notas.put("Luis", 90);
        notas.put("Pedro", 70);

        notas.replaceAll((k, v) -> v + 5);
        System.out.println("replaceAll (+5 a todos) → " + notas);
    }

    // PUTALL
    public void copiarConPutAll() {
        HashMap<String, Integer> mapa1 = new HashMap<>();
        mapa1.put("Ana", 20);
        mapa1.put("Luis", 25);

        HashMap<String, Integer> mapa2 = new HashMap<>();
        mapa2.put("Pedro", 30);
        mapa2.put("Luis", 40); // clave repetida

        mapa1.putAll(mapa2);
        System.out.println("putAll (claves valor de mapa2 quedan dentro de mapa1) → " + mapa1);
    }

    // MERGE
    public void combinarConMerge() {
        HashMap<String, String> apodos = new HashMap<>();
        apodos.put("Pedro", "El rápido");

        apodos.merge("Pedro", " y furioso", (oldVal, newVal) -> oldVal + newVal);
        apodos.merge("Ana", "La lista", (oldVal, newVal) -> oldVal + newVal);

        System.out.println("merge → " + apodos);
    }

    // COMPUTEIFPRESENT
    public void actualizarSiExiste() {
        HashMap<String, Integer> inventario = new HashMap<>();
        inventario.put("Manzanas", 10);
        inventario.put("Peras", 5);

        inventario.computeIfPresent("Manzanas", (k, v) -> v + 5);
        inventario.computeIfPresent("Bananas", (k, v) -> v + 10);

        System.out.println("computeIfPresent → " + inventario);
    }
}
