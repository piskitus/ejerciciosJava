package edu.upc.eetac.dsa.marc.ejerciciosJava.ejercicio2;

public abstract class formaAbstracta implements forma {
    private String tipo;

    public formaAbstracta(String t) {
        this.tipo = t;
    }

    @Override
    public String toString() {
        return "Soy un " + tipo;
    }
}