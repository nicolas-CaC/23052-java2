package otroPaquete;

public class ClasePrivada {

    String palabra = "medianera";
    public String palabraPublica = "pared publica";
    private int numeroPrivado = 456;
    
    /**
     * Este metodo va a devolver valores
     * @return Esto me devuelve un array de strings
     */
    public String[] getValores() {
        String[] palabras = {palabra, palabraPublica};
        return palabras;
    }
    
    /**
     * Es un metodo al cuete
     * @param palabra Pasale una palabra
     * @return devuelve la misma palabra
     */
    public String dameUnaPalabra(String palabra){
        return palabra;
    }
}
