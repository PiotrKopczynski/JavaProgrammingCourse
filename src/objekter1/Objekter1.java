package objekter1;

import javax.swing.*;

class Kalkulator {
    public static double addisjon(double tall1, double tall2) {
        return tall1 + tall2;
    }

    public static double substraksjon(double tall1, double tall2) {
        return tall1 - tall2;
    }
    public static double multiplikasjon(double tall1, double tall2) {
        return tall1 * tall2;
    }

    public static double divisjon(double tall1, double tall2) {
        return tall1 / tall2;
    }
}

class Person {
    public String navn;
    public String adresse;
    public int telefonnr;
    public int fødselsår;

    public int beregnAlder() {
        int now = 2022;
        int alder = now - fødselsår;
        return alder;
    }

    public void summary(int alder) {
        System.out.println(navn + " med adresse " + adresse
        + " med telefonnummer " + telefonnr + " er " + alder + " år.");

    }
}

class Bøker {
    public String tittel;
    public double pris;
    public String forfatter;
    public int iSBN;

    public void skrivUt() {
        JOptionPane.showMessageDialog(null,"tittel: " + tittel + "\npris: " + pris
        + "\nforfatter: " + forfatter + "\niSBN: " + iSBN);
    }
}

class Bil {
    private String farge;
    /*
    public void visFarge() {
        System.out.println("Fargen til bilen er " + farge);
    }
     */
    public void settFarge(String fargen) {
        farge = fargen;
    }

    public String hentFarge() {
        return farge;
    }
}

public class Objekter1 {
    public static void main(String[] args) {
        /*
        Bil nyBil = new Bil();
        nyBil.settFarge("blå");
        //nyBil.visFarge();
        String bilFargen = nyBil.hentFarge();
        System.out.println("Fargen til bilen er " + bilFargen);

         */
        /*
        Bøker bok = new Bøker();
        bok.tittel = JOptionPane.showInputDialog("Skriv inn tittel:");
        String prisen = JOptionPane.showInputDialog("Skriv inn pris:");
        bok.pris = Double.parseDouble(prisen);
        bok.forfatter = JOptionPane.showInputDialog("Skriv inn forfatter:");
        String iSBNstring = JOptionPane.showInputDialog("Skriv inn iSBN:");
        bok.iSBN = Integer.parseInt(iSBNstring);
        bok.skrivUt();

         */
        /*
        Person personen = new Person();
        personen.navn = "Piotr";
        personen.adresse = "Falbes 5";
        personen.telefonnr = 46225752;
        personen.fødselsår = 1998;

        int alder = personen.beregnAlder();
        personen.summary(alder);

         */
        double tall1 = 5.0;
        double tall2 = 2.5;
        double add = Kalkulator.addisjon(tall1,tall2);
        double sub = Kalkulator.substraksjon(tall1,tall2);
        double mult = Kalkulator.multiplikasjon(tall1,tall2);
        double div = Kalkulator.divisjon(tall1,tall2);
        System.out.println("Addisjon: " + add
                + "\nsubstraksjon: " + sub + "\nmultiplikasjon: "
        + mult + "\ndivisjon: " + div);


    }
}
