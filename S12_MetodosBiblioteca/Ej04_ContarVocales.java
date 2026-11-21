/*
 * Sesion: S12 - Metodos de biblioteca
 * Ejercicio: 04 - Contar vocales
 * Enunciado: Contar las vocales de una frase utilizando String y Character, incluyendo mayusculas y minusculas.
 * Autor: Lalangui
 * Fecha: 20/11/2026
 */

import java.util.Scanner;

public class Ej04_ContarVocales {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = entrada.nextLine();

        int a = 0, e = 0, i = 0, o = 0, u = 0;

        for (int posicion = 0; posicion < frase.length(); posicion++) {
            char caracter = Character.toLowerCase(frase.charAt(posicion));

            if (caracter == 'a') {
                a++;
            } else if (caracter == 'e') {
                e++;
            } else if (caracter == 'i') {
                i++;
            } else if (caracter == 'o') {
                o++;
            } else if (caracter == 'u') {
                u++;
            }
        }

        int total = a + e + i + o + u;

        System.out.println("Vocal a: " + a);
        System.out.println("Vocal e: " + e);
        System.out.println("Vocal i: " + i);
        System.out.println("Vocal o: " + o);
        System.out.println("Vocal u: " + u);
        System.out.println("Total de vocales: " + total);

        entrada.close();
    }
}
