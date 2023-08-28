package conversiones;

public class ConversionDeInformacion extends Conversion{
    
    //Valores en terminos de Bytes a otras unidades
    
    public ConversionDeInformacion(){
        super();
        super.addValoresConversion("BYTE", 1.0);
        super.addValoresConversion("KILOBYTE", 1024.0);
        super.addValoresConversion("MEGABYTE", Math.pow(1024, 2));
        super.addValoresConversion("GIGABYTE", Math.pow(1024, 3));
        super.addValoresConversion("TERABYTE", Math.pow(1024, 4));
    }
    
    @Override
    public double convertir(String infoOriginal, String infoAConvertir, double cantidad) {        
        double factorConversion = super.getValoresConversion(infoOriginal) / super.getValoresConversion(infoAConvertir);
        return cantidad * factorConversion;
    }
}
