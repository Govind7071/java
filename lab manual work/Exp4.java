public class Exp4{
    public static void main(String[] args) {

        // Check if argument is passed
        if (args.length == 0) {
            System.out.println("Please provide a number as command line argument.");
            return;
        }

        // Convert argument to integer
        int num = Integer.parseInt(args[0]);
        int original = num;
        int reversed = 0;

        // Reverse the number
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }

        // Check palindrome
        if (original == reversed) {
            System.out.println(original + " is a Palindrome Number.");
        } else {
            System.out.println(original + " is NOT a Palindrome Number.");
        }
    }
}