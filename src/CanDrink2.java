import java.util.Scanner;

public class CanDrink2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userAge;
        int userMoney;

        final int boundaryAge = 18;
        final int beerPrice = 5;

        System.out.println("Podaj swój wiek");
        userAge = scanner.nextInt();

        System.out.println("Podaj ile masz kasy");
        userMoney = scanner.nextInt();


        if (userAge >= boundaryAge && userMoney >= beerPrice){
            System.out.println("Możesz kupić piwo");
        }else if (userAge < boundaryAge){
            System.out.println("Jesteś za młody");
        }else if (userMoney < beerPrice) {
            System.out.println("Nie masz kasy ziomek");
        }

    }
}
