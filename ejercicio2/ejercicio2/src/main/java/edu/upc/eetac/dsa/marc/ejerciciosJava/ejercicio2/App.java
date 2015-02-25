package edu.upc.eetac.dsa.marc.ejerciciosJava.ejercicio2;

public class App {
    public static void main(String[] args) {
        forma[] formas = new forma[2];
        formas[0] = new circulo(2.5);
        formas[1] = new rectangulo(3, 5);

        for (forma forma : formas)
            System.out.println(forma + " de area = " + forma.area());
    }
}
