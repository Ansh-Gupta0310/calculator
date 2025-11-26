public class TestCalculatorApp {
    public static void main(String[] args) {
        System.out.println("Running Tests...");

        // Test Addition
        if (CalculatorApp.add(5, 3) == 8.0) {
            System.out.println("Test Passed: 5 + 3 = 8");
        } else {
            System.err.println("Test Failed: Addition");
            System.exit(1);
        }

        // Test Subtraction
        if (CalculatorApp.subtract(10, 4) == 6.0) {
            System.out.println("Test Passed: 10 - 4 = 6");
        } else {
            System.err.println("Test Failed: Subtraction");
            System.exit(1);
        }
    }
}
