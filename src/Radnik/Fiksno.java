package Radnik;

import java.util.Scanner;

public class Fiksno extends Radnik {
    private double plata;


    public Fiksno (){

    }

    @Override
    public void isplatiPlatu() {
        super.isplatiPlatu();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plata? ");
        double plata = scanner.nextDouble();
        this.plata = plata;
        System.out.println("Fiksna Plata : " + plata);

    }






}
