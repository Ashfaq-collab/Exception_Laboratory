package experiments;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Experiment05_Checked {
    public static void main(String[] args) {

        try {

            FileReader file = new FileReader("data.txt");

            System.out.println("File opened");

        } catch (FileNotFoundException e) {

            System.out.println("File was not found");
        }

        System.out.println("Program finished");
    }
}
//Checked	                                Unchecked
//Compiler checks	                        Compiler doesn't require handling
//Must catch or declare	                    No mandatory catch/throws
//Usually external conditions	            Usually programming/runtime problems
//IOException	                            NullPointerException
//FileNotFoundException	                    ArithmeticException
