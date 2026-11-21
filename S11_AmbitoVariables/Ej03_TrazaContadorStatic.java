/*
 * Sesion: S11 - Ambito de variables
 * Ejercicio: 03 - Traza del contador static
 * Enunciado: Crear un programa con contador static llamado desde un for e incluir una tabla de variables vivas y valor.
 * Autor: Lalangui
 * Fecha: 20/11/2026
 */

public class Ej03_TrazaContadorStatic {

    static int contador = 0; // Atributo static: conserva su valor entre llamadas.

    static void registrarLlamada(int numero) {
        contador++;
        System.out.println("Llamada " + numero + ", contador = " + contador);
    }

    public static void main(String[] args) {
        int suma = 0;

        for (int i = 1; i <= 3; i++) {
            registrarLlamada(i);
            suma += i;
        }

        System.out.println("Suma: " + suma);
        System.out.println("Contador final: " + contador);

        /*
         * TRAZA: linea | variables vivas | valor
         * Inicio main | suma, contador | 0, 0
         * Primera vuelta | suma, i, contador, numero | 1, 1, 1, 1
         * Segunda vuelta | suma, i, contador, numero | 3, 2, 2, 2
         * Tercera vuelta | suma, i, contador, numero | 6, 3, 3, 3
         * Fin del for | suma, contador | 6, 3
         *
         * i solo existe dentro del for; numero solo existe en el metodo
         * registrarLlamada; contador es static y conserva su valor.
         */
    }
}
