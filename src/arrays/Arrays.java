package arrays;

import javax.swing.*;

public class Arrays {
    /*
    private static int[] liste = {1,2,3,4,5};

    private static void skrivArray(int[] innListe) {
        innListe[0] = 200;
        for (int tall : innListe) {
            System.out.print(tall+" ");
        }
    }
     */

    public static double gjennomsnittkalkulator(int antall) {
        int[] liste = new int[antall];
        int count = 0;
        while (count<antall) {
            String innPoeng = JOptionPane.showInputDialog("Skriv inn poengsum");
            try {
                liste[count] = Integer.parseInt(innPoeng);
            }
            catch(Exception e) {
                System.out.println(e);
                count--;
            }
            count++;
        }
        int sum = 0;
        for (int i=0;i<antall;i++) {
            sum += liste[i];
        }
        return (double) sum / (double) antall;

    }

    public static void main(String[] args) {
        /*
        liste[1] = 300;
        for (int tall : liste) {
            System.out.print(tall+" ");
        }
        System.out.println();
        skrivArray(liste);
        System.out.println();
        for (int tall : liste) {
            System.out.print(tall+" ");
        }
         */
        /*
        String[] liste = {"Per","Hansen","Line","Olsen","Ola"
        ,"Pedersen","Kari","Finnsen"};
        for (String navn : liste) {
            System.out.println(navn);
        }
         */
        /*
        int[] liste = {45,34,5,8,10,2,13,25};
        int max = liste[0];
        int min = liste[0];
        for (int i=1;i<liste.length;i++) {
            if (liste[i]>max) {
                max=liste[i];
            }
            if (liste[i]<min) {
                min = liste[i];
            }
        }
        System.out.println("Max :"+max+" Min: "+min);
         */
        double gjennomsnitt = gjennomsnittkalkulator(2);
        System.out.println(gjennomsnitt);

    }
}
