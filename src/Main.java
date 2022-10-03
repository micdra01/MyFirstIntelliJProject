import Entities.StringExercises;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringExercises exercises = new StringExercises();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Exercise 1) surround the input with tags like \"jeppe\" -> \"<jeppe>\". Type your input below:");
        exercises.exercise1(scanner.nextLine());
        System.out.println("Exercise 2) count the amount of characters in the input and write the number of characters to the screen. Type your input below:");
        exercises.exercise2(scanner.nextLine());
        System.out.println("Exercise 3) seperate each character in the string with a \"@\". Type your input below:");
        exercises.exercise3(scanner.nextLine());
        System.out.println("Exercise 4) write the input characters backwards. Type your input below:");
        exercises.exercise4(scanner.nextLine());
        System.out.println("Exercise 5) Convert the input to morse code. Type your input below:");
        exercises.exercise5(scanner.nextLine());
        System.out.println("Exercise 6) Check if the string contains the words \"horse\", \"saddle\" or \"spores\" and if present, substitute them with an equal amount of \"*\". Type your name below:");
        exercises.exercise6(scanner.nextLine());
        System.out.println("Exercise 7) palindrome. Type your input below:");
        exercises.exercise7(scanner.nextLine());
        System.out.println("Exercise 8) make the text alternate caps. Type your input below:");
        exercises.exercise8(scanner.nextLine());
        System.out.println("Exercise 9) make 1337 5|*34|< out of it. Type your input below:");
        exercises.exercise9(scanner.nextLine());
        scanner.close();
    }
}