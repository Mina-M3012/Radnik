package Radnik;

import java.util.Scanner;

public class PoSatu extends Radnik {

    private double brojSati;
    private double plata;
    private double obracun;



    public PoSatu (){


    }


    @Override
    public void isplatiPlatu() {
        super.isplatiPlatu();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plata po satu? ");
        double plata = scanner.nextDouble();
        this.plata = plata;

        System.out.println("Broj sati? ");
        double brojSati = scanner.nextDouble();
        this.brojSati = brojSati;

        this.obracun = brojSati*plata;

        System.out.println("Plata : " + obracun);

    }




}

