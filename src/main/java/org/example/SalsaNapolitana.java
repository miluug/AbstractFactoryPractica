package org.example;

public class SalsaNapolitana implements Salsa {

    @Override
    public String descripcion (){
        return "Salsa Napolitana";
    }

    @Override
    public double precio() {
        return 2.3;
    }
}
