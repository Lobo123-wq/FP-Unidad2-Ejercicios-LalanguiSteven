/*
 * Sesion: S10 - Argumentos y parametros
 * Ejercicio: 03 - Aplicar descuento
 * Enunciado: Crear aplicarDescuento(double[] precios, double pct), modificar el arreglo e imprimirlo antes y despues.
 * Autor: Lalangui
 * Fecha: 20/11/2026
 */

import java.util.Arrays;
import java.util.Locale;

public class Ej03_AplicarDescuento {

    static void aplicarDescuento(double[] precios, double pct) {
        for (int i = 0; i < precios.length; i++) {
            precios[i] = precios[i] - (precios[i] * pct / 100);
        }
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double[] precios = {10.00, 25.50, 40.00, 100.00};
        double porcentaje = 15;

        System.out.println("Precios antes del descuento: "
                + Arrays.toString(precios));

        aplicarDescuento(precios, porcentaje);

        System.out.println("Precios despues del " + porcentaje + "% de descuento: "
                + Arrays.toString(precios));
    }
}
