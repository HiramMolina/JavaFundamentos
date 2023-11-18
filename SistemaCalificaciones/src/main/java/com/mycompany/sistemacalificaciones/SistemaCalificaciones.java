
package com.mycompany.sistemacalificaciones;

import java.util.Scanner;

/*
El usuario proporcionará un valor entre 0 y 10.
Si está entre 9 y 10: imprimir una A
Si está entre 8 y menor a 9: imprimir una B
Si está entre 7 y menor a 8: imprimir una C
Si está entre 6 y menor a 7: imprimir una D
Si está entre 0 y menor a 6: imprimir una F
cualquier otro valor debe imprimir: Valor desconocido
*/

public class SistemaCalificaciones {

    public static void main(String[] args) {
        
        System.out.println("Proporcione un valor del 0 al 10");
        
        Scanner scanner = new Scanner(System.in);
                
        int calificacion = Integer.parseInt(scanner.nextLine());
        
        if(calificacion <= 10 && calificacion >= 9){
            System.out.println("A");
        }
        else if(calificacion >= 8 && calificacion < 9){
            System.out.println("B");
        }
        else if(calificacion >= 7 && calificacion < 8){
            System.out.println("C");
        }
        else if(calificacion >= 6 && calificacion < 7){
            System.out.println("D");
        }
        else if(calificacion >= 0 && calificacion < 6){
            System.out.println("F");
        }
        
       
    }
}
