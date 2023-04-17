/*
5. Telephone Bill Calculation

You are required to write a Java program to calculate the telephone bill for a givencustomer based on their usage.
The program should take the following inputs from the user:
    a. Customer name
    b. Phone number
    c. Number of calls made
    d. Duration of calls (in minutes)

The program should then calculate the bill for the customer based on the following criteria:
    a. The first 100 calls are charged at a rate of 50 cents per call.
    b. Calls beyond the first 100 are charged at a rate of 25 cents per call.
    c. All calls are subject to a minimum duration of 1 minute.
    d. Calls with a duration less than 1 minute are rounded up to 1 minute.
    e. There is a flat rate of ₹10 per month for all customers.
 */

import java.util.Scanner;
class CustomerInfo{
    String customerName;
    long phoneNumber;
    int numberOfcalls;
    float durations;
    double amount;

    CustomerInfo(String customerName,long phoneNumber,int numberOfcalls,float durations)
    {
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.numberOfcalls = numberOfcalls;
        this.durations = durations;
    }

    void Phonebill()
    {
        if(numberOfcalls <=100)
        {
            this.amount = (0.5 * numberOfcalls) +10;
        }
        else if(numberOfcalls>100)
        {
            this.amount = (100*0.5) + ((numberOfcalls-100)*0.25)+10;
        }
    
    
        System.out.println("Telephone bill is                         : "+"Rs. "+amount);
    }

}

class TelePhoneBill{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Customer name                       : ");
        String customerName = sc.nextLine();
        System.out.print("Enter phone number                        : ");
        long phoneNumber = sc.nextLong();
        System.out.print("Enter number of calls made                : ");
        int numberOfcalls = sc.nextInt();
        System.out.print("Enter duration of calls made(in minutes)  : ");
        float durations = sc.nextFloat();

        CustomerInfo info = new CustomerInfo(customerName,phoneNumber,numberOfcalls,durations);
        info.Phonebill();



    }
}