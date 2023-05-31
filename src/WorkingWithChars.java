public class WorkingWithChars {

    public static void main(String[] args) {

        char char1 = 'a';
        char char2 = 'A';

        System.out.println("char 1 " + char1);
        System.out.println("char 2 " + char2);

        System.out.println("########################");
        System.out.println("########################");
        System.out.println("########################");

        //znaki specjalne
        // \t-tabulator
        // \n-nowa linia
        // \r-powrót karetki

        System.out.println("Witaj świecie");
        char tabulator = '\t';
        System.out.println(tabulator + "witaj świecie");
        System.out.println(tabulator + tabulator + "witaj świecie ");

        //znaki specjalne można używać także w Stringu

        System.out.println("Zaraz pojawi się tekst w noweej linii \nO właśnie ten");


        System.out.println("Powrót \rkaretki");






    }
}
