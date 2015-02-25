package edu.upc.eetac.dsa.marc.ejerciciosJava.ejercicio2;

public class rectangulo extends formaAbstracta{
	private int base;
	private int altura;
	
	public rectangulo (int bas, int alt){
		super("rectangulo");
		this.base = bas;
		this.altura=alt;
	}
	
	public void setMedidas(int bas, int alt){

	}
	
	public double getBase(){
		return base;
	}
	public double getAltura(){
		return altura;
	}
	
	public double area(){
		return base*altura;
	}
}