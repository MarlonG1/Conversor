package conversiones;

public class ConversionTemperatura extends Conversion{

    //Valores en terminos de grados de punto de congelacion del agua
    
    public ConversionTemperatura(){
        super();
        
        super.addValoresConversion("CELSIUS", 0.0);
        super.addValoresConversion("FARENHEIT", 32.0);
        super.addValoresConversion("KELVIN", 273.15);
    }

    @Override
    public double convertir(String tempOriginal, String tempAConvertir, double cantidad) {
        String tipoDeConversion = tempOriginal + "_A_" + tempAConvertir;
        double cantidadAConvertir = cantidad;

        switch (tipoDeConversion) {
            case "CELSIUS_A_FARENHEIT" -> { return (cantidadAConvertir * 9/5) + super.getValoresConversion(tempAConvertir); }
            case "CELSIUS_A_KELVIN" ->  { return cantidadAConvertir + super.getValoresConversion(tempAConvertir); }
            case "FARENHEIT_A_CELSIUS" ->  { return (cantidadAConvertir - super.getValoresConversion(tempOriginal)) * 5/9; }
            case "FARENHEIT_A_KELVIN" ->  { return (cantidadAConvertir + 459.67) * 5/9; }
            case "KELVIN_A_CELSIUS" ->  { return cantidadAConvertir - super.getValoresConversion(tempOriginal); }
            case "KELVIN_A_FARENHEIT" ->  { return (cantidadAConvertir * 9/5) - 459.67; }
        }
        return 0;
    }
}
