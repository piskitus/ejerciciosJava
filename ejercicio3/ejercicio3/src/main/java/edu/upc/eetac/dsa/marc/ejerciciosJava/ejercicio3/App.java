package edu.upc.eetac.dsa.marc.ejerciciosJava.ejercicio3;

public class App{
    public static void main(String[] args) {
        /*if (args.length != 1) {
            System.err.println("Program needs the path to the file with the numbers");
            System.exit(-1);
        }*/

        try {
        	//enviamos el archivo a nuestra clase calculator, función promedio:
            double promedio = Calculator.promedio("/home/marc/dsa-projects/ejerciciosJava/ejercicio3/ejercicio3/numeros.txt");
            System.out.println("Promedio = " + promedio);
            
        } catch (FileParsingException e) {//si no se puede obtener el promedio mostramos el error
            e.printStackTrace();
        } catch (BigNumberException e) {//Son nuestros 2 errores creados
            e.printStackTrace();
        }
    }
}
