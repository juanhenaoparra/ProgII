package prototipocaso1;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Carlos Cuesta Iglesias
 */
public class Util {

    /**
     * Rellena una cadena con espacios a la derecha
     *
     * @param text El texto que se va a rellenar con blancos
     * @param length La longitud con la que debe quedar la cadena
     * @return La cadena con espacios agregados
     */
    public static String rightPad(String text, int length) {
        return String.format("%-" + length + "." + length + "s", text);
    }

    /**
     * Rellena una cadena con espacios a la derecha
     *
     * @param text El texto que se va a rellenar con blancos
     * @param length La longitud con la que debe quedar la cadena
     * @return La cadena con espacios agregados
     */
    public static String leftPad(String text, int length) {
        return String.format("%" + length + "." + length + "s", text);
    }

    /**
     * Convierte un objeto de tipo Calendar en un string que corresponde a la fecha
     * @param fecha una instancia de tipo Calendar con una fecha válida
     * @return El string en formato AAAA-MM-DD, correspondiente a la fecha ingresada como argumento
     */
    public static String strFecha(Calendar fecha) {
        return (new SimpleDateFormat("yyyy-MM-dd")).format(fecha.getTime());
    }

}
