package org.example;


import java.util.Arrays;
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
                    case 3:
                        exercise3();
                        break;
                    case 4:
                        exercise4();
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
    public static void exercise4(){
        System.out.println("Creating array arr1 with elements: ");
        int[] arr1 = {1, 15, 20};
        for (int element : arr1){
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println("Creating new array arr2 with equal amount of elements as arr1");
        int[] arr2 = new int[arr1.length];
        System.out.println("Copying elements with from arr1 to arr2, could have done this with Arrays.copyOf aswell");
        for(int i = 0; i < arr1.length; i++){
            arr2[i] = arr1[i];
        }
        System.out.println("arr2 after copy:");
        for (int element : arr2){
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void exercise3(){
        System.out.println("Creating string array with random cities:");
        String[] arr = {"Katrineholm", "London", "peking","New York", "dallas","Paris"};
        for(String element : arr){
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println("Sorting the array none case sensitive and alphabetical");
        Arrays.sort(arr, String.CASE_INSENSITIVE_ORDER);
        for(String element : arr){
            System.out.print(element + " ");
        }
        System.out.println();
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