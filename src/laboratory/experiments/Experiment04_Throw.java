package experiments;

public class Experiment04_Throw {
    public static void main(String[] args) {

        int age = 15;

        try {

            if (age < 18) {
                throw new IllegalArgumentException(
                        "Age must be 18 or above"
                );
            }

            System.out.println("Access granted");

        } catch (IllegalArgumentException e) {

            System.out.println("Access denied");
            System.out.println(e.getMessage());
        }

        System.out.println("Program finished");
    }
}
