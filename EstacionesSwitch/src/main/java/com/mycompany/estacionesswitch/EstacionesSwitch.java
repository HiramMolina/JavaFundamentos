

package com.mycompany.estacionesswitch;

public class EstacionesSwitch {

    public static void main(String[] args) {
        
        var mes = -1;
        var estacion = "Estacion desconocida";
        
        switch(mes){
            case 1: case 2: case 12:
                estacion= "Invierno";
                        break;
                    }
        switch(mes){
            case 3: case 4: case 5:
                estacion= "Primavera";
                        break;
                    }
        switch(mes){
            case 6: case 7: case 8:
                estacion= "Verano";
                        break;
                    }
        switch(mes){
            case 9: case 10: case 11:
                estacion= "Otoño";
                        break;
                    }
        System.out.println("estacion = " + estacion);
    }
}
