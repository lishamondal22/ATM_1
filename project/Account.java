package project;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Account {
    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
    public int setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
        return customerNumber;
    }
    public int getCustomerNumber() {
        return customerNumber;
    }
    public int setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
        return pinNumber;
    }
    public int getPinNumber() {
        return pinNumber;
    }
    public double getCheckingBalance() {
        return checkingBalance;
    }
    public double getSavingBalance() {
        return savingBalance;
    }
    public double calcCheckingWithdraw(double amount) {
        checkingBalance = (checkingBalance - amount);
        return checkingBalance;
    }
    public double calcSavingWithdraw(double amount) {
        savingBalance = (savingBalance - amount);
        return savingBalance;
    }
    public double calcCheckingDeposit(double amount) {
        checkingBalance = (checkingBalance + amount);
        return checkingBalance;
    }
    public double calcSavingDeposit(double amount) {
        savingBalance = (savingBalance + amount);
        return savingBalance;
    }
    public void getCheckingWithdawInput() {
        System.out.println("checking account balance: " + moneyFormat.format(getCustomerNumber()));
        System.out.print("amount you want to withdraw from checking account: ");
        double amount = input.nextDouble();
        if ((checkingBalance - amount) >= 0) {
            calcCheckingWithdraw(amount);
            System.out.println("new checking account balance: " + moneyFormat.format(checkingBalance));
        } else {
            System.out.println("balance cannot be negative." + "\n");
        }
    }
    public void getSavingWithdawInput() {
        System.out.println("saving account balance: " + moneyFormat.format(savingBalance));
        System.out.print("amount you want to withdraw from saving account: ");
        double amount = input.nextDouble();
        if ((savingBalance - amount) >= 0) {
            calcSavingWithdraw(amount);
            System.out.println("new saving account balance: " + savingBalance + "\n");
        } else {
            System.out.println("balance cannot be negative." + "\n");
        }
    }
    public void getCheckingDepositInput() {
        System.out.println("checking account balance: " + moneyFormat.format(checkingBalance));
        System.out.print("amount you want to deposit from checking account: ");
        double amount = input.nextDouble();
        if ((checkingBalance + amount) >= 0) {
            calcCheckingDeposit(amount);
            System.out.println("new checking account balance: " + moneyFormat.format(checkingBalance));
        } else {
            System.out.println("balance cannot be negative." + "\n");
        }
    }
    public void getSavingDepositInput() {
        System.out.println("saving account balance: " + moneyFormat.format(savingBalance));
        System.out.print("amount you want to deposit to saving account: ");
        double amount = input.nextDouble();
        if ((savingBalance - amount) >= 0) {
            calcSavingDeposit(amount);
            System.out.println("new saving account balance: " + moneyFormat.format(savingBalance));
        } else {
            System.out.println("balance cannot be negative." + "\n");
        }
    }
    private int customerNumber;
    private int pinNumber;
    private double checkingBalance = 0;
    private double savingBalance = 0;
}