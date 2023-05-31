import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int userYear;

        System.out.println("Wpisz rok: ");
        userYear = scanner.nextInt();


        if (((userYear % 4 == 0) && (userYear % 100 != 0)) || (userYear % 400 == 0)) {
            System.out.println("Podany rok jest przestępny");

        } else {
            System.out.println("Podany rok jest nieprzesteny ");
        }
    }
}
