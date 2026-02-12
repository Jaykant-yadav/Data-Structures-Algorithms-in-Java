package Languages.Java;

import java.util.Scanner;

public class Practiceqs {
    // In a program,input 3 numbers : A,B and C. You have to output the average of
    // these 3 numbers
    public static double avgThreeNum(int a, int b, int c) {
        double avg = (a + b + c) / 3;
        return avg;
    }

    // calculate area of the square
    public static double areaOfSq(int side) {
        double areaOfSquare = side * side;
        return areaOfSquare;
    }

    // calculate total price with add 18% gst and take 3 items like - pen, pencil,
    // eraser
    public static double priceCal(float pencil, float pen, float eraser) {
        float OriginalPrice = pen + pencil + eraser;
        float totalPrice = OriginalPrice * 1.18f;
        return totalPrice;
    }

    // Print year is a leap year or not
    public static void leapYear(int year) {
        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));

        if (x && (y || z)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }

    // Write a program to find the factorial of any number entered by the user
    public static void facNum(int num) {
        int fac = 1;
        int number = num;
        while (num > 0) {
            fac = fac * num--;
        }

        System.out.println("Factorial of " + number + " : " + fac);
    }

    // Write a Program to print the multiplication table of a number N, enterd by the user.
    public static void multiplicationTable(int tableNum){
        for(int i=1; i<=10; i++){
            System.out.println(tableNum + " x " + i + " = " + tableNum*i);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // facNum(n);
        multiplicationTable(n);
        /*
         * double avg = avgThreeNum(6, 5, 8);
         * System.out.println("Average of three num : " + avg);
         * 
         * System.out.println("Area of square : " + areaOfSq(5));
         * 
         * System.out.println("Total Price with Add GST : " + priceCal(10, 25, 36));
         * 
         * leapYear(2003);
         */

        /* int choice;
        int evenSum = 0;
        int oddSum = 0;
        do {
            int num = scn.nextInt();
            System.out.println("Enter your number");
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }

            System.out.println("Do you want to continue? Press 1 for yes or 0 for no");
            choice = scn.nextInt();

        } while (choice == 1);

        System.out.println("Sum of even number : " + evenSum);
        System.out.println("Sum of Odd number : " + oddSum); */

    }
}
