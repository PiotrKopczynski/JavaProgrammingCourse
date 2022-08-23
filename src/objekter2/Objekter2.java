package objekter2;

class Bil {
    private String farge;

    public Bil(String farge) {
        this.farge = farge;
    }

    public String getFarge() {
        return farge;
    }
}

public class Objekter2 {
    public static void main(String[] args) {
        Bil volvo = new Bil("Rød");
        String farge = volvo.getFarge();
        System.out.println(farge);
    }
}
