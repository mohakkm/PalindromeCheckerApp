import java.util.Scanner;

public class UseCase13PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input : ");
        String input = scanner.nextLine();

        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        long startTime = System.nanoTime();

        boolean isPalindrome = true;
        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;

        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + executionTime + " ns");

        scanner.close();
    }
}