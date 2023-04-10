/*
11.Accept character from command line and perform below operations. Here you can use charAt() method to
 extract character:
a. Check whether entered character is letter or digit. If it is digit then print its values as well as code point.
b. If it is character then check whether it is in lowercase? If it is in lowercase then convert it into
 upper case and print it well as its code point. If it is in uppercase then convert it into lower case and 
 print it well as its code point.
 */
public class Q11 {
    public static void main(String[] args) {
        String str = "A";
        char ch = str.charAt(0);
        int codePoint = ( int )ch;
        System.out.println(ch+" "+codePoint);
      }
      public static void main1(String[] args) {
        char ch = 'A';
        int codePoint = ( int )ch;
        System.out.println("Code Point  : "+codePoint);
      }
    }

