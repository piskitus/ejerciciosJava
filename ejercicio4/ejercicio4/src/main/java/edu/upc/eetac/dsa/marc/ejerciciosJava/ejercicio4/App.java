package edu.upc.eetac.dsa.marc.ejerciciosJava.ejercicio4;

import java.io.File;
import java.io.IOException;


public class App 
{
	
    public static void main( String[] args )throws IOException  //utiliza excepciones eclipse
    {
    	File file = new File("/home/marc/dsa-projects/ejerciciosJava/ejercicio4/ejercicio4/hola");
        atributos at = new atributos (3, 9.4,'s');
        at.guardarEnFichero("/home/marc/dsa-projects/ejerciciosJava/ejercicio4/ejercicio4/hola");
        
        atributos testRead = atributos.LeerDe("/home/marc/dsa-projects/ejerciciosJava/ejercicio4/ejercicio4/hola");
        System.out.println("entero = " + testRead.getEntero());//Lee los parametros del archivo
        System.out.println("decimal = " + testRead.getDecimal());
        System.out.println("caracter = " + testRead.getCaracter());

        //File file = new File("/home/marc/dsa-projects/ejerciciosJava/ejercicio4/ejercicio4/hola");
        //file.delete();
    }
}
