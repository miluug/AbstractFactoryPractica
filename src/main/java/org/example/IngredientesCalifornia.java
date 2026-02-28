package org.example;

public class IngredientesCalifornia implements IngredientesFactory {
    public Salsa crearSalsa(){
        return new SalsaNapolitana();
    }

    public Queso crearQueso(){
        return new QuesoParmesano();
    }

    public Masa crearMasa(){
        return new MasaMediana();
    }
}
