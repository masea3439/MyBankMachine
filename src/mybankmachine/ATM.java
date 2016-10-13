/*
 * =
 */
package mybankmachine;

/**
 *
 * @author masea3439
 */
public class ATM {

    String bankName;
    double balance;

    public ATM(String bankNameI, double balanceI) {
        bankName = bankNameI;
        balance = balanceI;
    }

    public void deposite(double depositeI) {
        balance = balance + depositeI;
    }

    public void withdraw(double withdrawI) {
        if (balance - withdrawI <= 0) {
            System.out.println("Not enaugh minerals");
        } else {
            balance = balance - withdrawI;
        }
    }

    public String toString() {
        String output;
        output = (bankName + " ATM \n");
        output += ("Your current balance is: $" + balance + "\n");
        return output;
    }
}
