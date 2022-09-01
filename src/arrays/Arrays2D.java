package arrays;

import javax.swing.*;
import java.util.ArrayList;
/*
class Bil {
    public String farge;
    public int[] verdier = new int[5];
}

 */

public class Arrays2D {

    public static int[][] matrise() {
        boolean test = true;
        int rader = 0;
        int kolonner = 0;
        while(test) {
            String innRader = JOptionPane.showInputDialog("Skriv inn antall filmanmeldere: ");
            String innKolonner = JOptionPane.showInputDialog("Skriv inn antall filmer: ");
            try {
                rader = Integer.parseInt(innRader);
                kolonner = Integer.parseInt(innKolonner);
                test = false;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        int[][] array = new int[rader][kolonner];
        int radCount = 0;
        int kolonneCount = 0;
        while(radCount<rader) {
            kolonneCount = 0;
            while(kolonneCount<kolonner) {
                int tall = 0;
                String innTall = JOptionPane.showInputDialog("Skriv inn score " + (kolonneCount+1) + " til filmanmelder nummer " + (radCount+1)
                + ". Tallet må være mellom 0 og 9.");
                try {
                    tall = Integer.parseInt(innTall);
                }
                catch (Exception e) {
                    System.out.println(e);
                }
                if (tall<0 || tall>9) {
                    JOptionPane.showMessageDialog(null,"Tallet er ikke av riktig type.");
                }
                else {
                    array[radCount][kolonneCount] = tall;
                    kolonneCount++;
                }
            }
            radCount++;
            System.out.println(radCount);
        }
        return array;
    }
    public static void main(String[] args) {
        /*
        int[][] tabell = new int[4][4];
        tabell[0][0] = 23;
        tabell[1][0] = 24;
        tabell[2][3] = 45;
        for (int i = 0;i<tabell.length;i++) {
            for (int j = 0;j<tabell[i].length;j++) {
                System.out.print(tabell[i][j]+" ");
            }
        }
        System.out.println();
        for (int[] liste: tabell) {
            for (int tall: liste) {
                System.out.print(tall+" ");
            }
        }
         */
        /*
        ArrayList<Bil> biler = new ArrayList<Bil>();
        Bil enVolvo = new Bil();
        enVolvo.farge="Rød";
        enVolvo.verdier[0]=4;
        enVolvo.verdier[1]=250;

        Bil enAudi = new Bil();
        enAudi.farge = "Blå";
        enAudi.verdier[0]=5;
        enAudi.verdier[1]=345;

        biler.add(enAudi);
        biler.add(enVolvo);

        for (Bil enBil : biler) {
            System.out.println("Fargen er " + enBil.farge);
            System.out.println("Antall dører er " + enBil.verdier[0]);
            System.out.println("Antall hester er " + enBil.verdier[1]);
            System.out.println("-----------------------");
        }
        biler.remove(enAudi);
        biler.add(enVolvo);
        for (Bil enBil : biler) {
            System.out.println("Fargen er " + enBil.farge);
            System.out.println("Antall dører er " + enBil.verdier[0]);
            System.out.println("Antall hester er " + enBil.verdier[1]);
            System.out.println("-----------------------");
        }
        System.out.println("Lengden på arrayet er nå "+biler.size());
        biler.clear();
        System.out.println("Lengden på arrayet er nå "+biler.size());
         */
        /*
        int[] array = {1,2,3,4,5,6,7,8,9};
        ArrayList<Integer> liste = new ArrayList<>();
        for (int i=0;i<array.length;i++) {
            liste.add(array[i]);
        }
        int[] test = new int[9];
        for (int element : liste) {
            System.out.println(element);
        }
        for (int i=0;i<liste.size();i++) {
            test[i] = liste.get(i);
        }
        for (int element : test) {
            System.out.println(element);
        }
         */
        int[][] array = matrise();
        //double[][] array = {{4.0,6.0,2.0,5.0},{7.0,9.0,4.0,8.0},{6.0,9.0,3.0,7.0}};
        int rader = array.length;
        int kolonner = array[0].length;
        double[] scores = new double[kolonner];
        for (int i=0;i<rader;i++) {
            for (int j=0;j<kolonner;j++) {
                scores[j]+= array[i][j];
            }
        }
        for (int i=0;i<kolonner;i++) {
            scores[i] = scores[i] / rader;
            System.out.println(scores[i]);
        }

    }
}
