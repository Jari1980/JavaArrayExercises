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
    public static void exercise1(){

    }
}