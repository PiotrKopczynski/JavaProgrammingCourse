package ifsetninger1;

import javax.swing.*;

public class IfSetninger1 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Fyll inn alderen din: ");
        int alder = Integer.parseInt(input);
        if (alder < 13) {
            JOptionPane.showMessageDialog(null, "Du er et barn");
        }
        else if (alder < 18) {
            JOptionPane.showMessageDialog(null, "Du er en ungdom");
        }
        else if (alder < 70) {
            JOptionPane.showMessageDialog(null, "Du er voksen");
        }
        else {
            JOptionPane.showMessageDialog(null, "Du er et pensjonist");
        }
    }
}
