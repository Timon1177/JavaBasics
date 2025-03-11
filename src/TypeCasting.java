public class TypeCasting {
    public static void main(String[] args) {
        // Widening Type Cast || umwandeln von Daten ohne Verlust z.B. von int in double geht ohne zusatz
        double wideningCast = 5;
        System.out.println(wideningCast);

        // Narrowing Type Cast || umwandeln von Daten mit Verlust z.B. von double in int erfordert eine Datenen Spezifizerung "(Datatyp)"
        int simpleCast = (int) 5.5;
        System.out.println(simpleCast);

        int castingResult = (int) (5.0 / 2.5);
        System.out.println(castingResult);

        double castingOrder = 5.0 / (int) 2.5; // die 2.5 wird durch das Casting in 2 umgewandelt und dadurch wird 5 / 2 gerrechnet.
        System.out.println(castingOrder);
    }
}
