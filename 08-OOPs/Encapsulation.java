/*
 * File: Encapsulation.java
 *
 * Definition:
 * Encapsulation is binding data and methods together
 * and hiding data using private access.
 *
 * Why important:
 * - Data security
 * - Controlled access
 *
 * Interview Questions:
 * Q1. How to achieve encapsulation?
 * → Using private variables + getters/setters
 */

class Account {

    // Private data members
    private double balance;

    // Getter
    public double getBalance() {
        return balance;
    }

    // Setter
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        }
    }
}

public class Encapsulation {

    public static void main(String[] args) {

        Account acc = new Account();
        acc.setBalance(5000);

        System.out.println("Account Balance: " + acc.getBalance());
    }
}
