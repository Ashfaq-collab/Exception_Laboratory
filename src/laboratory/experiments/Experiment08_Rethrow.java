package experiments;

public class Experiment08_Rethrow {

    static void process() {

        try {

            int result = 10 / 0;

        } catch (ArithmeticException e) {

            System.out.println("Logging exception...");
            throw e;
        }
    }

    public static void main(String[] args) {

        try {

            process();

        } catch (ArithmeticException e) {

            System.out.println("Exception handled in main");
        }

        System.out.println("Program finished");
    }
}
