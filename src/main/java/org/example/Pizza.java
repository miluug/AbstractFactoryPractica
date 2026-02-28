package org.example;

public class Pizza {

    private Salsa salsa;
    private Queso queso;
    private Masa masa;

    public Pizza(IngredientesFactory f) {
        salsa = f.crearSalsa();
        queso = f.crearQueso();
        masa = f.crearMasa();
    }

    public void detallesUI() {
        String descripcionSalsa = salsa.descripcion();
        String descripcionQueso = queso.descripcion();
        String descripcionMasa = masa.descripcion();
        double precioSalsa = salsa.precio();
        double precioQueso = queso.precio();
        double precioMasa = masa.precio();

        double total = (precioSalsa + precioQueso + precioMasa);
        System.out.println("Ingredientes: ");
        System.out.println(descripcionSalsa);
        System.out.println(precioSalsa);
        System.out.println(descripcionQueso);
        System.out.println(precioQueso);
        System.out.println(descripcionMasa);
        System.out.println(precioMasa);
        System.out.println("Precio total: "+total+"\n");
    }
}

