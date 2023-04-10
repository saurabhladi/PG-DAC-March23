/*
18. Write a program to find minimum and maximum number as well as to add two integer numbers 
using methods of Integer.
 */
class Q18 {
    public static void main(String[]args){

        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int sum = x+y;
        System.out.println("Addition of two numbers :   "+sum);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        

    }

}