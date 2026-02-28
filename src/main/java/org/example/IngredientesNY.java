package org.example;

class IngredientesNY implements IngredientesFactory{
    public Salsa crearSalsa(){
        return new SalsaTomate();
    }

    public Queso crearQueso(){
        return new QuesoMozarella();
    }

    public Masa crearMasa(){
        return new MasaFina();
    }
}