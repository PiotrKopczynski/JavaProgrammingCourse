package løkker;

import javax.swing.*;

public class Løkker {
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
    }
}
