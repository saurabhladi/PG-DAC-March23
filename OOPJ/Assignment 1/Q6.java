/*
Q 6.Write a program to perform below operations on Boolean type to convert:
a. boolean value into String
b. boolean value into Boolean instance.
c. String value into boolean value
d. String value into Boolean instance.
*/

class Q6
{
    public static void main(String [] args)
    {
        
    // a. boolean value into String
        //using String.valueOf()
        boolean b1 = true;
        String s1 = String.valueOf(b1);
        System.out.println(s1);

        //using Boolean.toString()
        boolean b2 = false;
        String s2 = Boolean.toString(b2);
        System.out.println(s2);

    // b. boolean value into Boolean instance.
        boolean b3 = new Boolean ("true");
        System.out.println(b3);

   // c. String value into boolean value    
        String s4 = "Hii";
        boolean b4 = Boolean.parseBoolean(s4);
        System.out.println(b4);

        String s5 = "true"; // anything except true will return false
        boolean b5 = Boolean.parseBoolean(s5);
        System.out.println(b5);

    // d. String value into Boolean instance.   
        String s6 = "Helllo";
        Boolean b6 = new Boolean(s6);
        System.out.println(b6);

    }
}