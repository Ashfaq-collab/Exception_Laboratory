package experiments;

import exceptions.InvalidAgeException;

public class Experiment06_CustomException {
    static void checkAge(int age) throws InvalidAgeException {

    if (age < 18) {
        throw new InvalidAgeException(
                "Age must be 18 or above"
        );
    }

    System.out.println("Age accepted");
}

    public static void main(String[] args) {

        try {

            checkAge(15);

        } catch (InvalidAgeException e) {

            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("Program finished");
    }
}
