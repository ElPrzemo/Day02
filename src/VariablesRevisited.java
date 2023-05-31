public class VariablesRevisited {


    //globalne zmienne mają ustawione pewną wartośc
    static int intValue;

    static double doubleValue;

    static String stringValue;


    public static void main(String[] args) {
        System.out.println(intValue);
        System.out.println(doubleValue);
        System.out.println(stringValue);

        //null brak wartości
        // to nie to samo co ""

        System.out.println(stringValue);
        System.out.println("");


        //lokalne zmienne nie mają żadnej wartości
        int localInt;
        double localDouble;
        String localStringl;



    }
}
