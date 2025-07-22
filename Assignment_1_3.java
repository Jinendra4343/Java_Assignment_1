import java.util.*;
import java.util.Scanner;
public class Assignment_1_3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Assignment_1_3 a1 = new Assignment_1_3();
        System.out.print("Enter a number for multiplication table :- ");
        int num = sc.nextInt();
        a1.table(num);

        System.out.print("Enter a nummber For fibonacci series :- ");
        int num1 = sc.nextInt();
        a1.fibonacci(num1);

        System.out.println();
        System.out.print("Enter a number for armstrong number :- ");
        int num2 = sc.nextInt();
        if(a1.armstrong(num2))
        {
            System.out.println(num2+" is an armstrong number.");
        }
        else
        {
            System.out.println(num2+" is not an armstrong number.");
        }
    }
    public void table(int num)
    {
        int i;
        for(i=1;i<=10;i++)
        {
            System.out.println(num+" * "+i+" = "+(num*i));
        }
    }
    public void fibonacci(int num1)
    {
        int a = 0, b = 1;
        System.out.print("Fibonacci series: "+ a +", "+b);
        int i = 2;
        while(i<num1) 
        {
            int next = a+b;
            System.out.print(", " + next);
            a = b;
            b = next;
            i++;
        }
    }
    public boolean armstrong(int num2)
    {
        int original = num2;
        int sum = 0;
        int count = String.valueOf(num2).length();
        int num = num2;
        while(num>0) 
        {
            int digit = num % 10;
            sum += Math.pow(digit,count); 
            num /= 10; 
        }
        return (sum == original);
    }
}