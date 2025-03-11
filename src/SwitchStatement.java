public class SwitchStatement {

    public static void main(String[] args) {
        int day = 5;

        String readableDay;

        switch (day) { //switch schaut welcher der cases True ist (einfacher und kürzer als if-else)
            case 1 -> readableDay = "Monday";
            case 2 -> readableDay = "Tuesday";
            case 3 -> readableDay = "Wednesday";
            case 4 -> readableDay = "Thursday";
            case 5 -> readableDay = "Friday";
            case 6 -> readableDay = "Saturday";
            case 7 -> readableDay = "Sunday";
            default -> readableDay = "Invalid"; //fals keiner der Fälle (cases) korrekt ist wird das Ausgegeben
        }

        //man kann das SwitchStatement direkt bei der Zuweisung hinzufügen um den
        //Code kompakter zu machen. So kann man Redundanz im Code reduzieren
        String readableDay2 = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid";
        };

        System.out.println(readableDay);
        System.out.println(readableDay2);
    }
}
