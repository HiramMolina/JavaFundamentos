
package PasoPorValor;

public class PasoPorValor {
    public static void main(String[] args) {        //MAIN
        var x = 10;
        System.out.println("x = " + x);
        
        cambioValor(x);
        
    } 
//************************************************************************************************
// UNA VEZ PASANDO EL BLOQUE DE CODIGO YA NO SE TIENE ACCESO A LA VARIABLE "X" POR SER OTRO METODO
    
    public static void cambioValor(int arg1){       //  METODO
        System.out.println("arg1 = " + arg1);
        arg1 = 15;
        
    }

    
}
 /*
En este programa se estudio el como actuan las variables y la manera en la que
al pasar de metodo a metodo se destruyen, el metodo "Cambio valor" solo obtiene
una copia para trabajar, pero al finalizar el codigo y cuando se regresa al metodo
main, se termina por asignar de regreso el valor inicial a la variable arg1
*/