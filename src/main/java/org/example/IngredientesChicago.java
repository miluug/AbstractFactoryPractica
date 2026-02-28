package org.example;

class IngredientesChicago implements IngredientesFactory{
    public Salsa crearSalsa(){
        return new SalsaBBQ();
    }

    public Queso crearQueso(){
        return new QuesoCheddar();
    }

    public Masa crearMasa(){
        return new MasaGruesa();
    }
}