package edu.upc.eetac.dsa.marc.ejerciciosJava.ejercicio3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Calculator {
    public final static double promedio(String file) throws FileParsingException, BigNumberException {
        int contador = 0;
        double suma = 0;
        BufferedReader entrada = null;
        try {
        	FileReader FR = new FileReader(file);//para leer un archivo de texto

			// Trabajar con buffers está más optimizado
			entrada = new BufferedReader(FR);//lo metemos en un buffer para editarlo
															
			// El método readLine() lee línea a línea y devuelve null si acaban
			// El método read() lee carácter a carácter y devuelve -1 si acaban
			
			String linea = entrada.readLine();//leemos linea

			while (linea != null) {//bucle hasta que no haya que leer más lineas
				//System.out.println(linea);(este comando nos mostraría la linea)
				
				
                try {//para excepciones
                	int num = Integer.parseInt(linea); //para convertir el String en entero
                	if (num > 1000)
					{//excepción creada por nosotros
						throw new BigNumberException("Número mayor que 1000 en la linea " + (int) (++contador));
						//enviamos ese STRING de Error a la clase BigNumberException
					}
                    suma += num;//suma = suma + num;
                    contador++;
                    linea = entrada.readLine();//leemos siguiente linea
                } catch (NumberFormatException e) {
                    throw new FileParsingException(e.getMessage());//excepcion creada por nos
                    //Utilizamos el mensaje que se genera por defecto en NumberFormatException
                }
			}
        } catch (java.io.IOException e) {
        	//Utilizamos el mensaje que se genera por defecto en NumberFormatException
            throw new FileParsingException(e.getMessage());
        } 
        
        
        finally {//finally lo ejecutará siempre pase lo que pase y salga el error que salga
            try {
                entrada.close();
            } catch (IOException e) {
                System.err.println("warning: can not close file.");
            }
        }
//si todo sale bien, devuelve la media
        return suma / contador;
    }
}