/*
 * Sesion: S11 - Ambito de variables
 * Ejercicio: 02 - Lineas que no compilan
 * Enunciado: Mostrar lineas con errores comentadas, indicando el mensaje del compilador y la causa.
 * Autor: Lalangui
 * Fecha: 20/11/2026
 */

public class Ej02_LineasNoCompilan {

    public static void main(String[] args) {
        int total = 0;

        for (int i = 1; i <= 3; i++) {
            total += i;
        }

        System.out.println("Total: " + total);

        // ERROR 1:
        // System.out.println(i);
        // Mensaje: cannot find symbol (no se encuentra el simbolo i).
        // Causa: i fue declarada dentro del for y no existe fuera del bloque.

        // ERROR 2:
        // System.out.println(resultado);
        // Mensaje: cannot find symbol (no se encuentra el simbolo resultado).
        // Causa: resultado no fue declarada en este metodo ni en este ambito.

        // ERROR 3:
        // int total = 100;
        // Mensaje: variable total is already defined in method main(String[]).
        // Causa: total ya fue declarada en el mismo ambito.

        // ERROR 4:
        // int promedio;
        // System.out.println(promedio);
        // Mensaje: variable promedio might not have been initialized.
        // Causa: una variable local debe recibir un valor antes de utilizarse.
    }
}
