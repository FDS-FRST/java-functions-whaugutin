import java.util.Arrays;
import java.util.List;

public class Main {

    /**
     * Returns the input name as a string.
     *
     * @param name the name to be returned
     * @return the input name
     */
    public static String greet(String name) {
        throw new UnsupportedOperationException("Not yet implemented!");
    }


    /**
     * Adds two integers and returns their sum.
     *
     * @param a the first integer to add
     * @param b the second integer to add
     * @return the sum of the two integers
     */
    public static int add(int a, int b) {
        throw new UnsupportedOperationException("Not yet implemented!");
    }

    /**
     * Checks if a number is even.
     *
     * @param number
     * @return
     */
    public static boolean isEven(int number) {
        throw new UnsupportedOperationException("Not yet implemented!");
    }

    /**
     * Calculates the area of a circle with a given radius.
     *
     * @param radius
     * @return
     */
    public static double areaOfCircle(double radius) {
        throw new UnsupportedOperationException("Not yet implemented!");
    }

    /**
     * Grades a student based on their score.
     * 90 - A
     * 80 - B
     * 70 - C
     * 60 - D
     * otherwise - F
     *
     * @param score
     * @return
     */
    public static String grade(int score) {
        throw new UnsupportedOperationException("Not yet implemented!");
    }

    /**
     * Returns the maximum of three numbers.
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static int maxOfThree(int a, int b, int c) {
        throw new UnsupportedOperationException("Not yet implemented!");
    }

    /**
     * Converts Celsius to Fahrenheit.
     *
     * @param celsius
     * @return
     */
    public static double toFahrenheit(double celsius) {
        throw new UnsupportedOperationException("Not yet implemented!");
    }

    /**
     * Applies a discount to a price.
     *
     * @param price
     * @param discount
     * @return
     */
    public static double applyDiscount(double price, double discount) {
        throw new UnsupportedOperationException("Not yet implemented!");
    }


    /**
     * Find even numbers from a list.
     *
     * @param numbers
     * @return
     */
    public static List<Integer> filterEvenNumbers(List<Integer> numbers) {
        throw new UnsupportedOperationException("Not yet implemented!");
    }

    /**
     * Calculates factorial of a number.
     *
     * @param n
     * @return
     */
    public static int factorial(int n) {
        throw new UnsupportedOperationException("Not yet implemented!");
    }

    /**
     * Calculates fibonacci number.
     *
     * @param n
     * @return
     */
    public static int fibonacci(int n) {
        throw new UnsupportedOperationException("Not yet implemented!");
    }


    // ================= TEST RUNNER =================

    public static void main(String[] args) {
        System.out.println("🔍 Running Java Version Tests...\n");

        int passed = 0, failed = 0;

        passed += check("greet Alice", greet("Alice").equals("Alice"));
        passed += check("add", add(3, 5) == 8);
        passed += check("isEven true", isEven(4));
        passed += check("areaOfCircle", Math.abs(areaOfCircle(2) - 12.57) < 0.02);
        passed += check("grade A", grade(95).equals("A"));
        passed += check("maxOfThree", maxOfThree(3, 9, 6) == 9);
        passed += check("toFahrenheit", Math.abs(toFahrenheit(20) - 68) < 0.1);
        passed += check("discount", Math.abs(applyDiscount(100, 10)) == 90);
        passed += check("filterEvenNumbers",
                filterEvenNumbers(Arrays.asList(1, 2, 3, 4, 5, 6)).equals(Arrays.asList(2, 4, 6)));
        passed += check("factorial", factorial(5) == 120);
        passed += check("fibonacci", fibonacci(6) == 8);

        System.out.println("\n🎯 Tests passed: " + passed + " / 15");
    }

    private static int check(String name, boolean result) {
        if (result) {
            System.out.println("✅ " + name);
            return 1;
        } else {
            System.out.println("❌ " + name);
            return 0;
        }
    }
}
