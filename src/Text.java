import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text;
        String option;

        System.out.println("Podaj napis:");
        text= scanner.nextLine();

        System.out.println(" Wybierz polecenie");
        System.out.println(" 1.Wypisz tekst wielkimi literami ");
        System.out.println(" 2.Wybierz tekst małymi literami ");
        System.out.println(" 3. Podaj długość tekstu");

        option=scanner.nextLine();


        switch (option) {
            case "1" -> {
                String output = text.toUpperCase();
                System.out.println(output);
            }
            case "2" -> {
                String output2 = text.toLowerCase();
                System.out.println(output2);
            }
            case "3" -> {
            int length = text.length();
                System.out.println("Długość wiadomości to: " + length);
            }
        }

    }
}
