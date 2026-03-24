class Calculator {

    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method to add two floating-point numbers
    double add(double a, double b) {
        return a + b;
    }

    // Method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Exp7{
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        // Calling overloaded methods
        System.out.println("Addition of two integers: " + calc.add(5, 10));
        System.out.println("Addition of two floats: " + calc.add(5.5, 2.5));
        System.out.println("Addition of three integers: " + calc.add(2, 3, 4));
    }
}