package org.example;


import java.util.ArrayList;
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
                    case 5:
                        exercise5();
                        break;
                    case 6:
                        exercise6();
                        break;
                    case 7:
                        exercise7();
                        break;
                    case 8:
                        exercise8();
                        break;
                    case 9:
                        exercise9();
                        break;
                    case 10:
                        exercise10();
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
    public static void exercise10(){
        System.out.println("Creating a multiplication table of size 10:");
        int[][] arr = new int[10][10];
        for(int i = 1; i < arr.length + 1; i++){
            for (int j = 1; j < arr[0].length + 1; j++){
                arr[i - 1][j - 1] = i * j;
            }
        }
        System.out.println("Matrix arr: ");
        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                System.out.format("%2d ", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void exercise9(){
        System.out.println("In order to expand a array I would simple use a ArrayList but that is too easy so Ill use a temporal array with 1 extra slot and copy.");
        System.out.println("Initial array int arr with size 4: ");
        int[] arr = {1, 1, 5, 25};
        for (int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
        System.out.println("tempArr int 1 size larger thar arr: ");
        int[] tempArr = new int[arr.length + 1];
        for (int ele : tempArr){
            System.out.print(ele + " ");
        }
        System.out.println();
        System.out.println("I copy values from arr to tempArr: ");
        for(int i = 0; i < arr.length; i++){
            tempArr[i] = arr[i];
        }
        System.out.println("Then ill copy arr as tempArr: ");
        arr = tempArr;
        for (int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void exercise8(){
        System.out.println("Creating int array arr:");
        int[] arr = {20, 20, 40, 20, 30, 40, 50, 60, 50};
        for (int element: arr){
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println("Declaring list array arrList of type Integer which will get all values excluding duplicates from arr");
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++){
            if(!arrList.contains(arr[i])){
                arrList.add(arr[i]);
            }
        }
        System.out.println("arrList: ");
        for (int element : arrList){
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void exercise7(){
        System.out.println("Creating int array arr that can hold 10 elements:");
        int[] arr = new int[10];
        System.out.println("Giving arr following values:");
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;
        arr[3] = 7;
        arr[4] = 9;
        arr[5] = 12;
        for (int element : arr){
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println("Odd elements in array arr: ");
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 != 0){
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    public static void exercise6(){
        int[] arr = {43, 5, 23,17, 2, 14};
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        double average = (double)sum / arr.length;
        System.out.println("Creating array arr such as:");
        for(int element : arr){
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.format("The average of these numbers, rounded to one decimal: %.1f", average);
        System.out.println();
    }

    public static void exercise5(){
        System.out.println("Creating a two dimensional string array [2][2]:");
        String[][] arr = new String[2][2];
        System.out.println("Assigning random string country and city values:");
        arr[0][0] = "Sweden";
        arr[0][1] = "Katrineholm";
        arr[1][0] = "France";
        arr[1][1] = "Paris";
        System.out.println("Printing out arr row by row:");
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
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