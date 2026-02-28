package org.example;

public class SalsaTomate implements Salsa {

    @Override
    public String descripcion (){
        return "Salsa de Tomate";
    }

    @Override
    public double precio() {
        return 2.0;
    }
}
