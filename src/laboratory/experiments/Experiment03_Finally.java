package experiments;

public class Experiment03_Finally {
    public static void main(String[] args) {

        try {
            int result = 10 / 0;
        } finally {
            System.out.println("Finally executed");
        }

        System.out.println("Program finished");
    }
    //finally normally executes whether an exception occurs or not.

}
