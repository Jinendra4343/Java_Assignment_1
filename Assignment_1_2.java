import java.util.*;
import java.util.Scanner;
public class Assignment_1_2 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        checkEvenOdd(num);
        checkPrime(num);
        printWeekday(num);
    }
    static void checkEvenOdd(int n) 
    {
        if(n%2==0)
        {
            System.out.println("Even number");
        }
        else
        {
            System.out.println("Odd number");
        }
    }
    static void checkPrime(int n) 
    {
        if (n < 2)
        {
            System.out.println("Not Prime number");
            return;
        }
        boolean prime = true;
        for(int i=2;i<=Math.sqrt(n);i++) 
        {
            if (n % i == 0) 
            {
                prime = false;
                break;
            }
        }
        if(prime)
        {
            System.out.println("Prime number.");
        }
        else
        {
            System.out.println("Not Prime number.");
        }
    }
    static void printWeekday(int n) 
    {
        String day;
        switch(n) 
        {
            case 1: day = "Monday"; break;
            case 2: day = "Tuesday"; break;
            case 3: day = "Wednesday"; break;
            case 4: day = "Thursday"; break;
            case 5: day = "Friday"; break;
            case 6: day = "Saturday"; break;
            case 7: day = "Sunday"; break;
            default: day = "Invalid weekday"; break;
        }
        System.out.println("Weekday : " + day);
    }
}