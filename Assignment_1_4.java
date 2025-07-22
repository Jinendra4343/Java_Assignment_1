import java.util.*;
import java.util.Scanner;
public class Assignment_1_4
{
// Input 10 integers and find average, maximum, and minimum
public void avgminmax()
{
    Scanner input = new Scanner(System.in);
    int[] numbers = new int[10];
    int sum = 0;
    int max,min;
    System.out.println("Enter 10 integers:");
    for (int i=0;i<10;i++) {
        numbers[i] = input.nextInt();
        sum = sum + numbers[i];
    }
    max = numbers[0];
    min = numbers[0];
    for (int i=1;i<10;i++) 
    {
        if (numbers[i] > max) 
            max = numbers[i];
        if (numbers[i] < min) 
           min = numbers[i];
    }
    double average = sum / 10.0;
    System.out.println("Average: " + average);
    System.out.println("Maximum: " + max);
    System.out.println("Minimum: " + min);
}
// Create a 3x3 matrix and print its transpose
public void matrix()
{
    Scanner input = new Scanner(System.in);
    int[][] matrix = new int[3][3];
    System.out.println("\nEnter elements for 3x3 matrix:");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            matrix[i][j] = input.nextInt();
        }
    }
    System.out.println("Original 3x3 Matrix:");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }
    System.out.println("Transpose of Matrix:");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print(matrix[j][i] + " ");
        }
        System.out.println();
    }
}
// Bubble sort and binary search implementation
public void sorting()
{
    Scanner input = new Scanner(System.in);
    int size = 10;
    int[] arr = new int[size];
    System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
    //Bubble Sort
    for (int i = 0; i < size-1; i++) {
        for (int j = 0; j < size-1-i; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
    System.out.print("Sorted Array: ");
    for (int num : arr) {
        System.out.print(num + " ");
    }
    System.out.println();
    //Binary Search
    System.out.print("Enter number to search: ");
    int key = input.nextInt();
    int low = 0, high = size - 1;
    boolean found = false;
    while (low <= high) {
        int mid = (low + high) / 2;
        if (arr[mid] == key) {
            System.out.println("Number found at index: " + mid);
            found = true;
            break;
        } 
        else if (arr[mid] < key) {
            low = mid + 1;
        } 
        else {
           high = mid - 1;
        }
    }
    if (!found) {
        System.out.println("Number not found in the array.");
    }
}
public static void main(String[] args) 
{
    Assignment_1_4 a1 = new Assignment_1_4();
    a1.avgminmax();
    a1.matrix();
    a1.sorting();
}
}