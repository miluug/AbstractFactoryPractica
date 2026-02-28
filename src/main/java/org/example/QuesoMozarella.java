package org.example;

public class QuesoMozarella implements Queso {

    @Override
    public String descripcion (){
        return "Queso Mozarella";
    }

    @Override
    public double precio() {
        return 3.0;
    }
}
