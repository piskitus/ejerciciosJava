package edu.upc.eetac.dsa.marc.ejerciciosJava.ejercicio1;

public class Tree {
	private int altura;
	private String nombre;
	
	public Tree(){
		this.altura=0;
		this.nombre="árbol";
	}
	
	public Tree(int a, String n){
		this.altura = a;
		this.nombre = n;
	}
	
	public Tree(int a){
		this.altura = a;
		this.nombre = "árbol";
	}
	
	public Tree(String n){
		this.altura = 0;
		this.nombre = n;
	}
	
	public int getAltura(){
		return this.altura;
	}
	
	public String getNombre(){
		return this.nombre;
	}

//codigo profes
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Un ");
        if (nombre == null)
            sb.append("árbol");
        else
            sb.append(nombre);
        if (altura > 0)
            sb.append(" de ").append(altura).append(" metros");
        return sb.toString();
    }

}

