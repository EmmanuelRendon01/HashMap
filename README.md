# Ejercicios educativos con HashMap en Java

Este proyecto contiene ejemplos prácticos para aprender a usar la clase `HashMap` en Java. Los ejercicios están diseñados para estudiantes que desean comprender cómo funcionan los mapas y cómo se aplican en situaciones reales.

## ¿Qué es un HashMap?
Un `HashMap` es una estructura de datos que almacena pares clave-valor. Es útil para guardar información asociada, como nombres y notas de estudiantes, inventarios, etc.

## Operaciones principales que aprenderás
- **Crear y agregar elementos**: Añadir pares clave-valor al mapa.
- **Leer valores**: Consultar el valor asociado a una clave.
- **Actualizar valores**: Modificar el valor de una clave existente.
- **Eliminar elementos**: Quitar pares clave-valor del mapa.
- **Recorrer el mapa**: Iterar sobre todos los elementos para mostrar o modificar datos.
- **Otras operaciones útiles**: Comprobar existencia, modificar todos los valores, copiar mapas, etc.

## Archivos principales en `src`
- `Creacion.java`: Ejemplo de cómo crear y llenar un HashMap.
- `Diferencias.java`: Explicación de diferencias entre HashMap y otras estructuras.
- `Main.java`: Punto de entrada para ejecutar los ejemplos.
- `Metodos.java`: Ejemplos de los métodos más usados en HashMap.
- `Persona.java`: Clase personalizada para usar objetos en el mapa.
- `QueEs.java`: Explicación teórica sobre HashMap.

## Ejemplo básico
```java
HashMap<String, Integer> notas = new HashMap<>();
notas.put("Ana", 80);
notas.replaceAll((k, v) -> v + 5); // Suma 5 puntos a todas las notas
```

## ¿Cómo ejecutar?
1. Abre el proyecto en IntelliJ IDEA u otro IDE de Java.
2. Ejecuta el archivo `Main.java` para ver los ejemplos en acción.

---
Este proyecto está pensado para que aprendas de forma práctica y sencilla el uso de `HashMap` en Java.

