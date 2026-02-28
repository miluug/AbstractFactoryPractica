package org.example;

public class MasaMediana implements Masa {
    @Override
    public String descripcion(){
        return "Masa Mediana";
    }

    @Override
    public double precio() {
        return 4.5;
    }
}
