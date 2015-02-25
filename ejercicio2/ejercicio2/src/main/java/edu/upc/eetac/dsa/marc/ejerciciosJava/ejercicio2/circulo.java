package edu.upc.eetac.dsa.marc.ejerciciosJava.ejercicio2;

public class circulo extends formaAbstracta{
	private double radio;
	
	public circulo (double rad){
		super("circulo");
		this.radio = rad;
	}

	public double getRadio(){
		return radio;
	}
	
	public double area(){
		return 2* radio * Math.PI;
	}
}