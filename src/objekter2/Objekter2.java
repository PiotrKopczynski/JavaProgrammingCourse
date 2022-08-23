package objekter2;

import javax.swing.*;

class Bil {
    private String farge;
    private int HK;

    /*public Bil(String farge) {
        this.farge = farge;
    }
     */
    public void setFarge(String farge) {
        this.farge=farge;
    }
    public String getFarge() {
        return farge;
    }

    public void setHK(int HK) {
        if (HK>0) {
            this.HK = HK;
        }
    }
    public int getHK() {
        return HK;
    }
}

class Person {
    private String fornavn;
    private String etternavn;
    private String adresse;
    private int telefonnr;

    public Person(String fornavn, String etternavn,
                  String adresse, int telefonnr) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.adresse = adresse;
        this.telefonnr = telefonnr;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }
    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public void setTelefonnr(int telefonnr) {
        this.telefonnr = telefonnr;
    }

    public String getFornavn() {
        return fornavn;
    }
    public String getEtternavn() {
        return etternavn;
    }
    public String getAdresse() {
        return adresse;
    }
    public int getTelefonnr() {
        return telefonnr;
    }
}

class BensinKjøp {
    private String sted;
    private String type;
    private double literFylt;
    private double pris;
    private String tidspunkt;

    public BensinKjøp(String sted, String type,
        double literFylt, double pris, String tidspunkt) {
        this.sted = sted;
        this.type = type;
        this.literFylt = literFylt;
        this.pris = pris;
        this.tidspunkt = tidspunkt;
    }

    public void setSted(String sted) {
        this.sted = sted;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setLiterFylt(double literFylt) {
        this.literFylt = literFylt;
    }
    public void setPris(double pris) {
        this.pris = pris;
    }
    public void setTidspunkt(String tidspunkt) {
        this.tidspunkt = tidspunkt;
    }
    public String getSted() {
        return sted;
    }
    public String getType() {
        return type;
    }
    public double getLiterFylt() {
        return literFylt;
    }
    public double getPris() {
        return pris;
    }
    public String getTidspunkt() {
        return tidspunkt;
    }
    public double finnTotalPrisen() {
        return pris*literFylt;
    }
}

class Konto {
    private String navn;
    private int kontonummer;
    private double saldo;

    public Konto(String navn, int kontonummer, double saldo) {
        this.navn = navn;
        this.kontonummer = kontonummer;
        this.saldo = saldo;
    }
    public void kontoutskrift() {
        JOptionPane.showMessageDialog(null,"navn: "
        + navn + "\n kontonummer: " + kontonummer + "\nsaldo: "
        + saldo);
    }

    public String settInn(double beløp) {
        this.saldo+=beløp;
        return "Den nye saldoen er " + saldo;
    }

    public String taUt(double beløp) {
        if (saldo>=beløp) {
            saldo-=beløp;
            return "Din nye saldo er: " + saldo;
        }
        else {
            return "Din saldo på" + saldo +
                    "kr er for lav for å ta ut " + beløp + "kr";
        }
    }
}

class Vind {
    private double vindHastighet = 0.0;

    public Vind(double vindhastighet) {
        this.vindHastighet = vindhastighet;
    }

    public double getVindHastighet(){
        return vindHastighet;
    }

    public void typeVind() {
        if (vindHastighet <= 2) {
            System.out.println("Det er vindstille");
        }
        else if (vindHastighet >= 120) {
            System.out.println("Det er en orkan");
        }
        else {
            System.out.println("Who knows xd");
        }
    }

    public double getKnop() {
        return vindHastighet/1.852;
    }

    public int getBeaufort() {
        double beaufort = Math.pow((vindHastighet/3.01),0.6666)+0.5;
        return (int) beaufort;
    }


}

public class Objekter2 {
    public static void main(String[] args) {
        /*
        Bil volvo = new Bil();
        String farge = volvo.getFarge();
        System.out.println(farge);
         */
        /*
        BensinKjøp test = new BensinKjøp("CirkleK","diesel",
                25.5,24.05,"23.08.2022.09:46");
        double total = test.finnTotalPrisen();
        System.out.println(String.format("%.2f",total));
         */
        /*
        Konto test = new Konto("Piotr",1234, 55000.5);
        System.out.println(test.settInn(10000));
        System.out.println(test.taUt(65000));
         */
        Vind vind = new Vind(125);
        System.out.println(vind.getVindHastighet());
        vind.typeVind();
        System.out.println(vind.getKnop());
        System.out.println(vind.getBeaufort());
    }
}
