/*
8. Rational Number Calculator

You are required to write a Java program to perform arithmetic operations on rationalnumbers. 
Rational numbers are numbers that can be expressed as a fraction of twointegers (i.e., numerator and denominator).
The program should take the following inputs from the user:

Two rational numbers (i.e., two pairs of integers representing the numerator and denominator of each number)
The program should then perform the arithmetic operation on the two rational numbers and output the result in the
form of a reduced fraction (i.e., the numerator and denominator should be as small as possible).

Example Input
    Enter the first rational number:
    Numerator: 2
    Denominator: 3
    Enter the second rational number:
    Numerator: 1
    Denominator: 6
    Enter the arithmetic operation (+, -, *, /): *
 */

 import java.util.Scanner;
 class rational_num_calc{
     int numerator_1;
     int denominator_1;
     int numerator_2;
     int denominator_2;
     int ans_numerator;
     int ans_denominator;
     int lcm;
     public rational_num_calc(int numerator_1, int denominator_1, int numerator_2, int denominator_2) {
         this.numerator_1 = numerator_1;
         this.denominator_1 = denominator_1;
         this.numerator_2 = numerator_2;
         this.denominator_2 = denominator_2;
     }
     public rational_num_calc(){
 
     }
     void print(){
         System.out.println(this.numerator_1+" / "+this.denominator_1);
         System.out.println(this.numerator_2+" / "+this.denominator_2);
         System.out.println(this.ans_numerator+" / "+this.ans_denominator);
 
     }
     void addition(){
         if (this.denominator_1==this.denominator_2)
         {
             this.ans_numerator=this.numerator_1+this.numerator_2;
             this.ans_denominator=this.denominator_1;
         }
         else {
             this.find_lcm(denominator_1, denominator_2);
             this.numerator_1=this.numerator_1*(this.lcm/this.denominator_1);
             this.numerator_2=this.numerator_2*(this.lcm/this.denominator_2);
             this.ans_numerator=this.numerator_1+this.numerator_2;
             this.ans_denominator=this.lcm;
             for(int i=this.ans_denominator;i>30;i--)
             {
                 if(this.ans_denominator%i==0&&this.ans_numerator%i==0)
                  {
                     this.ans_denominator=this.ans_denominator/i;
                     this.ans_numerator=this.ans_numerator/i;
                  }
             }
         }
 
     }
     void subtraction(){
         if (this.denominator_1==this.denominator_2)
         {
             this.ans_numerator=this.numerator_1-this.numerator_2;
             this.ans_denominator=this.denominator_1;
         }
         else {
             this.find_lcm(denominator_1, denominator_2);
             this.numerator_1=this.numerator_1*(this.lcm/this.denominator_1);
             this.numerator_2=this.numerator_2*(this.lcm/this.denominator_2);
             this.ans_numerator=this.numerator_1-this.numerator_2;
             this.ans_denominator=this.lcm;
             for(int i=this.ans_denominator;i>0;i--)
             {
                 if(this.ans_denominator%i==0&&this.ans_numerator%i==0)
                  {
                     this.ans_denominator=this.ans_denominator/i;
                     this.ans_numerator=this.ans_numerator/i;
                  }
             }
         }
     }
     void multiplication(){
         this.ans_numerator=this.numerator_1*this.numerator_2;
         this.ans_denominator=this.denominator_1*this.denominator_2;
         for(int i=this.ans_denominator;i>0;i--)
             {
                 if(this.ans_denominator%i==0&&this.ans_numerator%i==0)
                  {
                     this.ans_denominator=this.ans_denominator/i;
                     this.ans_numerator=this.ans_numerator/i;
                  }
             }
 
 
     }
     void division(){
         this.ans_numerator=this.numerator_1*denominator_2;
         this.ans_denominator=this.numerator_2*denominator_1;
         for(int i=this.ans_denominator;i>0;i--)
             {
                 if(this.ans_denominator%i==0&&this.ans_numerator%i==0)
                  {
                     this.ans_denominator=this.ans_denominator/i;
                     this.ans_numerator=this.ans_numerator/i;
                  }
             }
 
     }
     void find_lcm(int a, int b){
         this.lcm= (a*b)/find_gcd(a,b);
 
     }
     int find_gcd(int a, int b){
         if(b==0){
             return a;
         }
         else{
             return find_gcd(b,a%b);
 
         }
 
    
     }
     
 
 
 
 }
 public class RationalNumber {
     public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         System.out.println("Enter First number");
         System.out.print("Numerator :");
         int num1=sc.nextInt();
         System.out.print("denominator :");
         int den1=sc.nextInt();
         System.out.println("Enter second number");
         System.out.print("Numerator :");
         int num2=sc.nextInt();
         System.out.print("denominator :");
         int den2=sc.nextInt();
         rational_num_calc obj= new rational_num_calc(num1,den1,num2,den2);
 
         System.out.println("Enter your choice \n1.addition \n2.subtraction \n3.multiplication \n4.division");
         switch (sc.nextInt())
         {
             case 1:{obj.addition();
             
             obj.print();
             }             
             break;
             case 2:{ obj.subtraction();
             obj.print();
             }
                 break;
             case 3:{obj.multiplication();
             obj.print();
             }
                 break;
             case 4:{obj.division();
             obj.print();
                 }    
                 break;
         }
     }
 }
 