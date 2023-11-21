package operaciones;

public class Caja {
 
    int alto;
    int ancho;
    int profundo;
    
    //Constructor vacio
    public Caja(){
        System.out.println("Ejecutando constructor");
    }
    
    //Constructor con argumentos
    public Caja(int alto, int ancho, int profundo){
        this.alto = alto;
        this.ancho = ancho;
        this.profundo = profundo;
        System.out.println("Ejecutando constructor con args.");
    }
    
    public int calcularVolumen(){
        return alto * ancho * profundo;
        
    }

}
