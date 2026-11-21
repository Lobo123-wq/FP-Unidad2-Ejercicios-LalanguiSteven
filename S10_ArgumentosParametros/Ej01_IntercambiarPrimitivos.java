/*
 * Sesion: S10 - Argumentos y parametros
 * Ejercicio: 01 - Intercambiar primitivos
 * Enunciado: Intentar intercambiar dos variables int mediante un metodo y explicar el resultado.
 * Autor: Lalangui
 * Fecha: 20/11/2026
 */

public class Ej01_IntercambiarPrimitivos {

    static void intercambiar(int a, int b) {
        int temporal = a;
        a = b;
        b = temporal;

        System.out.println("Dentro del metodo:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Antes de intercambiar:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        intercambiar(a, b);

        System.out.println("Despues de llamar al metodo:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        /*
         * No funciona en las variables de main porque Java pasa los
         * valores primitivos por valor. El metodo recibe copias de a y b,
         * por eso el intercambio solo ocurre dentro del metodo.
         */
    }
}
