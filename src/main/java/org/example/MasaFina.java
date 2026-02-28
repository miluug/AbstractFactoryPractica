package org.example;

public class MasaFina implements Masa {

    @Override
    public String descripcion(){
        return "Masa fina";
    }

    @Override
    public double precio() {
        return 4.0;
    }
}
