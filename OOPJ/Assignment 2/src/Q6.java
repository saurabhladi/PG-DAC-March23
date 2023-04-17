/*
6. Bank Account Management System
You are required to write a Java program to manage bank accounts. The program
should be able to perform the following operations:
a. Create a new account
b. Deposit money into an account
c. Withdraw money from an account
d. Display the account balance
e. Display the account holder's information
Each account should have the following information:
a. Account holder's name (String)
b. Account number (int)
Core Java Assignment 2
Designed by Sandeep Kulange
c. Account balance (double)
The program should be able to perform the following operations:
a. Create a new account: The program should prompt the user to enter the
account holder's name, and generate a unique account number for the new
account. The initial account balance should be zero.
b. Deposit money into an account: The program should prompt the user to enter
the account number and the amount to be deposited. If the account number is
valid, the program should add the amount to the account balance. If the
account number is not valid, the program should display an error message.
c. Withdraw money from an account: The program should prompt the user to
enter the account number and the amount to be withdrawn. If the account
number is valid and the account balance is sufficient, the program should
deduct the amount from the account balance. If the account number is not
valid or the account balance is insufficient, the program should display an
error message.
d. Display the account balance: The program should prompt the user to enter
the account number and display the current balance for that account. If the
account number is not valid, the program should display an error message.
e. Display the account holder's information: The program should prompt the
user to enter the account number and display the account holder's name and
current balance for that account. If the account number is not valid, the
program should display an error message.
 
*/

import java.util.Scanner;

class SBI{
    private String accName;
    private int accNumber;
    private double balance;

    void set()
    {
        Scanner in=new Scanner(System.in);

        System.out.println("0.Exit");
        System.out.println("1.Create a new account");
        System.out.println("2.Deposit money ");
        System.out.println("3.Withdraw money");
        System.out.println("4.account balance");
        System.out.println("5.account holder's information");
        System.out.print("Enter your choose : ");
        int choose=in.nextInt();

        while(choose != 0)
        {
            switch(choose)
            {
                case 1:
                        System.out.print("Enter your name : ");
                        in.nextLine();
                        this.accName=in.nextLine();
                        this.accNumber=2023001;
                        this.balance=0.0;  
                        break;
                case 2:
                        System.out.print("Enter your Account number : ");
                        if(this.accNumber != in.nextInt()){
                               System.out.println("Invalid Account number!!");
                               break;
                        }
                        System.out.print("Enter deposit amount : ");
                        this.balance+=in.nextDouble();
                        break;
                case 3:
                        System.out.print("Enter your Account number : ");
                        if(this.accNumber != in.nextInt()){
                               System.out.println("Invalid Account number!!");
                               break;
                        }
                        System.out.print("Enter withdraw amount : ");
                        double w=in.nextInt();
                        if(this.balance < w ){
                               System.out.println("Insufficient Fund :");
                               break;
                        }

                        this.balance-=w;
                        System.out.println("Your current balance is : "+this.balance);
                        break;
                case 4:
                        System.out.print("Enter your Account number : ");
                        if(this.accNumber != in.nextInt()){
                               System.out.println("Invalid Account number!!");
                               break;
                        }
                        System.out.println("Your current balance is : "+this.balance);
                        break;
                case 5:
                        System.out.print("Enter your Account number : ");
                        if(this.accNumber != in.nextInt()){
                               System.out.println("Invalid Account number!!");
                               break;
                        }
                        System.out.println("Account name : "+this.accName);
                        System.out.println("Account no. : "+this.accNumber);
                        System.out.println("Balance : "+this.balance);
                        break;
            }
        }

     }
 }
 class Q6 {
    public static void main(String[] arg)
    {
        SBI s1=new SBI();
        s1.set(); 
    }
}