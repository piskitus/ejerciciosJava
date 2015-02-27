package edu.upc.eetac.dsa.marc.ejerciciosJava.ejercicio4;

import java.io.*;


public class atributos {
	private int entero;
	private double decimal;
	private char caracter;
	
	
	public atributos (int e, double d, char c)
	{
		this.entero = e;
		this.decimal = d;
		this.caracter=c;
	}

	public int getEntero() {
		return entero;
	}
	public void setEntero(int entero) {
		this.entero = entero;
	}
	public double getDecimal() {
		return decimal;
	}
	public void setDecimal(double decimal) {
		this.decimal = decimal;
	}
	public char getCaracter() {
		return caracter;
	}
	public void setCaracter(char caracter) {
		this.caracter = caracter;
	}
	/*un método que tomando como parámetro de entrada el nombre de un fichero escriba en él en
	formato binario el valor de los tres atributos en el orden en el que se han enumerado.*/
	public void guardarEnFichero(String fichero)throws IOException{
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(fichero));
        dos.writeInt(entero);
        dos.writeDouble(decimal);
        dos.writeChar(caracter);
        dos.close();
	}
	/*Un método de clase que tomando como parámetro de entrada el nombre de un fichero que
ha sido generado como salida del método anterior instancie un objeto de la clase y lo
devuelva.*/
    public final static atributos LeerDe(String filename) throws IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream(filename));
        int integer = dis.readInt();
        double decimal = dis.readDouble();
        char character = dis.readChar();

        return new atributos(integer, decimal, character);
    }

}
