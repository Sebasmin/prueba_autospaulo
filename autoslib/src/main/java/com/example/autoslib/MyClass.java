package com.example.autoslib;

public class MyClass {
    private String marca;
    private String modelo;
    private int año;

    public MyClass(String marca, String modelo, int año){
        this.marca = marca;
        this.modelo = modelo;
        this.año= año;
    }

    public MyClass(){
        this.marca = "Mercedez-Benz";
        this.modelo = "Clase g, G500";
        this.año = 2022;
    }

    public String toString(){
        String cadena= "\nmarca: " + this.marca + "\nmodelo: " + this.modelo + "\naño: " + this.año;
        return cadena;
    }

    public Boolean isPreowned(){
        LocalDate date = LocalDate.now();
        Integer year = date.getYear();
        if(this.year<year){
            return Boolean.TRUE;
        }
        else{
            return Boolean.FALSE;
        }
    }
}

