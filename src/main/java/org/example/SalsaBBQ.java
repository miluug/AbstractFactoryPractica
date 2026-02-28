package org.example;

public class SalsaBBQ implements Salsa {

    @Override
    public String descripcion (){
        return "Salsa BBQ";
    }

    @Override
    public double precio() {
        return 2.5;
    }
}
