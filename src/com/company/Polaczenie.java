package com.company;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Polaczenie {
    private static LocalDateTime data;
    private static int cena;
    private static String numer;

    public obliczCena(int cena)
    {
        cena = cena * 0,19
        return cena;
    }
    public Polaczenie_kon(LocalDateTime data, String numer , int cena){
        cena = obliczCenad(cena)
        this.data = data;
        this.numer = numer;
        this.cena = cena;
    }
    public String toString(){
        return "Polaczenie: numer"+ numer + " , data i godzina rozmowy: "+ data +" ,dlugsc trwania:"+ cena +"łaczny koszt: "cena;
    }
}
