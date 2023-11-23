
package pasoporreferencia;

import clases.Persona;

public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona();   
        persona1.nombre = "Luis";
        System.out.println("persona1 nombre = " + persona1.nombre);
        persona1 = cambiaValor(persona1);
        System.out.println("persona1 nuevo nombre = " + persona1.nombre);
    }
    
    
    
    // METODO:
    
    //                                     Tipo   Nombre variable
        public static Persona cambiaValor(Persona persona){
        persona.nombre = "Hiram";
        return persona;
    }
}
