package com.company;

import java.time.LocalDateTime;

public class SMS extends Serwis{
    private static String numer;
    private static LocalDateTime data;
    private static int cena;

    public obliczCene(){
        int cena = 0,09;
        return cena;
    }
    public PolaczenieSMS(LocalDateTime data, String numer){
        int cena = obliczCena(cena)
        this.data = data;
        this.numer = numer;
        this.cena = cena;}
    public String toString(){
        return "SMS: numer"+ numer + " , data i godzina sms: "+ data +"łaczny koszt: "cena;
    }
}