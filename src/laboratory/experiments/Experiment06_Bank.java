package experiments;

import exceptions.InsufficientBalanceException;

public class Experiment06_Bank {

    static void withdraw(double balance, double amount)
            throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException(
                    "Insufficient balance"
            );
        }

        System.out.println("Withdrawal successful");
    }

    public static void main(String[] args) {

        try {

            withdraw(1000, 1500);

        } catch (InsufficientBalanceException e) {

            System.out.println(e.getMessage());
        }
    }
}
//extends Exception
//which makes our custom exception checked.
//extends RuntimeException
//which makes it unchecked.