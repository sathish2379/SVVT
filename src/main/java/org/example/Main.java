package org.example;

import java.util.Scanner;

import static org.example.HeapSort.printArray;

public class Main {
    // Driver program
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = scanner.nextInt();

        System.out.println("Enter the elements of the array: ");
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        HeapSort ob = new HeapSort();
        ob.sort(arr);

        System.out.println("Sorted array is");
        printArray(arr);
    }
}