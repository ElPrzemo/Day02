import java.util.Scanner;

public class Homework {
    
        public static int greatestComonDivisor(int a, int b)
        {
            if (b == 0)
            {
                return a;
            }
            else
            
            {
                return greatestComonDivisor(b, a%b);
            }
        }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz pierwszą liczbę: ");
        int a = scanner.nextInt();
        System.out.println("Wpisz drugą liczbę: ");
        int b = scanner.nextInt();


        System.out.println("Poniżej podajemy największy wspólny dzielnik podanych liczb: ");
        System.out.println(greatestComonDivisor(a, b));

        scanner.close();
    }
}

