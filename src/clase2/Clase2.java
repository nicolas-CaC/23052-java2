package clase2;

import otroPaquete.ClasePrivada;

public class Clase2 {

    public static void main(String[] args) {

        Elementos variables = new Elementos("palabraaa");
        Elementos variables2 = new Elementos("palabrita");
        System.out.println(variables.getPalabra());
        
        variables.setPalabra("Cambiado");
        System.out.println(variables.getPalabra());
        System.out.println(variables2.getPalabra());
        
        // Estaticos
        System.out.println(Estaticas.telefono);
        System.out.println(Estaticas.getFrase());
        
        // Privados
        Privadas nuevasVariables = new Privadas();
        System.out.println(nuevasVariables.getNumeroPrivado());

        // Otro paquete
        ClasePrivada otraClase = new ClasePrivada();
        System.out.println(otraClase.palabraPublica);
        System.out.println(otraClase.getValores()[0] + " " + otraClase.getValores()[1]);
    }

}
