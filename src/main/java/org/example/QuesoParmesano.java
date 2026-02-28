package org.example;

public class QuesoParmesano implements Queso {

    @Override
    public String descripcion (){
        return "Queso Parmesano";
    }

    @Override
    public double precio() {
        return 3.8;
    }
}
