package switch2;

import static javax.swing.JOptionPane.*;

public class Switch2 {
    public static void main(String[] args) {
        /*
        double resultat = 0;
        double tall1 = Double.parseDouble(showInputDialog("Skriv inn tall 1"));
        double tall2 = Double.parseDouble(showInputDialog("Skriv inn tall 2"));
        String regneart = showInputDialog(" +, - , * , /");


        switch(regneart) {
            case "+":
                resultat = tall1 + tall2;
                break;
            case "-":
                resultat = tall1 - tall2;
                break;
            case "*":
                resultat = tall1 * tall2;
                break;
            case "/":
                resultat = tall1 / tall2;
                break;
            default:
                resultat = 0;
                break;
        }
        showMessageDialog(null, "Resultatet ble: " + tall1 + " " + regneart + " " + tall2 + " = " + resultat);

         */

        /*
        if (regneart.equals("+")) {
            resultat = tall1 + tall2;
        }
        if (regneart.equals("-")) {
            resultat = tall1 - tall2;
        }
        if (regneart.equals("*")) {
            resultat = tall1 * tall2;
        }
        if (regneart.equals("/")) {
            resultat = tall1 / tall2;
        }
        showMessageDialog(null, "Resultatet ble: " + tall1 + " " + regneart + " " + tall2 + " = " + resultat);

         */
        /*
        String innAlder = showInputDialog("Skriv inn din alder");
        int høyeste = 70;
        int alder = Integer.parseInt(innAlder);
        if (alder>=høyeste) {
            System.out.println("Du kan ta førerkorter for bil, men må ha årlige legesjekker.");
        }
        else if (alder >= 18) {
            System.out.println("Du kan ta førerkorter for bil og du trenger ikke årlige legesjekker");
        }
        else {
            System.out.println("Du er for ung til å ta førerkort for bil.");
        }

         */

        String month = showInputDialog("Skriv inn en måned.");
        if (month.equals("mars") || month.equals("april") || month.equals("mai")) {
            System.out.println("Årstiden er vår.");
        }
        else if (month.equals("juni") || month.equals("juli") || month.equals("august")) {
            System.out.println("Årstiden er sommer.");
        }
        else if (month.equals("september") || month.equals("oktober") || month.equals("november")) {
            System.out.println("Årstiden er høst.");
        }
        else {
            System.out.println("Årstiden er vinter.");
        }


    }
}
