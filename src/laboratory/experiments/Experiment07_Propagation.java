package experiments;

public class Experiment07_Propagation {

    static void methodC() {

        int result = 10 / 0;

        System.out.println(result);
    }

    static void methodB() {

        methodC();

    }

    static void methodA() {

        methodB();

    }

    public static void main(String[] args) {

        try {

            methodA();

        } catch (ArithmeticException e) {

            System.out.println("Exception handled in main");
            System.out.println(e.getMessage());
        }

        System.out.println("Program finished");
    }
}