package edu.upc.eetac.dsa.marc.ejerciciosJava.ejercicio2;

public abstract class formaAbstracta implements forma { //ES UN Objeto
    private String tipo;

    public formaAbstracta(String t) {
        this.tipo = t;
    }

    @Override//para que no se confundiera con las clases superiores
    public String toString() {//si se llamara con mismo nombe la función
        return "Soy un " + tipo;
    }
}