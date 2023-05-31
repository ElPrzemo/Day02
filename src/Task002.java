import java.util.Scanner;

public class Task002 {

    public static final double boundaryIncom = 85.528;
    public static final double firstTaxBracket = 0.18;
    public static final double secondTaxBracket = 0.32;


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj swój dochód za zedszły rok: ");
        double incom = scanner.nextDouble();


        if (incom <85.528){
           System.out.println("Musisz zapłacić " + ((incom - 562) * firstTaxBracket)  + " podatku ku chwale Mateusza/Vateusza! ");

        } else if (incom >= 85.528){

           System.out.println("Musisz zapłacić " + ((incom - boundaryIncom ) * secondTaxBracket + 14839.02) + " podatku ku chwale Mateusza/Vateusza!");

        }

}}