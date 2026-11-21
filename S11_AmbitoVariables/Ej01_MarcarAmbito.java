/*
 * Sesion: S11 - Ambito de variables
 * Ejercicio: 01 - Marcar ambitos
 * Enunciado: Identificar mediante comentarios las variables locales, de bloque y el atributo static.
 * Autor: Lalangui
 * Fecha: 20/11/2026
 */

public class Ej01_MarcarAmbito {

    static int contador = 0; // STATIC: atributo de la clase, compartido.

    static int calcularCuadrado(int numero) {
        contador++; // STATIC: se puede consultar desde los metodos static.
        int resultado = numero * numero; // LOCAL: existe solo en este metodo.
        return resultado;
    }

    public static void main(String[] args) {
        int suma = 0; // LOCAL: existe dentro de main.

        for (int i = 1; i <= 4; i++) { // i es DE BLOQUE: pertenece al for.
            suma += calcularCuadrado(i);
        }

        System.out.println("Suma de cuadrados: " + suma);
        System.out.println("Cantidad de llamadas: " + contador);

        // i no se puede utilizar aqui porque ya termino el bloque for.
        // resultado tampoco se puede utilizar aqui porque es local del metodo.
    }
}
