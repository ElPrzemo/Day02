import java.util.Scanner;

public class TASK01 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj swoją wagę w kilogramach: ");
        int weight = scanner.nextInt();

        System.out.println("Podaj swój wzrost w metrach");
        double height = scanner.nextDouble();

        double bmiIndex =  (double) weight / (Math.pow(height,2));

        System.out.println("Twoje BMI wynosi: " + bmiIndex);

    }
}
