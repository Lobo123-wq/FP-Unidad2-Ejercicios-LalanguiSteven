/*
 * Sesion: S12 - Metodos de biblioteca
 * Ejercicio: 05 - Codigo de 6 caracteres
 * Enunciado: Generar un codigo de seis caracteres: tres letras aleatorias y tres digitos aleatorios.
 * Autor: Lalangui
 * Fecha: 20/11/2026
 */

import java.util.Random;

public class Ej05_GenerarCodigo {

    public static void main(String[] args) {
        Random azar = new Random();
        String codigo = "";

        // Generar tres letras mayusculas aleatorias.
        for (int i = 1; i <= 3; i++) {
            char letra = (char) ('A' + azar.nextInt(26));
            codigo += letra;
        }

        // Generar tres digitos aleatorios.
        for (int i = 1; i <= 3; i++) {
            int digito = azar.nextInt(10);
            codigo += digito;
        }

        System.out.println("Codigo generado: " + codigo);
    }
}
