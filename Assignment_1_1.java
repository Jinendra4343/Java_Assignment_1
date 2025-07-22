import java.util.*;
import java.time.LocalDate;
public class Assignment_1_1 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); 
        System.out.print("Enter your college name: ");
        String collegeName = scanner.nextLine(); 
        LocalDate currentDate = LocalDate.now();
        System.out.println("\nName: " + name);
        System.out.println("College: " + collegeName);
        System.out.println("Current Date: " + currentDate);
    }
}