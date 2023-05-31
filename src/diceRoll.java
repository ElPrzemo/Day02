import java.util.Scanner;

public class diceRoll {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int result = (int) (Math.random() * 6 + 1);

        System.out.println("Zgagnij wylosowaną liczbę");
        int userNumber = scanner.nextInt();

        if (userNumber == result) {
            System.out.println("Brawo zgadłeś liczbę, masz nosa! ");
        } else {
            System.out.println("Próbuj szczęścia dalej");
        }

        System.out.println("Wylosowana liczba to: " + result);
    }
}
