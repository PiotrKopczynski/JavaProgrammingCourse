package objekter2;

import java.util.ArrayList;

class Dato {
    private int dag,måned,år;

    public Dato(int dag, int måned, int år) {
        this.dag=dag;
        this.måned=måned;
        this.år = år;
    }

    private static String månedsnavn(int mnd) {
        String[] navn = {"januar","februar","mars","april",
        "mai","juni","juli","august","september","oktober",
        "november","desember"};
        if (mnd>0 && mnd<13) {
            return navn[mnd-1];
        }
        else{
            return "ukjent måned";
        }
    }
    public String toString() {
        return "Dag: " + dag + "\nMåned: " + månedsnavn(måned) +
                "\nÅr: " + år;
    }
}

class Biler {
    private String type;
    private Dato førsteRegistrering;
    private String skiltnummer;

    public Biler(String type, Dato førsteRegistrering, String skiltnummer) {
        this.type = type;
        this.førsteRegistrering = førsteRegistrering;
        this.skiltnummer = skiltnummer;
    }

    public String toString() {
        return "Type: " + type + "\nFørstegangsregistrert: "
                + førsteRegistrering + "\nKjennetegn: " + skiltnummer;
    }
}

public class MotorvognReg {
    public static void main(String[] args) {
        ArrayList<Biler> array = new ArrayList<>();
        Biler audi = new Biler("Audi A6", new Dato(21,12,1998), "KU 585909");
        Biler volvo = new Biler("Volvo Giga", new Dato(22,15,1998), "KU 585909");
        array.add(audi);
        array.add(volvo);
        for (Biler bil : array) {
            System.out.println(bil);
        }
    }
}
