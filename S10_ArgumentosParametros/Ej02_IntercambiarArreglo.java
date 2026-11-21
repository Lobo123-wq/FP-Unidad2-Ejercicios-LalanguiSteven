/*
 * Sesion: S10 - Argumentos y parametros
 * Ejercicio: 02 - Intercambiar arreglo
 * Enunciado: Intercambiar dos posiciones de un arreglo mediante un metodo.
 * Autor: Lalangui
 * Fecha: 20/11/2026
 */

import java.util.Arrays;

public class Ej02_IntercambiarArreglo {

    static void intercambiar(int[] v, int i, int j) {
        int temporal = v[i];
        v[i] = v[j];
        v[j] = temporal;
    }

    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};

        System.out.println("Arreglo antes: " + Arrays.toString(numeros));

        intercambiar(numeros, 1, 3);

        System.out.println("Arreglo despues: " + Arrays.toString(numeros));

        /*
         * Ahora si funciona porque el metodo recibe una copia de la
         * referencia al mismo arreglo. Por eso puede modificar sus elementos.
         */
    }
}
