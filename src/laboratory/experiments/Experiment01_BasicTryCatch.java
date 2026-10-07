package experiments;

public class Experiment01_BasicTryCatch {

    public static void main(String[] args) {

        System.out.println("Laboratory started");

        try {
            int result = 10 / 2;

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {

            System.out.println("Exception caught!");
            System.out.println("Message: " + e.getMessage());
        }

        System.out.println("Laboratory finished");
    }
}
