import java.util.Scanner;

public class ifBasics {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą");

        int userNumber = scanner.nextInt();


        boolean isFive = userNumber == 5;
        System.out.println("Twoja liczba równa 5: " + isFive);

        boolean isGreaterThenFive = userNumber > 5;
        System.out.println("Twoja liczba jest większa niż 5: " + isGreaterThenFive);



/*
        if (userNumber == 5 ){
            System.out.println("Liczba równa jest 5");
        }else {
            System.out.println("Liczba nie jest równa 5");
        }

 */
    }
}
