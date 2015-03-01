package edu.upc.eetac.dsa.marc.ejerciciosJava.ejercicio1;


public class App { 
    public static void main(String args[]) { 
        Tree[] arboles = new Tree[4];//creamos un vectror de la clase arbol
        arboles[0] = new Tree(4); 
        arboles[1] = new Tree("Roble"); // creamos árboles
        arboles[2] = new Tree(); 
        arboles[3] = new Tree(5,"Pino");
     /*código Marc 
        System.out.println("____________________________________");
        System.out.println("Un árbol de "+arboles[0].getAltura()+" metros.");
        System.out.println("Un "+arboles[1].getNombre());
        System.out.println("Un "+arboles[2].getNombre());
        System.out.println("Un "+arboles[3].getNombre()+" de " +arboles[3].getAltura()+" metros.");
      */
        
     //código profes   
        System.out.println("---------");
        System.out.println(arboles[0].toString());//llamamos a la función
        System.out.println(arboles[1].toString());//que hemos creado en la
        System.out.println(arboles[2].toString());//clase arbol, llamada
        System.out.println(arboles[3].toString());//toString
    } //se trata de interactuar con la clase sin tener q saber lo que tiene que aparecer
}