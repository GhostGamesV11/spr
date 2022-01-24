package com.company;
import java.time.LocalDateTime;

public abstract class Serwis {
    protected LocalDateTime data;
    protected double cena;

    public void obliczCena(){}

    public Serwis_kon(LocalDateTime data){
        this.data = data;
    }



