/*
21.Write a program to convert state of Long instance into byte, short, int, long, float and double.
 */
public class Q21 {
    public static void main(String[] args){
        Long N1=new Long("25");
        byte b=N1.byteValue();
        System.out.println(b);
        short s=N1.shortValue();
        System.out.println(s);
        int i =N1.intValue();
        System.out.println("int:"+i);
        long l =N1.longValue();
        System.out.println("long:"+l);
        float f =N1.floatValue();
        System.out.println("float:"+f);
        double d =N1.doubleValue();
        System.out.println("double:"+d);
}


}