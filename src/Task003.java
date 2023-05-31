import java.util.Scanner;

public class Task003 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Napisz sms");
        String sentence = scanner.nextLine();
        String formattedSentence = formatSentence(sentence);

        System.out.println(formattedSentence);
    }

    public static String formatSentence(String sentence) {
        String[] words = sentence.trim().split("\\s+");

        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                String formattedWord = word.substring(0, 1).toUpperCase() + word.substring(1);
                result.append(formattedWord);
            }
        }

        return result.toString();
    }}

