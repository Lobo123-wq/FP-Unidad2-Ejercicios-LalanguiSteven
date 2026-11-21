/*
 * Sesion: S10 - Argumentos y parametros
 * Ejercicio: 04 - Sobrecarga de perimetro
 * Enunciado: Crear dos versiones sobrecargadas de perimetro: cuadrado y rectangulo, y llamarlas desde main.
 * Autor: Lalangui
 * Fecha: 20/11/2026
 */

import java.util.Locale;

public class Ej04_SobrecargaPerimetro {

    // Sobrecarga para calcular el perimetro de un cuadrado.
    static double perimetro(double lado) {
        return 4 * lado;
    }

    // Sobrecarga para calcular el perimetro de un rectangulo.
    static double perimetro(double a, double b) {
        return 2 * (a + b);
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double lado = 5;
        double base = 8;
        double altura = 3;

        System.out.printf("Perimetro del cuadrado: %.2f%n", perimetro(lado));
        System.out.printf("Perimetro del rectangulo: %.2f%n",
                perimetro(base, altura));
    }
}
