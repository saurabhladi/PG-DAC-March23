/*
1. Date and Time Converter
Accept date and time from user. You are required to write a Java program to convert
dates and times between different formats.
The program should be able to convert dates between the following formats:
    a. dd/mm/yyyy (e.g., 31/12/2022)
    b. mm/dd/yyyy (e.g., 12/31/2022)
    c. yyyy/mm/dd (e.g., 2022/12/31)
The program should be able to convert times between the following formats:
    a. hh:mm:ss (e.g., 23:59:59)
    b. hh:mm:ss a (e.g., 11:59:59 PM)
    c. hh:mm (e.g., 23:59)
The program should be able to convert dates and times between the following
formats:
    a. dd/mm/yyyy hh:mm:ss (e.g., 31/12/2022 23:59:59)
    b. mm/dd/yyyy hh:mm:ss a (e.g., 12/31/2022 11:59:59 PM)
    c. yyyy/mm/dd hh:mm (e.g., 2022/12/31 23:59)

 */

import java.util.*;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
class Q1 {
public static void main(String[] args) throws Exception{
    Scanner sc= new Scanner(System.in);

 /*
The program should be able to convert dates between the following formats:
a. dd/mm/yyyy (e.g., 31/12/2022)
b. mm/dd/yyyy (e.g., 12/31/2022)
c. yyyy/mm/dd (e.g., 2022/12/31)
*/
     
    System.out.println("Dates Formats ");
    SimpleDateFormat sdf = new SimpleDateFormat( "dd/MM/yyyy");
    System.out.println("Enter the date (dd/MM/yyyy):");
    String strDate=sc.nextLine();
    Date date = sdf.parse(strDate);
    
    SimpleDateFormat sdf1 = new SimpleDateFormat( "dd/MM/yyyy");
    SimpleDateFormat sdf2 = new SimpleDateFormat( "MM/dd/yyyy");
    SimpleDateFormat sdf3 = new SimpleDateFormat( "yyyy/MM/dd");
  
    String strDate1 = sdf1.format(date);
    String strDate2 = sdf2.format(date);
    String strDate3 = sdf3.format(date);
 
/*
The program should be able to convert times between the following formats:
a. hh:mm:ss (e.g., 23:59:59)
b. hh:mm:ss a (e.g., 11:59:59 PM)
c. hh:mm (e.g., 23:59)
*/

    System.out.println("Time Formats ");
    System.out.println("Enter time : Hours");
    int hour = sc.nextInt();
    System.out.println("Enter time : mins");
    int mins = sc.nextInt();
    System.out.println("Enter time : secs");
    int secs = sc.nextInt();
    LocalTime time = LocalTime.of(hour,mins,secs);
 
    DateTimeFormatter dtf1= DateTimeFormatter.ofPattern("hh:mm:ss");
    DateTimeFormatter dtf2= DateTimeFormatter.ofPattern("hh:mm:ss a");
    DateTimeFormatter dtf3= DateTimeFormatter.ofPattern("hh:mm");
 

/*
The program should be able to convert dates and times between the following
formats:
a. dd/mm/yyyy hh:mm:ss (e.g., 31/12/2022 23:59:59)
b. mm/dd/yyyy hh:mm:ss a (e.g., 12/31/2022 11:59:59 PM)
c. yyyy/mm/dd hh:mm (e.g., 2022/12/31 23:59)
*/   
    System.out.println("Date Formats");
    System.out.println( "dd/MM/yyyy   "+strDate1 );
    System.out.println( "MM/dd/yyyy   "+strDate2 );
    System.out.println( "yyyy/MM/dd   "+strDate3 );
    System.out.println();
   
 
    System.out.println("Time Formats");
    System.out.println( "hh:mm:ss     "+dtf1.format(time));
    System.out.println( "hh:mm:ss a   "+dtf2.format(time));
    System.out.println( "hh:mm        "+dtf3.format(time));
    System.out.println();
 
 
   
 
    System.out.println("Time Date Format ");
    System.out.println( "dd/MM/yyyy   hh:mm:ss    "+" "+strDate1+"  "+dtf1.format(time));
    System.out.println( "MM/dd/yyyy   hh:mm:ss a  "+" "+strDate2+"  "+dtf2.format(time));
    System.out.println( "yyyy/MM/dd   hh:mm       "+" "+strDate3+"  "+dtf3.format(time));
    sc.close();
   }
}