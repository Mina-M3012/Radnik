package Radnik;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Koji je tip radnika?" + "\n" +"1.po satu" + "\n"+  "2.po danu " + "\n" + "3.fiksno  " +
                "\n" + "(upisite broj)");
        String t = scanner.next();
        int tip = Integer.parseInt(t);

        if (tip == 1) {
            PoSatu poSatu = new PoSatu();
            poSatu.isplatiPlatu();
        } else if (tip == 2) {
            PoDanu poDanu = new PoDanu();
            poDanu.isplatiPlatu();
        } else if (tip == 3) {
            Fiksno fiksno = new Fiksno();
            fiksno.isplatiPlatu();
        } else {
            System.out.println("Niste pravilno uneli tip radnika!");
        }






    }





}
