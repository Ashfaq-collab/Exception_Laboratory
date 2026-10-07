package experiments;

import java.io.FileReader;
import java.io.IOException;

public class Experiment09_Resources {

    public static void main(String[] args) {

        try (FileReader reader = new FileReader("data.txt")) {

            System.out.println("File opened");

        } catch (IOException e) {

            System.out.println("File error");
        }
    }
}
