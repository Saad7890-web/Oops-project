package Git;

import java.util.Scanner;

class ATM{
    float balance;
    int pin = 5674;


    ATM(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your pin:");
        int entered_pin = sc.nextInt();

        if(entered_pin == pin){
            menu();
        }
        else{
            System.out.println("Enter a valid pin");
            menu();
        }
    }

    public void menu(){
        System.out.println("Enter your choice");
        System.out.println("1. check Balance");
        System.out.println("2. withdraw money");
        System.out.println("3, Deposit money");
        System.out.println("4, Exit");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if(opt==1){
            checkBalance();
        }
        else if (opt==2) {
            withDraw();
        }
        else if(opt == 3){
            depositMoney();
        }
        else if(opt == 4){
            return;
        }
        else{
            System.out.println("Enter a valid Choice");
        }
    }
    public void checkBalance(){
        System.out.println("Balance "+ balance);
        menu();
    }
    public void withDraw(){
        System.out.println("Enter Amount");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();

        if(amount > balance){
            System.out.println("INSUFFICIENT BALANCE");
        }
        else{
            balance -= amount;
            System.out.println("Successful");
        }

        menu();
    }
    public void depositMoney(){
        System.out.println("Enter Amount to deposit: ");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();

        balance += amount;
        System.out.println("Successful");

        menu();
    }
}

public class Main {
        public static void main(String[] args) {
            ATM obj = new ATM();
        }
    }

