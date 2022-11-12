package Radnik;

import java.util.Scanner;

public abstract class  Radnik {

    protected String ime;
    protected String prezime;
    protected String ziro;
    protected String jmbg;



    public Radnik() {

    }


    public void isplatiPlatu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Upisite ime ");
        String ime = scanner.nextLine();
        this.ime = ime;
        System.out.println("Prezime? ");
        String prezime = scanner.nextLine();
        this.prezime = prezime;

        System.out.println("Ziro? ");
        String ziro = scanner.nextLine();
        this.ziro = ziro;

        System.out.println("Jmbg? ");
        String jmbg = scanner.nextLine();
        this.jmbg = jmbg;

        System.out.println("Radnik  " +
                "Ime: " + ime +
                ", Prezime: " + prezime +
                ", ziro racun - " + ziro +
                ", Jmbg - " + jmbg );

    }





}
