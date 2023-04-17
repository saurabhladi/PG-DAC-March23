/*
9. Date Class
You are required to write a Java program to implement a Date class.
The Date class should have the following fields:
a. day: An integer field to store the day of the month.
b. month: An integer field to store the month of the year.
c. year: An integer field to store the year.
The Date class should have the following methods:
a. isValid(): A method to check if the date is valid or not. A date is considered
valid if it is a valid date of the Gregorian calendar, and has a day, month, and
year that are within a reasonable range.
b. getDayOfWeek(): A method to return the day of the week for the given date,
where Sunday is represented by 0, Monday by 1, and so on.
c. isLeapYear(): A method to check if the year of the given date is a leap year or
not.

d. getNextDay(): A method to return the date of the next day.
e. getPreviousDay(): A method to return the date of the previous day.
Example Usage
Date date = new Date(31, 12, 2022);
System.out.println(date.isValid()); // true
System.out.println(date.getDayOfWeek()); // 6 (Saturday)
System.out.println(date.isLeapYear()); // false
Date nextDay = date.getNextDay();
System.out.println(nextDay); // 01-01-2023
Date previousDay = date.getPreviousDay();
System.out.println(previousDay); // 30-12-2022 
*/


import java.text.SimpleDateFormat;

import java.util.Scanner;
import java.util.Date;
class date_check {
int  month;
int year;
int day;
int [] days={31,28+ is_leap_year(this.year),31,30, 31, 30, 31, 31, 30, 31, 30, 31};

 

public date_check(int month, int year, int day) {
    this.month = month;
    this.year = year;
    this.day = day;
}
boolean is_valid(){
    if (year < 1 || year > 9999) {
        return false;
    }
    
     if (month < 1 || month > 12) {
        return false;
    }
    
    if (day < 1 || day > 31) {
        return false;
    }
    
    if (day > getDaysInMonth(year, month)) {
        return false;
    }
    
    
    return true;
} 
int getDaysInMonth(int month, int year){
    int [] days={31,28+ is_leap_year(this.year),31,30, 31, 30, 31, 31, 30, 31, 30, 31};

    return days[this.month-1];
}

int is_leap_year(int year)
{
    if ( (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) )
    return 1;
    else 
    return 0;
}

void get_next_day(){
if(days[this.month]<=this.day)
    {   if(this.month==12)
        {
        this.day=1;
        this.month=1;
        this.year++;
        }
        this.day=1;
        this.month++;
    }
    else this.day++;

}
void get_prev_day(){
    if(this.month==1&&this.day==1){
        this.month=12;
        this.day=31;
        this.year--;
    }
    if(this.day==1)
    {
        this.month--;
        this.day=days[this.month];

    }
    else  this.day--;
    
}

}

public class date {
    public static void main(String[] args)throws Exception {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter date in format dd/MM/yy");
        String str= sc.next();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Date date= sdf.parse(str);
        System.out.println(date.getDate());
        System.out.println(date.getMonth());
        System.out.println(date.getYear());
        System.out.println(date.getDate());
        date_check obj= new date_check(date.getMonth()+1,date.getYear()+1900,date.getDate());
        boolean flag=obj.is_valid();
        System.out.println(flag);
        obj.get_next_day();
        System.out.println(obj.day+" / "+obj.month+" / "+obj.year);
        obj.get_prev_day();
        System.out.println(obj.day+" / "+obj.month+" / "+obj.year);
        




        
    }
    
}
