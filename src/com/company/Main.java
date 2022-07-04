package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
     private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	int[] myIntegers = readIntegers(5);
        System.out.println("The minimum value of the array is: " + findMin(myIntegers));
    }
    public static int[] readIntegers(int count){
        System.out.println(" Enter " + count + " numbers ");
        int[] numbers = new int[count];
        for (int i = 0; i<numbers.length; i++){
            numbers[i] = scanner.nextInt();
        }
        return numbers;

    }
    public static int findMin(int[] array){
        int min = array[0];
        for (int i = 0; i< array.length; i++){
            if (array[i]< min){
               min = array[i];
            }
        }
        return min;
    }
}
