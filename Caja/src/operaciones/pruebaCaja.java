package operaciones;

public class pruebaCaja {
    public static void main(String[] args) {
        
        var medidaAncho = 3;  //ANCHO
        var medidaAlto = 2;  //ALTO
        var medidaProf = 6;  //PROFUNDO
        
        Caja caja1 = new Caja();
        caja1.ancho = medidaAncho;
        caja1.alto = medidaAlto;
        caja1.profundo = medidaProf;
        System.out.println("Resultado volumen caja 1 = " + caja1.calcularVolumen());
        
    }
}
