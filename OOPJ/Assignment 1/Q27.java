/*
27.Write a program to perform below operations on Double type to get: 
    a. The number of bits used to represent a double value 
    b. The number of bytes used to represent a double value 
    c. The minimum value a double 
    d. The maximum value a double
 */
public class Q27 {
    public static void main(String[] args)
    {
         System.out.println(Double.SIZE);
         System.out.println(Double.BYTES);
         System.out.println(Double.MIN_VALUE);
         System.out.println(Double.MAX_VALUE);
    }

}