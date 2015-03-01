package edu.upc.eetac.dsa.marc.ejerciciosJava.ejercicio1;

public class Tree {
	//variables privadas, solo accesibles dentro de la clase
	private int altura;
	private String nombre;
	//métodos
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
	//Gets para obtener las variables privadas, sets para enviar
	//a esta clase variables del main
	public int getAltura(){
		return this.altura;
	}
	
	public String getNombre(){
		return this.nombre;
	}

//codigo profes que saca una frase dependiendo de que método o parametros
	// se pasen
    public String toString() {//función creada para hacer frases
        StringBuilder sb = new StringBuilder();//constructor de frases
        sb.append("Un ");//append une las partes de la frase
        if (nombre == null)
            sb.append("árbol");
        else
            sb.append(this.nombre);
        if (this.altura > 0)
            sb.append(" de ").append(this.altura).append(" metros");
        return sb.toString();
    }

}

