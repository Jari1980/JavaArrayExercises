package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        int num;
        while (true) {
            System.out.println("Which exercise do you want to see, 1-13 :");
            try {
                num = scan.nextInt();
                switch (num) {
                    case 1:
                        exercise1();
                        break;
                    case 2:
                        exercise2();
                        break;
                    default:
                        System.out.println("Closing program");
                        System.exit(0);
                }
            }
            catch (Exception e){
                System.out.println("There is no such exercise");
                System.exit(0);
            }
        }
    }
    public static void exercise2(){
        System.out.println("Creating method indexOf which will return first index of a element in int array, gives negative if it doesnt exist");
        int[] arr1 = {5,5,6,7};
        System.out.println("Testing with array {5,5,6,7}");
        System.out.println("Looking for first index to number 7: " + indexOf(arr1, 7));
        System.out.println("Looking for first index to number 5: " + indexOf(arr1, 5));
        System.out.println("Looking for first index to number 11: " + indexOf(arr1, 11));
    }
    public static int indexOf(int[] arr, int num){
        int index = -1;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == num){
                index = i;
                break;
            }
            else{
                index = -1;
            }
        }
        return index;
    }

    public static void exercise1(){
        int[] arr = {12,34,56,78,90};
        System.out.println("Printing elements in Int array with for loop:");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Printing elements with foreach loop: ");
        for (int element : arr){
            System.out.print(element + " ");
        }
        System.out.println();
    }
}