/*
2. BMI Calculator
You have been asked to write a Java program to implement a BMI (Body Mass Index) calculator. 
The program should have the following functionality:

The BMI calculator class should have the following fields:
    a. height: A double field to store the height of the person in meters.
    b. weight: A double field to store the weight of the person in kilograms.

The BMI calculator class should have the following methods:
    a. A constructor to initialize the height and weight fields of the BMI calculator object.
    b. Getter and setter methods.
    c. Double calculateBMI(): A method to calculate the BMI of the person using the following formula:
            BMI = weight / (height * height).

Write a Java program that creates an object of the BMI calculator class, prompts the user to input their 
height and weight, sets the height and weight fields of the BMI calculator object using the setter methods, 
calculates the BMI using the
calculateBMI() method, and prints the calculated BMI to the console.
 */
import java.util.Scanner;
class BMICalculator
 {
    public double height;
    public double weight;

    public BMICalculator()
    {

    }
    public void setHeight(double height)
    {
        this.height = height ;
    }
    public double getHeight(double height)
    {
        return this.height ;
    }
    public void setWeight(double weight)
    {
        this.weight = weight;
    }
    public double getWeight(double weight)
    {
        return this.weight ;
    }
 }

public class BMI
{
    private static Scanner sc = new Scanner(System.in);
    private BMICalculator bmi = new BMICalculator();
    double ht ;
    double wt ;

    public void acceptRecord()
    {
        System.out.println("Enter height in meters : ");
        ht = sc.nextDouble();
        bmi.setHeight( ht);
        System.out.println("Enter weight in kilograms : ");
        wt = sc.nextDouble();
        bmi.setHeight( wt);       
    }

    public void printRecord()
    {
        System.out.println("Height  : " +this.ht+"(m)"); 
        System.out.println("Weight  : " +this.wt+"(kg)");
    }

    public void calculateBMI()
    {
        double BMI = this.wt / (this.ht * this.ht); 
        System.out.println("BMI : " +BMI);
    }
    public static void main(String[] args)
    {
        BMI test = new BMI ();
        test.acceptRecord();
        test.printRecord();
        test.calculateBMI();

    }

}
