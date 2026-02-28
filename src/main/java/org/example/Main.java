package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

                IngredientesFactory factory = new IngredientesNY();
                Pizza pizzaNY = new Pizza(factory);
                pizzaNY.detallesUI();

                factory = new IngredientesChicago();

                Pizza pizzaChicago = new Pizza(factory);
                pizzaChicago.detallesUI();

    }
}
