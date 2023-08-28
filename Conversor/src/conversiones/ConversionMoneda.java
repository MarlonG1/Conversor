package conversiones;

public class ConversionMoneda extends Conversion {

    //Valores en terminos de Dolar (Moneda de mi pais) a otras unidades
    //Valores a fecha de Agosto 2023, suceptible a cambios -> Rectificar los valores a la fecha en que lo uses
    
    public ConversionMoneda() {
        super();
        super.addValoresConversion("DOLAR", 1.0);
        super.addValoresConversion("PESO MEXICANO", 16.82);
        super.addValoresConversion("EURO", 0.93);
        super.addValoresConversion("LIBRA", 0.79);
        super.addValoresConversion("WON SURCOREANO", 1327.45);
        super.addValoresConversion("YEN", 145.85);
    }

    @Override
    public double convertir(String divisaOriginal, String divisaAConvertir, double cantidad) {
        double cantidadEnDivisaBase = cantidad / super.getValoresConversion(divisaOriginal);
        return cantidadEnDivisaBase * super.getValoresConversion(divisaAConvertir);
    }

}
