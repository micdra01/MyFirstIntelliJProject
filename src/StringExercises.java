public class StringExercises {
    /**
     * Exercise 1:
     * surround the input with tags like: "jeppe" -> "<jeppe>". Print the result to the screen
     */
    public void exercise1(String input) {
        String output = "<" + input + ">";
        System.out.println("Exercise 1) " + output);
    }

    /**
     * Exercise 2:
     * count the amount of characters in the input and write the number of characters to the screen
     */
    public void exercise2(String input) {
        int nameLength = input.length();
        System.out.println("Exercise 2) " + "Length: " + nameLength);
    }

    /**
     * Exercise 3:
     * seperate each character in the string with a "@"
     */
    public void exercise3(String input) {
        System.out.print("Exercise 3) ");
        for (int i = 0; i < input.length(); i++) {
            System.out.print(input.charAt(i) + "@");
        }
        System.out.println("");
    }

    /**
     * Exercise 4:
     * write the input characters backwards
     */
    public void exercise4(String input) {
        System.out.print("Exercise 4) ");
        for (int i = (input.length() - 1); i >= 0; i--) {
            System.out.print(input.charAt(i));
        }
        System.out.println("");
    }

    /**
     * Converts a char to morse code
     */
    private String getMorse(char c) {
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
    public void exercise5(String input) {
        System.out.print("Exercise 5) ");
        for (int æ = 0; æ < input.length(); æ++) {
            char å = input.charAt(æ);
            System.out.print(getMorse(å) + " ");
        }
        System.out.println(" ");
    }

    /**
     * Exercise 6:
     * Check if the string contains the words "horse", "saddle" or "spores" and if present, substitute them with an equal amount of "*".
     */
    public void exercise6(String input) {
        input = input.replaceAll("horse", "*****");
        input = input.replaceAll("saddle", "******");
        input = input.replaceAll("spores", "******");
        System.out.println("Exercise 6) " + input);
    }

    /**
     * Exercise 7: palindrome
     */
    public void exercise7(String input) {
        System.out.print("Exercise 7) " + input + "|");
        for (int i = input.length(); i > 0; i--) {
            int l = i - 1;
            char x = input.charAt(l);
            System.out.print(x);
        }
        System.out.println(" ");
    }

    /**
     * Exercise 8: make the text alternate caps.
     * e.g. "hi my name is peter" -> "Hi My NaMe Is PeTeR", ignore spaces when using caps
     */
    public void exercise8(String input) {
        System.out.print("Exercise 8) ");
        for (int i = 0; i < input.length(); i++) {
            char x = input.charAt(i);

            if (i % 2 == 0) {
                x = Character.toUpperCase(x);
                System.out.print(x);
            } else
                System.out.print(x);
        }
        System.out.println(" ");
    }

    /**
     * Exercise 9:
     * make 1337 5|*34|< out of it.
     */
    public void exercise9(String input) {

    }

    public String getLeetSpeak(Char c) {
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
}

