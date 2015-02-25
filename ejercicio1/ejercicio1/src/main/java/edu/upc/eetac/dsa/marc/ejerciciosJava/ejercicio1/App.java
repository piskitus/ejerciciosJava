package edu.upc.eetac.dsa.marc.ejerciciosJava.ejercicio1;


public class App { 
    public static void main(String args[]) { 
        Tree[] arboles = new Tree[4];
        arboles[0] = new Tree(4); 
        arboles[1] = new Tree("Roble"); 
        arboles[2] = new Tree(); 
        arboles[3] = new Tree(5,"Pino");
     //código Marc 
        System.out.println("____________________________________");
        System.out.println("Un árbol de "+arboles[0].getAltura()+" metros.");
        System.out.println("Un "+arboles[1].getNombre());
        System.out.println("Un "+arboles[2].getNombre());
        System.out.println("Un "+arboles[3].getNombre()+" de " +arboles[3].getAltura()+" metros.");

        
     //código profes   
        System.out.println("---------");
        System.out.println(arboles[0].toString());
        System.out.println(arboles[1].toString());
        System.out.println(arboles[2].toString());
        System.out.println(arboles[3].toString());
    } 
}