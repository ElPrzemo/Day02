import java.util.Scanner;

public class Feever {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double userTemperature;

        System.out.println("Podaj temperaturę ciała: ");
        userTemperature = scan.nextDouble();

        if(userTemperature >=37.0){
            System.out.println("Masz stan podgorączkowy/gorączke");
        }else if (userTemperature>=36.6){
            System.out.println("Jest ok");
        }else {
            System.out.println("Jesteś osłabiony");
        }
    }
}
