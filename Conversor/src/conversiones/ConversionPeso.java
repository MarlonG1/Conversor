package conversiones;

public class ConversionPeso extends Conversion {

    //Valores en terminos de Gramos a otras unidades
    
    public ConversionPeso(){
        super();
        super.addValoresConversion("GRAMOS",  1.0);
        super.addValoresConversion("ONZAS", 0.03527396);
        super.addValoresConversion("LIBRAS", 0.00220462);
        super.addValoresConversion("KILOGRAMOS", 0.001);
        super.addValoresConversion("TONELADAS", 1e-6);
    }
    
    @Override
    public double convertir(String pesoOriginal, String pesoAConvertir, double cantidad) {        
        double factorConversion = super.getValoresConversion(pesoAConvertir) / super.getValoresConversion(pesoOriginal);
        return cantidad * factorConversion;
    }
}
