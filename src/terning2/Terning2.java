package terning2;

import java.security.SecureRandom;

public class Terning2 {
    public static void main(String[] args) {
        int antallKast = 6000;

        int terning1 = 0;
        int terning2 = 0;
        int terning3 = 0;
        int terning4 = 0;
        int terning5 = 0;
        int terning6 = 0;

        int kast;

        SecureRandom tilfeldigTall = new SecureRandom();

        for (int i=0; i<antallKast; i++) {
            kast = tilfeldigTall.nextInt(6);
            kast++;
            if (kast==1) {
                terning1++;
            }
            else if (kast==2) {
                terning2++;
            }
            else if (kast==3) {
                terning3++;
            }
            else if (kast==4) {
                terning4++;
            }
            else if (kast==5) {
                terning5++;
            }
            else {
                terning6++;
            }
        }
        String utStreng = "";
        utStreng += "Antall 1'ere er: " + terning1 + "\n";
        utStreng += "Antall 2'ere er: " + terning2 + "\n";
        utStreng += "Antall 3'ere er: " + terning3 + "\n";
        utStreng += "Antall 4'ere er: " + terning4 + "\n";
        utStreng += "Antall 5'ere er: " + terning5 + "\n";
        utStreng += "Antall 6'ere er: " + terning6 + "\n";

        System.out.println(utStreng);
    }
}
