# Taller de Recursividad en Java

## Estudiante
Harold Esteban Ariza Silva

## Descripción
Solución del taller de recursividad de Estructuras de Datos en Java. Cada uno
de los 14 ejercicios se resuelve con una función recursiva, identificando
en el código el caso base, el caso recursivo y la complejidad algorítmica
(Big O) de cada método.

Cada ejercicio está implementado como una clase independiente dentro del
paquete `recursividad`, con el método recursivo separado del `main`.

## Archivos del taller (orden del enunciado)

| # | Ejercicio | Archivo | Complejidad (tiempo) |
|---|---|---|---|
| 1 | Factorial | `Factorial.java` | O(n) |
| 2 | Invertir número | `InvertirNumeros.java` | O(log n) |
| 3 | Sumatoria 1 + 1/2 + ... + 1/n | `Sumatoria.java` | O(n) |
| 4 | Suma de dígitos | `SumaDigitos.java` | O(log n) |
| 5 | Sumatoria hasta el número leído | `SumatoriaHastaLeido.java` | O(n) |
| 6 | Potencia (base^exponente) | `Potencia.java` | O(exp) |
| 7 | M.C.D. (Euclides) | `MaximoComunDivisor.java` | O(log(min(m, n))) |
| 8 | Copiar una cadena en otra | `CopiarCadena.java` | O(n) |
| 9 | Cociente de división entera | `CocienteDivEntera.java` | O(a/b) |
| 10 | Multiplicación por sumas sucesivas | `MultiplicacionSumas.java` | O(b) |
| 11 | Suma de elementos de un arreglo | `SumaArreglo.java` | O(n) |
| 12 | Suma de elementos de una matriz | `SumaMatriz.java` | O(m·n) |
| 13 | Serie de Fibonacci | `Fibonacci.java` | O(2^n) |
| 14 | Función de Ackermann | `Ackermann.java` | Crece más rápido que exponencial |

## Instrucciones para ejecutar el programa
Tener JDK 17 o superior.

Desde la carpeta src del repositorio, compilar y ejecutar cada ejercicio de forma
individual. Por ejemplo, para el ejercicio 1 estar en el archivo y darle F5 o run java, si quiere correrlo desde la terminal seria:

```bash
cd src
javac -encoding UTF-8 recursividad/Factorial.java
java recursividad.Factorial
```

Para compilar todos los ejercicios de una vez:

```bash
cd src
javac -encoding UTF-8 recursividad/*.java
```

Cambiar `Factorial` por el nombre de la clase que se quiera ejecutar. Todos
los ejercicios piden los datos por teclado, así que el programa solicitará
los valores por consola al ejecutarlo.

Para el ejercicio 8 (`CopiarCadena`) se escribe una línea completa de texto,
y para los ejercicios 11 y 12 (`SumaArreglo` y `SumaMatriz`) primero se pide
el tamaño y luego cada elemento.

## Algunos problemas

- **Ackermann (ejercicio 14):** crece de forma explosiva. Con m = 3 y un n
  pequeño funciona, pero con m >= 4 casi siempre produce `StackOverflowError`.
- **Desbordamiento:** `Factorial` usa `long` y se desborda a partir de 21!;
  `InvertirNumeros` usa `int` y puede desbordarse con números de 10 dígitos.