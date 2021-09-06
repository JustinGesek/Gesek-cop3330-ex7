package ex7;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 justin gesek
 */
import java.util.Scanner;
//What is the length of the room in feet? 15
//What is the width of the room in feet? 20
//You entered dimensions of 15 feet by 20 feet.
//The area is
//300 square feet
//27.871 square meters
public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the length of the room in feet? ");
        int length = scanner.nextInt();

        System.out.print("What is the width of the room in feet? ");
        int width = scanner.nextInt();

        int area = length * width;
        System.out.println("You entered dimensions of "+ length+" feet by "+ width +" feet.");
        System.out.println("The area is \n"+area+" square feet");
        System.out.printf("%.3f square meters\n",0.09290304 * area);
    }
}

