/*
7. Toll Booth Bill Generator
You are required to write a Java program to implement a Toll Booth Bill Generator.
The program should be able to calculate the toll fee for each vehicle based on the
number of axles and the distance travelled. The program should also be able to
generate a bill for each vehicle.
Each vehicle should have the following information:
a. Vehicle type (String)
b. Number of axles (int)
c. Distance Information
Each toll booth should have the following information:
a. Distance travelled (double)
b. Toll Fee Calculation
Core Java Assignment 2
Designed by Sandeep Kulange
The program should be able to calculate the toll fee for each vehicle based on the
following criteria:
a. Cars, vans, and buses pay a base rate of $0.25 per mile for each axle.
b. Trucks pay a base rate of $0.50 per mile for each axle.
The program should be able to generate a bill for each vehicle based on the following
criteria:
a. The bill should include the vehicle type, number of axles, distance travelled,
toll fee, and total amount due.
b. The total amount due should include a $2.00 processing fee.
c. The toll fee calculation and total amount due should not be accessible outside
of the class.
The program should have the following methods:
a. calculateTollFee(): A method to calculate the toll fee for a given vehicle based
on the number of axles and distance travelled.
b. generateBill(): A method to generate a bill for a given vehicle based on the toll
fee and total amount due.
c. showMenu(): A method to show the menu options for the user to input the
vehicle information.
The program should have the following fields:
a. vehicleType: A string field to store the type of vehicle.
b. numAxles: An integer field to store the number of axles.
c. distanceTraveled: A double field to store the distance traveled.
d. tollFee: A double field to store the calculated toll fee.
e. totalAmountDue: A double field to store the total amount due.
The program should show the following menu options:
a. Enter vehicle type (car, van, bus, or truck)
b. Enter number of axles
c. Enter distance travelled
d. Calculate toll fee
e. Generate bill
f. Exit
 */



 import java.util.Scanner;
 
 class TollFee
 {
     private String vehicleType;
     private int axle;
     private double distanceTravel;
     private double totalFee;
     private double finalAmountDue;
     private final double CAR_VAN_BUS_rate = 0.25;
     private final double TRUCK_rate = 0.5;
     
     Scanner sc= new Scanner(System.in);
     
     public void showMenu()
     {
         int choice=0;
         
         System.out.println("Enter the type of vehicle(Car/Van/Bus/Truck): ");
         vehicleType= sc.next();
         System.out.println("Enter the number of Axles: ");
         axle = sc.nextInt();
         System.out.println("Enter the Distance Travelled: ");
         distanceTravel = sc.nextDouble();
         System.out.println();
         
         while(choice != 3)
         {
         System.out.println("How can i help you...?");
         System.out.println("1. Calculate toll fee.");
         System.out.println("2. Generate Bill.");
         System.out.println("3. Exit.");
         choice= sc.nextInt();
         
         if(choice == 1)
         {
             calculateTollFee();
             System.out.println("Toll Fee: $" + totalFee);
         }
         
         else if(choice == 2)
         {
             generateBill();
             System.out.println("Final Bill: $" + finalAmountDue);
             break;
         }
         else if(choice == 3)
         {
             choice=3;
         }
         else {
             System.out.println("Plese Chose correct Choice!!!");
         }
         
         System.out.println();
         
         }		
     }
 
     private void calculateTollFee() {
         if(vehicleType.equalsIgnoreCase("Truck"))
         {
             totalFee = axle * TRUCK_rate * distanceTravel; 
         }
         else {
             totalFee = axle * CAR_VAN_BUS_rate * distanceTravel;
         }
     }
     
     private void generateBill() {
         finalAmountDue = totalFee + 2;
     }
 }
 
 
 public class Q7 {
 
     public static void main(String[] args) {
         TollFee tollFee = new TollFee();
         tollFee.showMenu();
         System.out.println("Thank you for visiting...");
     }
 
 }
 