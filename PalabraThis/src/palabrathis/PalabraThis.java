package palabrathis;
public class PalabraThis {

    public static void main(String[] args) {
       Persona persona = new Persona("Juan", "Perez");
        System.out.println("persona = " + persona);
        System.out.println("persona = " + persona.nombre);
        System.out.println("persona = " + persona.apellido);
    }    
}

class Persona{
    String nombre;
    String apellido;
    
    Persona(String nombre, String apellido){ //AQUI SE CREAN PLANTILLAS
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Objetos persona usando this: " + this);
    }
}