package arrays;

import java.util.ArrayList;
/*
class Bil {
    public String farge;
    public int[] verdier = new int[5];
}

 */

public class Arrays2D {
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
    }
}
