/*
 * Sesion: S12 - Metodos de biblioteca
 * Ejercicio: 02 - Dados que suman 7
 * Enunciado: Realizar 1000 lanzamientos de dos dados con Random, contar las sumas iguales a 7 y mostrar el porcentaje.
 * Autor: Lalangui
 * Fecha: 20/11/2026
 */

import java.util.Random;

public class Ej02_DadosSuman7 {

    public static void main(String[] args) {
        Random azar = new Random();
        int exitos = 0;
        int lanzamientos = 1000;

        for (int i = 1; i <= lanzamientos; i++) {
            int dado1 = azar.nextInt(6) + 1;
            int dado2 = azar.nextInt(6) + 1;

            if (dado1 + dado2 == 7) {
                exitos++;
            }
        }

        double porcentaje = (exitos * 100.0) / lanzamientos;

        System.out.println("Lanzamientos realizados: " + lanzamientos);
        System.out.println("Veces que la suma fue 7: " + exitos);
        System.out.printf("Porcentaje: %.2f%%%n", porcentaje);
    }
}
