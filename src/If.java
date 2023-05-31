import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą");

        int userNumber = scanner.nextInt();



        if (userNumber == 5 ){
            System.out.println("Liczba równa jest 5");
        }else {
            System.out.println("Liczba nie jest równa 5");
        }


    }
}
