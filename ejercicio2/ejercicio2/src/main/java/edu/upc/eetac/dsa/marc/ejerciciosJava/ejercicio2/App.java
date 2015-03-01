package edu.upc.eetac.dsa.marc.ejerciciosJava.ejercicio2;

public class App {
    public static void main(String[] args) {
        forma[] formas = new forma[2];//creo un vector de formas
        formas[0] = new circulo(2.5);//creo una forma circulo de radio X (uso la clase circulo)
        formas[1] = new rectangulo(3, 5);//creo una forma rectangulo de lados x,y (uso clas rect)

        for (forma forma : formas)//hago esto para cada forma
            System.out.println(forma + " de area = " + forma.area());
        /*Aquí llamo a la interfaz forma y eclipse se encarga de buscar sus constructores
          yendo de la clase forma a la clase forma Abstracta para determinar que tipo de forma es
          y luego yendo a la clase correspondiente de esa forma para obtener el area*/
    }
}
