package clases;
/*
 * @author Hiram Molina
 */
public class Persona {
    
    //Atributos de la clase
    String nombre;
    String apellido;
    
    //Metodos
    /*Se usa public para indicar que se 
    puede usar desde fuera de esta clase*/
    public void desplegarInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
    }
    
}
