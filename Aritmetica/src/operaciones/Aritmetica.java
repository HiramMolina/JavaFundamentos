
package operaciones;

public class Aritmetica {
    //Atributos de la clase
    int a;
    int b;
    
    //Constructor vacio
    public Aritmetica(){
        System.out.println("Ejecutando constructor"); 
    }
    
    //Constructor 2
    public Aritmetica(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando constructor con argumentos");
    }
    
    //Metodo
    public void sumar(){
        int resultado = this.a + this.b;
        System.out.println("resultado = " + resultado);
    }
    //Otro Metodo que si regrese y regrese un Entero
    public int sumarConRetorno(){
//        int resultado = a + b;
        return this.a + this.b;
    }
    
    //METODO PARA REGRESAR UN ENTERO DE DOS ARGUMENTOS
    public int sumarConArgumentos(int arg1, int arg2){
        this.a = arg1; //El argumento a se asigna al atributo this.a
        this.b = arg2; //El argumento b se asigna al atributo this.b
        return this.sumarConRetorno();
    }
    
}
