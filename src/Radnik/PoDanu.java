package Radnik;

import java.util.Scanner;

public class PoDanu extends Radnik {

    private int brojDana;
    private double plata;
    private  double obracun;


    public PoDanu (){

    }

    @Override
    public void isplatiPlatu() {
        super.isplatiPlatu();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plata po danu? ");
        double plata = scanner.nextDouble();
        this.plata = plata;

        System.out.println("Broj dana? ");
        int brojDana = scanner.nextInt();
        this.brojDana = brojDana;

        this.obracun = brojDana*plata;

        System.out.println("Plata : " + obracun);

    }


}
