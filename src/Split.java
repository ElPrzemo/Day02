

import java.util.Scanner;


public class Split {
    public static void main(String[] args) {

        Scanner text = new Scanner(System.in);
        System.out.println("Wpisz swój tekst: ");
        String sentence = text.nextLine();


        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true;

        for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);

            if (Character.isWhitespace(currentChar)) {
                capitalizeNext = true;
            } else if (Character.isLetter(currentChar)) {
                if (capitalizeNext) {
                    currentChar = Character.toUpperCase(currentChar);
                    capitalizeNext = false;
                }

                result.append(currentChar);
            }
        }
        String formattedSentence = result.toString();
        System.out.print(formattedSentence);
    }}

// extracted(formattedSentence);


   /* private void String extracted(String formattedSentence) {
        String[] parts = formattedSentence.split(" ");
        for (String s : parts) {
            System.out.print(s);
        }

    */

