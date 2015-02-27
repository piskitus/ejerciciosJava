package edu.upc.eetac.dsa.marc.ejerciciosJava.ejercicio4;

import java.io.File;
import java.io.IOException;


public class App 
{
	
    public static void main( String[] args )throws IOException
    {
        atributos at = new atributos (3, 9.4,'s');
        at.guardarEnFichero("hola");
        
        atributos testRead = atributos.LeerDe("hola");
        System.out.println("entero = " + testRead.getEntero());
        System.out.println("decimal = " + testRead.getDecimal());
        System.out.println("caracter = " + testRead.getCaracter());

        File file = new File("hola");
        file.delete();
    }
}
