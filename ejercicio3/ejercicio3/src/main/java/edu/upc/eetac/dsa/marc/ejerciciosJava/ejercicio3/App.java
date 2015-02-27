package edu.upc.eetac.dsa.marc.ejerciciosJava.ejercicio3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App 
{
    public static void main( String[] args ){
    	int contador = 1;
    	int contNum=1;
    	double suma = 0;
    	
		FileReader FR = null;
		try {
			FR = new FileReader(
					"/home/marc/dsa-projects/ejerciciosJava/ejercicio3/ejercicio3/numeros.txt");
			// Trabajar con buffers está más optimizado
			BufferedReader entrada = new BufferedReader(FR);

			// El método readLine() lee línea a línea y devuelve null si acaban
			// El método read() lee carácter a carácter y devuelve -1 si acaban

			String linea = entrada.readLine();
			while (linea != null) {
				//System.out.println(linea);
				try{
					int num = Integer.parseInt(linea); //para convertir el String en entero
					
					if (num > 1000)
					{
						//throw new BigNumberException("Number greater than 1000 at line " + (int) (++contador));
						System.out.println("Número mayor que 1000 en la línea "+contador);
					}
					
                    suma = suma + num;
                    contador++;
                    contNum++;
				}catch (NumberFormatException e){
					System.out.println("Error de formato de número en la línea "+ contador);
					contador++;
		
				}
				linea = entrada.readLine();
			}
			double media = suma / contNum;
			System.out.println("hay "+contNum+" números. Su media aritmética es: "+media);
			entrada.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
