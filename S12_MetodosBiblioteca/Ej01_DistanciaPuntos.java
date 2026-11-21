/*
 * Sesion: S12 - Metodos de biblioteca
 * Ejercicio: 01 - Distancia entre dos puntos
 * Enunciado: Calcular la distancia entre dos puntos utilizando Math.sqrt y Math.pow.
 * Autor: Lalangui
 * Fecha: 20/11/2026
 */

import java.util.Locale;

public class Ej01_DistanciaPuntos {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double x1 = 2;
        double y1 = 3;
        double x2 = 7;
        double y2 = 6;

        double distancia = Math.sqrt(
                Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.printf("Distancia entre los puntos: %.2f%n", distancia);
    }
}
