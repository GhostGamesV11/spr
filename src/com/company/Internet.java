package com.company;

import java.time.LocalDateTime;

public class Internet extends Serwis{
    private static int iloscMB;
    private static LocalDateTime data;
    private static int cena;

    public obliczCene(int iloscMB){
        int cena = iloscMB/755;
        return cena;
    }
    public Internet_kon(LocalDateTime data, int iloscMB){
        int cena = obliczCena(cena)
        this.data = data;
        this.iloscMB = iloscMB;
        this.cena = cena;}
    public String toString(){
        return "Internet,data i godzina internetu: "+ data +" ,iloscMB:"+ iloscMB +"łaczny koszt: "cena;
    }

}