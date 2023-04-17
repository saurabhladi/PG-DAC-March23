/*
4. Electricity Bill Calculation

Create a class named "ElectricityBill" that has the following instance variables:
    a. customerName (String)
    b. unitsConsumed (double)
    c. billAmount (double)

Create a constructor that initializes the customerName and unitsConsumed instance variables.

Define a method named "calculateBillAmount" that calculates the bill amount based
on the number of units consumed. The formula for calculating the bill amount is:
    a. For the first 100 units: Rs. 5 per unit
    b. For the next 200 units: Rs. 7 per unit
    c. For the remaining units: Rs. 10 per unit

Implement the "calculateBillAmount" method in the "ElectricityBill" class.
Define a main method that creates an object of the "ElectricityBill" class and sets the
customerName and unitsConsumed instance variables. 
Then, call the "calculateBillAmount" method to calculate the bill amount and display the
customerName, unitsConsumed, and billAmount.
 */


import java.util.*;
class ElectricityBill{
   String customerName;
   double unitsConsumed;
   double billAmount; 

   ElectricityBill(String customerName , double unitsConsumed){
    this.customerName = customerName;
    this.unitsConsumed = unitsConsumed;
   }

   public void calculateBillAmount(){
    if(this.unitsConsumed <= 100){
        this.billAmount = unitsConsumed * 5 ;
    }
    else if(this.unitsConsumed > 100 && this.unitsConsumed <=200)
        this.billAmount =  (100 * 5) + (unitsConsumed -100 )* 7 ;
    else
    this.billAmount = (100 * 5) + (100)* 7 + (unitsConsumed-200) * 10 ;
   }


public String getCustomername(){
    return this.customerName;
}

public double getUnitsConsumed(){
    return this.unitsConsumed;
}

public double getBillAmount(){
    return this.billAmount;
}
}


public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Customer Name : ");
        String customerName = sc.nextLine();
        System.out.println("Units Consumed : ");
        double unitsConsumed = sc.nextDouble();
        
        ElectricityBill electBill =  new ElectricityBill(customerName,unitsConsumed);

        electBill.calculateBillAmount();

        System.out.println("Customer Name :                 "+electBill.getCustomername());
        System.out.println("Total Units Consumed :          "+electBill.getUnitsConsumed());
        System.out.println("Total Electricity Bill Amount : "+electBill.getBillAmount());
    }
}