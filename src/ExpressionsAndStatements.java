public class ExpressionsAndStatements {
    public static void main(String[] args) {
        // Expressions
        //1+2;

        // Statements
        int a = 1;

        System.out.println("I am a statement as well!");

        System.out.println(1+2);

        //IfStatements
        int x=2;
        int y=3;

        if (x>y) {
            System.out.println("X is greater than Y");
        }

        if (x<y) {
            System.out.println("X is less than Y");
        }

        if (x==y) {
            System.out.println("X is equal to Y");
        }

        //IfElseStatment
        int waterTemperature = 20;

        String aggregateStat;
        if (waterTemperature<=0) {
            aggregateStat = "frozen";
        } else if (waterTemperature>=100) {
            aggregateStat = "boiling";
        } else{
            aggregateStat = "liquid";
        }
        System.out.println(aggregateStat);

        // booleanExp ? exp1 : exp2

        int  b = 5;
        int c= 3;

        String relationship=(x>y) ? "bigger" : "smalller";
        System.out.println(relationship);
    }
}
