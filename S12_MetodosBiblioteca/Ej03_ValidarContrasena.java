/*
 * Sesion: S12 - Metodos de biblioteca
 * Ejercicio: 03 - Validar contrasena
 * Enunciado: Validar que una contrasena tenga minimo 8 caracteres, una mayuscula y un digito usando Character.
 * Autor: Lalangui
 * Fecha: 20/11/2026
 */

import java.util.Scanner;

public class Ej03_ValidarContrasena {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese una contrasena: ");
        String contrasena = entrada.nextLine();

        boolean tieneMayuscula = false;
        boolean tieneDigito = false;

        for (int i = 0; i < contrasena.length(); i++) {
            char caracter = contrasena.charAt(i);

            if (Character.isUpperCase(caracter)) {
                tieneMayuscula = true;
            }

            if (Character.isDigit(caracter)) {
                tieneDigito = true;
            }
        }

        boolean longitudCorrecta = contrasena.length() >= 8;

        if (longitudCorrecta && tieneMayuscula && tieneDigito) {
            System.out.println("Contrasena valida.");
        } else {
            System.out.println("Contrasena no valida.");
            System.out.println("Debe tener minimo 8 caracteres, una mayuscula y un digito.");
        }

        entrada.close();
    }
}
