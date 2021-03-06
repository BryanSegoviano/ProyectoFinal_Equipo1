/**
 * Paquete util
 */
package util;

/**
 * Imports utilizados
 */
import dominio.ColorJ;

/**
 * Clase que establece la converción de los colores.
 *
 */
public class ConversionColores {

    /**
     * Metodo estatico que establece la conversion de colores.
     *
     * @param colorTexto Color al que se hara referencia en la comparación
     * @return Formato de los colores HEX
     */
    public static String conversionColorHex(ColorJ colorTexto) {
        if (colorTexto.equals(ColorJ.ROJO)) {
            return "#f51209";
        }
        if (colorTexto.equals(ColorJ.VIOLETA)) {
            return "#973598";
        }
        if (colorTexto.equals(ColorJ.NARANJA)) {
            return "#f38e34";
        }
        if (colorTexto.equals(ColorJ.AMARILLO)) {
            return "#f4f400";
        }
        if (colorTexto.equals(ColorJ.VERDE)) {
            return "#68cb3c";
        }
        if (colorTexto.equals(ColorJ.AZUL)) {
            return "#18d2e9";
        }
        if (colorTexto.equals(ColorJ.INDIGO)) {
            return "#0066cb";
        }

        return null;
    }

}
