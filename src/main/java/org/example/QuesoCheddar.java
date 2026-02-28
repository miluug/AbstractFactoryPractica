package org.example;

public class QuesoCheddar implements Queso {
    @Override
    public String descripcion (){
        return "Queso Cheddar";
    }

    @Override
    public double precio() {
        return 3.5;
    }
}
