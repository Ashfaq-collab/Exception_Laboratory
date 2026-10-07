package experiments;

public class Experiment02_MultipleCatch {
    public static void main(String[] args) {

        try {

            int[] numbers = {10, 20, 30};

            System.out.println(numbers[5]);

        } catch (ArithmeticException e) {

            System.out.println("Arithmetic problem");


        }
        catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Array index problem");

        }
        catch (Exception e) {

            System.out.println("Some other exception");

        }

        System.out.println("Program finished");
    }
}
