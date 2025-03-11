public class FloatingPointCalc {
    public static void main(String[] args) {
        System.out.println(5/2); // bei Ganzzahlen Division wird auch eine ganz Zahl ausgegeben.

        System.out.println(5.0/2.0); //bei Dezimalzahlen Division wird auch eine Dezimal Zahl ausgegeben.

        System.out.println(5.0/2); //nur eine Zahl muss eine Deziamlzahl sein.

        System.out.println(10.0f-0.1f-0.1f); // float hat eine ungenauigkeit was zu einem anderem Ergebniss führt

        System.out.println(10000.0f+0.0001f);// besser mit double darstellen

    }
}
