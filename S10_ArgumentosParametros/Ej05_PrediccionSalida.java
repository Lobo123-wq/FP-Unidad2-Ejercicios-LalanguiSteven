/*
 * Sesion: S10 - Argumentos y parametros
 * Ejercicio: 05 - Prediccion de salida
 * Enunciado: Realizar tres llamadas a metodos, escribir la salida predicha en un comentario y mostrar la salida real.
 * Autor: Lalangui
 * Fecha: 20/11/2026
 */

public class Ej05_PrediccionSalida {

    static void cambiarNumero(int numero) {
        numero = numero + 5;
        System.out.println("Dentro de cambiarNumero: " + numero);
    }

    static void modificarArreglo(int[] datos) {
        datos[0] = datos[0] * 2;
        System.out.println("Dentro de modificarArreglo: " + datos[0]);
    }

    static int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int numero = 10;
        int[] valores = {4, 6, 8};

        /*
         * SALIDA PREDICHA:
         * Dentro de cambiarNumero: 15
         * En main numero: 10
         * Dentro de modificarArreglo: 8
         * En main arreglo: 8
         * Resultado de sumar: 7
         */

        cambiarNumero(numero);
        System.out.println("En main numero: " + numero);

        modificarArreglo(valores);
        System.out.println("En main arreglo: " + valores[0]);

        System.out.println("Resultado de sumar: " + sumar(3, 4));
    }
}
