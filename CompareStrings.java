import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        if (str1.equals(str2)) {
            System.out.println("The two given strings are equal.");
        } else {
            System.out.println("The two given strings are NOT equal.");
        }

        char firstChar1 = str1.charAt(0);
        char firstChar2 = str2.charAt(0);

        System.out.println("The first character of the first string is: " + firstChar1);
        System.out.println("The first character of the second string is: " + firstChar2);

        if (firstChar1 == firstChar2) {
            System.out.println("The first characters of both strings are the same.");
        } else {
            System.out.println("The first characters of both strings are different.");
        }

        scanner.close();
    }
}
