/*
28.Write a program to convert:
    a. double value into String
    b. double value into Double instance.
    c. String instance into Double instance.
    d. double value into binary, octal and hexadecimal string
    (Note: Here you can use doubleToLongBits() method along with methods of Long class).
 */
public class Q28 {
    public static void main(String[] args){
        //double value into String
        double n = 10;
        String s1=String.valueOf(n);
        System.out.println(s1);
    
        //double value into double instance
        Double n1 = new Double(n);
        System.out.println(n1);
        //String instance into float instance
        String S2="11";
        String S3=new String(S2);
        System.out.println(S3);
        Double n2= new Double(S3);
        System.out.println(n2);
    
        }

}