package experiments;

public class Experiment08_Chaining {

    static void databaseOperation() throws Exception {

        throw new Exception("Database connection failed");
    }

    static void service() throws Exception {

        try {

            databaseOperation();

        } catch (Exception e) {

            throw new Exception(
                    "Service operation failed",
                    e
            );
        }
    }

    public static void main(String[] args) {

        try {

            service();

        } catch (Exception e) {

            System.out.println("Message: " + e.getMessage());
            System.out.println("Cause: " + e.getCause().getMessage());
        }
    }
}
//throw e;
//Throw the existing exception again.
//throw new Exception("New message", e);
//Create a new exception while preserving the original exception as its cause.