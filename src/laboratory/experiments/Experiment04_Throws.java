package experiments;

public class Experiment04_Throws {

    static void checkAge(int age) throws Exception {

        if (age < 18) {
            throw new Exception("Age is below 18");
        }

        System.out.println("Age accepted");
    }
//      throw:  Actually throws an exception
//      throws: Declares that a method may throw an exception

    public static void main(String[] args) {

        try {
            checkAge(15);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Program finished");
    }
}
