import java.sql.SQLOutput;

public class VatCalculator {
    public static void main(String[] args) {
        double MwStSatz = 0.19;
        double NettoPreis = 20.50;
        double MwStBetrag = NettoPreis*MwStSatz;
        double BruttoPreis = NettoPreis+MwStBetrag;
        String waerhung=" €";

        System.out.println("Netto: " + NettoPreis + waerhung);
        System.out.println("MwSt. " + (int)(MwStSatz*100) + " % : " + MwStBetrag + waerhung);
        System.out.println("Brutto: " + BruttoPreis + waerhung);

    }
}
