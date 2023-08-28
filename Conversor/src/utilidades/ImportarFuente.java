package utilidades;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import java.io.InputStream;

public class ImportarFuente {

    public static Font loadFont(String ruta, float tamanio, int estilo) {
        try {
            InputStream fs = ImportarFuente.class.getResourceAsStream(ruta);
            Font fuente = Font.createFont(Font.TRUETYPE_FONT, fs);
            return fuente.deriveFont(estilo,tamanio);
        } catch (FontFormatException | IOException e) {
            return new Font("Arial", Font.PLAIN, (int) tamanio);
        }
    }
}
