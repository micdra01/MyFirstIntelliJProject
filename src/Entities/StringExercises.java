package Entities;

public class StringExercises {
    /**
     * Exercise 1:
     * surround the input with tags like: "jeppe" -> "<jeppe>". Print the result to the screen
     */
    public static String exercise1(String input) {
        String output = "<" + input + ">";
        return output;
    }

    /**
     * Exercise 2:
     * count the amount of characters in the input and write the number of characters to the screen
     */
    public static int exercise2(String input) {
        int nameLength = input.length();
        return nameLength;
    }

    /**
     * Exercise 3:
     * seperate each character in the string with a "@"
     */
    public static String exercise3(String input) {
        String output = "@";
        for (int i = 0; i < input.length(); i++) {
            output = output + input.charAt(i) + "@";
        }
        return output;
    }

    /**
     * Exercise 4:
     * write the input characters backwards
     */
    public static String exercise4(String input) {
        String output = "";
        for (int i = (input.length() - 1); i >= 0; i--) {
            output = output + input.charAt(i);
        }
        return output;
    }

    /**
     * Converts a char to morse code
     */
    private static String getMorse(char c) {
        switch (Character.toLowerCase(c)) {
            case 'a':
                return ".-";
            case 'b':
                return "-...";
            case 'c':
                return "-.-.";
            case 'd':
                return "-..";
            case 'e':
                return ".";
            case 'f':
                return "..-.";
            case 'g':
                return "--.";
            case 'h':
                return "....";
            case 'i':
                return "..";
            case 'j':
                return ".---";
            case 'k':
                return "-.-";
            case 'l':
                return ".-..";
            case 'm':
                return "--";
            case 'n':
                return "-.";
            case 'o':
                return "---";
            case 'p':
                return ".--.";
            case 'q':
                return "--.-";
            case 'r':
                return ".-.";
            case 's':
                return "...";
            case 't':
                return "-";
            case 'u':
                return "..-";
            case 'v':
                return "...-";
            case 'w':
                return "...-";
            case 'x':
                return "-..-";
            case 'y':
                return ".-..";
            case 'z':
                return "--..";
            case ' ':
                return " ";
            default:
                return "ERROR!";

        }
    }

    /**
     * Exercise 5:
     * Convert the input to morse code
     */
    public static String exercise5(String input) {
        String output = "";
        for (int æ = 0; æ < input.length(); æ++) {
            char å = input.charAt(æ);
            output = output + (getMorse(å) + " ");
        }
        return output;
    }

    /**
     * Exercise 6:
     * Check if the string contains the words "horse", "saddle" or "spores" and if present, substitute them with an equal amount of "*".
     */
    public static String exercise6(String input) {
        input = input.replaceAll("horse", "*****");
        input = input.replaceAll("saddle", "******");
        input = input.replaceAll("spores", "******");
        return input;
    }

    /**
     * Exercise 7: palindrome
     */
    public static String exercise7(String input) {
        String output = "";
        for (int i = input.length(); i > 0; i--) {
            int l = i - 1;
            char x = input.charAt(l);
            output = output + x;
        }
        return input + output;
    }

    /**
     * Exercise 8: make the text alternate caps.
     * e.g. "hi my name is peter" -> "Hi My NaMe Is PeTeR", ignore spaces when using caps
     */
    public static String exercise8(String input) {
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            char x = input.charAt(i);
            if (Character.isWhitespace(x)) {

            }
            if (i % 2 == 0) {
                x = Character.toUpperCase(x);
                output = output + x;
            } else
                output = output + x;
        }
        return output;
    }

    /**
     * Exercise 9:
     * make 1337 5|*34|< out of it.
     */
    public static String exercise9(String input) {
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            char x = input.charAt(i);
            output = output + (getLeetSpeak(x) + " ");
        }
        return output;
    }

    /**
     * Converts a char to Leet Speak
     */

    public static <Char> String getLeetSpeak(Char c) {
        switch (Character.toLowerCase((Character) c)) {
            case 'a':
                return "4";
            case 'b':
                return "|3";
            case 'c':
                return "(";
            case 'd':
                return "|)";
            case 'e':
                return "3";
            case 'f':
                return "|=";
            case 'g':
                return "6";
            case 'h':
                return "|-|";
            case 'i':
                return "|";
            case 'j':
                return "9";
            case 'k':
                return "|<";
            case 'l':
                return "1";
            case 'm':
                return "|v|";
            case 'n':
                return "|/|";
            case 'o':
                return "0";
            case 'p':
                return "|*";
            case 'q':
                return "0,";
            case 'r':
                return "|2";
            case 's':
                return "5";
            case 't':
                return "7";
            case 'u':
                return "|_|";
            case 'v':
                return "|/";
            case 'w':
                return "|/|/";
            case 'x':
                return "><";
            case 'y':
                return "`/";
            case 'z':
                return "2";
            case ' ':
                return " ";
            default:
                return "ERROR!";

        }
    }
}

