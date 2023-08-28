package conversiones;

public class ConversionDistancia extends Conversion{
    
    //Valores en terminos de Bytes a otras unidades
    
    public ConversionDistancia(){
        super();
        super.addValoresConversion("MILIMETRO", 1.0);
        super.addValoresConversion("CENTIMETRO", 10.0);
        super.addValoresConversion("METRO", 1000.0);
        super.addValoresConversion("KILOMETRO", 1e6);
        super.addValoresConversion("MILLA", 1.609e6);
    }
    
    @Override
    public double convertir(String distanciaOriginal, String distanciaAConvertir, double cantidad) {        
        double factorConversion = super.valoresConversion.get(distanciaOriginal) / super.valoresConversion.get(distanciaAConvertir);
        return cantidad * factorConversion;
    }
}
