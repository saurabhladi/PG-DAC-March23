/*
Q 7.Write a program to perform below operations on byte type to get: 
a. The number of bits used to represent a byte value
b. The number of bytes used to represent a byte value
c. The minimum value a byte 
d. The maximum value a byte
 */

 class Q7
 {
    public static void main(String [] args)
    {
        System.out.println("Size  : "+ Byte.SIZE);
        System.out.println("Bytes : "+ Byte.BYTES);
        System.out.println("Min_value : "+ Byte.MIN_VALUE);
        System.out.println("Max_value : "+ Byte.MAX_VALUE);
    }

 }