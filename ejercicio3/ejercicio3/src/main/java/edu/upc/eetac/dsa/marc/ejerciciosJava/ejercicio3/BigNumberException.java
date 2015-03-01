package edu.upc.eetac.dsa.marc.ejerciciosJava.ejercicio3;

public class BigNumberException extends Exception {//creamos nuestra clase heredando Exception
		
		public BigNumberException(String message) //función que recibe un mensaje
		{
        super(message);//se envia el mensaje a la clase Exception para que lo muestre como error
		}
}
