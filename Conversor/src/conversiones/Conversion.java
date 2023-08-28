package conversiones;

import java.util.HashMap;
import java.util.Map;


public class Conversion {
    
    protected Map<String, Double> valoresConversion = new HashMap<>();
    
    public double convertir(String infoOriginal, String infoAConvertir, double cantidad){
        return 0;
    }

    public Map<String, Double> getValoresConversion() {
        return valoresConversion;
    }
    
    public boolean esValorValido(String key){
        return valoresConversion.containsKey(key);
    }
    
    public void addValoresConversion(String key, double valor) {
        this.valoresConversion.put(key, valor);
    }
    
     public double getValoresConversion(String key) {
        return this.valoresConversion.get(key);
    }
    
}
