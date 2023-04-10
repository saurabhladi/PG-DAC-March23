/*
32.Write a program to accept and print full name as an argument from command line.
*/

class Q32
{
    public static void main(String [] args)
    {
        System.out.print(args[0]+" "+args[1]+" "+args[2]);
  
    }
}


// OR
// class Q32
// {
//     public static void main(String [] args)
//     {
//        for(String name : args) 
//        {
//          System.out.print(name+" ");

//        }
//     }
// }