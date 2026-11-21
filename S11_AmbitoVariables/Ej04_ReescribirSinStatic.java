/*
 * Sesion: S11 - Ambito de variables
 * Ejercicio: 04 - Reescribir sin static
 * Enunciado: Mostrar una version original que usa atributos static y reescribirla utilizando parametros y return.
 * Autor: Lalangui
 * Fecha: 20/11/2026
 */

public class Ej04_ReescribirSinStatic {

    /*
     * VERSION ORIGINAL:
     * Se utilizan atributos static para compartir datos entre metodos.
     *
     * static double precio = 50.0;
     * static double descuento = 10.0;
     * static double total;
     *
     * static void calcular() {
     *     total = precio - (precio * descuento / 100);
     * }
     */

    // NUEVA VERSION: los datos se reciben mediante parametros.
    static double calcularTotal(double precio, double descuento) {
        double total = precio - (precio * descuento / 100);
        return total;
    }

    static void mostrarResultado(double precio, double descuento, double total) {
        System.out.println("Precio original: " + precio);
        System.out.println("Descuento: " + descuento + "%");
        System.out.println("Total a pagar: " + total);
    }

    public static void main(String[] args) {
        double precio = 50.0;
        double descuento = 10.0;

        double total = calcularTotal(precio, descuento);
        mostrarResultado(precio, descuento, total);
    }
}
