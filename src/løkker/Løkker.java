package løkker;

import javax.swing.*;

public class Løkker {
    public static int fakultet(int n) {
        int fak = 1;
        for(int i=n;i>0;i--) {
            fak*=i;
        }
        return fak;
    }
    public static void main(String[] args) {
        /*
        int i = 0;
        while (i<10) {
            System.out.print(i+" ");
            i++;
        }
        System.out.println();
        for (int j=0; j<10;j++) {
            System.out.print(j+" ");
        }
         */
        /*
        int sum = 0;
        int count = 0;
        String input = JOptionPane.showInputDialog("Skriv inn et heltall og avslutt med 0");
        int innTall = Integer.parseInt(input);
        while (innTall>0) {
            sum+=innTall;
            count+=1;
            input = JOptionPane.showInputDialog("Skriv inn et heltall og avslutt med 0");
            innTall = Integer.parseInt(input);
        }
        JOptionPane.showMessageDialog(null,"Summen er " + sum);
        double gjennomsnitt = (double) sum / (double) count;
        JOptionPane.showMessageDialog(null,"Gjennomsnittet er " +gjennomsnitt);
         */
        //Oppgave 1
        /*
        double pi = 4;
        long count = 0L;
        for (long i = 3L; i < 10000000000L; i+=2) {
            count++;
            if (count%2==1) {
                pi -= 4.0/i;
            }
            else {
                pi += 4.0/i;
            }
        }
        System.out.println(pi);
        System.out.println(count);
         */
        /*
        int chosen = 25;
        int prim = 3;
        boolean isPrime = true;
        System.out.print("1 ");
        while (prim<=chosen) {
            for (int i=2; i<prim; i++) {
                if (prim%i==0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(prim + " ");
            }
            isPrime = true;
            prim++;
        }
         */
        /*
        int max = 0;
        int nextMax = 0;
        for (int teller=0;teller<10;teller++) {
            String innTall = JOptionPane.showInputDialog(
                    "Skriv inn et heltall");
            int tall = Integer.parseInt(innTall);
            if (tall>max) {
                nextMax = max;
                max = tall;
            }
        }
        JOptionPane.showMessageDialog(null,
                "Største tall: " + max +
                        "\nNest størst: " + nextMax);
         */
        /*
        System.out.println("     N        N^2      N^3     N^4");
        for (int i=1;i<11;i++) {
            for (int j=1;j<5;j++) {
                System.out.format("%6d%1s",((int) Math.pow(i,j)),"   ");
            }
            System.out.println();
         */
        /*
        String innTall = JOptionPane.showInputDialog("Skriv inn et femsifret heltall");
        int tall = Integer.parseInt(innTall);
        while(true) {
            if (tall<=99999 && tall>9999) {
                break;
            }
            innTall = JOptionPane.showInputDialog("Skriv et annet femsifret tall :(");
            tall = Integer.parseInt(innTall);

        }
        boolean palindrome = false;
        if (tall/10000==tall%10 && (tall%10000)/1000==(tall%100)/10) {
            palindrome = true;
        }
        if (palindrome) {
            System.out.println("Tallet er en palindrom");
        }
        else {
            System.out.println("Tallet er ikke en palindrom");
        }
         */
        int test = fakultet(7);
        System.out.println(test);
    }
}
