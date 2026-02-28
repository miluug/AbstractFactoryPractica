package org.example;

public class MasaGruesa implements Masa {
    @Override
    public String descripcion (){
        return "Masa gruesa";
    }

    @Override
    public double precio() {
        return 5.0;
    }
}
