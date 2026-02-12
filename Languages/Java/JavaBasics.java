package Languages.Java;

import java.util.Scanner;

public class JavaBasics {
    public static void main(String[] args) {
        /*
         * System.out.print("Hello, World!\n");// line of space
         * System.out.println("Hello, World!"); // line of space
         * System.out.println("Hello, World!"); // line of space
         */

        /*
         * System.out.println("* * * *");
         * System.out.println("* * *");
         * System.out.println("* *");
         * System.out.println("*");
         */

        // Variables
        /*
         * int a = 10;
         * int b = 5;
         * System.out.println(a);
         * System.out.println(b);
         * String name = "Jaykant Yadav";
         * System.out.println(name);
         * 
         * a = 50;
         * System.out.println(a);
         */

        // Data Types
        /*
         * -> Primitive
         * -> Non-Primitive
         */
        /*
         * byte b = 80;
         * System.out.println(b);
         * char ch = 'a';
         * System.out.println(ch);
         * boolean var = true;
         * System.out.println(var);
         * float price = 10.5f;
         * int number = 25;
         */
        // long
        // double
        // short

        // Sum of A and B
        /*
         * int a = 10;
         * int b = 65;
         * int sum = a + b;
         * System.out.println(sum);
         */

        // Input in Java
        Scanner scn = new Scanner(System.in);
        /*
         * String input = scn.next();
         * System.out.println(input);
         * 
         * String name = scn.nextLine();
         * System.out.println(name);
         */

        /*
         * int number = scn.nextInt();
         * System.out.println(number);
         * 
         * float price = scn.nextFloat();
         * System.out.println(price);
         */

        // Sum of a & b in take input
        /*
         * int a = scn.nextInt();
         * int b = scn.nextInt();
         * int sum = a + b;
         * System.out.println(sum);
         */

        // Product of a & b
        /*
         * int a = scn.nextInt();
         * int b = scn.nextInt();
         * int pro = a * b;
         * System.out.println(pro);
         */

        // Area of a Circle
        /*
         * float radius = scn.nextFloat();
         * double area = 3.14 * radius * radius;
         * System.out.println(area);
         */

        // Type Conversion
        /*
         * Conversion happens when:
         * a.type compatible
         * b.destination type > source type
         * byte->short->int->float->long->double
         */
        /*
         * long a = 25;
         * int b = a;
         * System.out.println(b);
         */

        // Type Casting
        /*
         * float a = 25.12f;
         * int b = (int) a;
         * System.out.println(b);
         */

        /*
         * char ch = 'a';
         * char ch2 = 'b'; // 'c', 'd', 'e'
         * int number = ch;
         * int number2 = ch2;
         * System.out.println(number);
         * System.out.println(number2);
         */

        // Type Promotions
        /*
         * char a = 'a';
         * char b = 'b';
         * System.out.println((int)a); //97
         * System.out.println((int)b); //98
         * System.out.println(a);
         * System.out.println(b-a); //1
         */

        /*
         * short a = 5;
         * byte b = 25;
         * char c = 'c';
         * int bt = a + b + c;
         * byte bt2 = (byte) (a + b + c);
         * System.out.println(bt); //129
         * System.out.println(bt2); //-127
         */

        /*
         * int a = 10;
         * float b = 20.25f;
         * long c = 25;
         * double d = 30;
         * double ans = a + b + c + d;
         * System.out.println(ans);
         */

        // Operators
        // Arithmetic Op
        /*
         * int A = 10;
         * int B = 5;
         * System.out.println(A+B);
         * System.out.println(A-B);
         * System.out.println(A*B);
         * System.out.println(A/B);
         * System.out.println(A%B);
         */

        // Unary Op
        /*
         * int a = 10;
         * int b = ++a;
         * System.out.println(a);
         * System.out.println(b);
         */

        /*
         * int a = 10;
         * int b = a++;
         * System.out.println(a);
         * System.out.println(b);
         */

        /*
         * int a = 10;
         * int b = a--;
         * System.out.println(a);
         * System.out.println(b);
         */

        /*
         * int a = 10;
         * int b = --a;
         * System.out.println(a);
         * System.out.println(b);
         */

        // Relational Op
        /*
         * int a = 10;
         * int b = 5;
         * System.out.println((a == b));
         * System.out.println((a != b));
         * System.out.println((a > b));
         * System.out.println((a < b));
         * System.out.println((a <= b));
         * System.out.println((a >= b));
         */

        // Logical Op
        /*
         * System.out.println((3<2) && (5<0));
         * System.out.println((3<2) || (5>0));
         * System.out.println(!(3>2));
         */

        // Assignment
        /*
         * int A = 10;
         * // A = A + 10;
         * A += 10;
         * int B = 5;
         * B -= 5;
         * System.out.println(B);
         */

        /*
         * int x = 2, y = 5;
         * int exp1 = (x * y / x);
         * int exp2 = (x * (y / x));
         * 
         * System.out.print(exp1 + ",");
         * System.out.print(exp2);
         */

        // Conditional Statement
        // if - else
        /*
         * int Age = 19;
         * if (Age >= 18) {
         * System.out.println("Vote, drive");
         * } else {
         * System.out.println("Not adult");
         * }
         */

        // Print the Largest Of 2
        /*
         * int A = 1, B = 3;
         * if(A >= B){
         * System.out.println("A is largest of 2");
         * }else{
         * System.out.println("B is largest of 2");
         * }
         */

        // Print if a number is odd or Even
        /*
         * System.out.print("Enter your Number : ");
         * int num = scn.nextInt();
         * if(num % 2 == 0){
         * System.out.println("Even");
         * }else{
         * System.out.println("Odd");
         * }
         */

        // else - if Statement
        /*
         * int age = 13;
         * if (age >= 18) {
         * System.out.println("adult");
         * } else if (age >= 13 && age < 18) {
         * System.out.println("teenager");
         * } else {
         * System.out.println("child");
         * }
         */

        // Income Tax Calculator
        /*
         * int income = scn.nextInt();
         * int tax;
         * if(income < 500000){
         * tax = 0;
         * }else if(income >= 500000 && income < 1000000){
         * tax = (int) (income * (0.2));
         * }else{
         * tax = (int) (income * (0.3));
         * }
         * 
         * System.out.println("your tax is : " + tax);
         */

        // Print the largest of 3
        /*
         * int A = 1, B = 3, C = 6;
         * System.out.print("Largest is ");
         * if(A >= B && A >= C){
         * System.out.println("A");
         * }else if(B >= C){
         * System.out.println("B");
         * }else{
         * System.out.println("C");
         * }
         */

        // Ternary Op
        // Variable = condition ? stt1 : stt2;
        /*
         * int larger = (5 > 3) ? 5 : 3;
         * System.out.println(larger);
         */

        /*
         * int number = 10;
         * String type = ((number%2) == 0) ? "Even" : "Odd";
         * System.out.println(type);
         */

        /*
         * int marks = 32;
         * String result = marks >= 33 ? "Pass" : "Fail";
         * System.out.println(result);
         */

        // Switch Statement
        /*
         * int num = 2;
         * switch (num) {
         * case 1:
         * System.out.println("samosa");
         * break;
         * case 2:
         * System.out.println("burger");
         * break;
         * case 3:
         * System.out.println("mango shake");
         * break;
         * default:
         * System.out.println("We wake up early");
         * }
         */

        // Calculator
        /*
         * int a = scn.nextInt();
         * char op = scn.next().charAt(0);
         * int b = scn.nextInt();
         * 
         * System.out.print(" = ");
         * switch (op) {
         * case '+':
         * System.out.print(a + b);
         * break;
         * case '-':
         * System.out.print(a - b);
         * break;
         * case '*':
         * System.out.print(a * b);
         * break;
         * case '/':
         * System.out.print(a / b);
         * break;
         * case '%':
         * System.out.print(a % b);
         * break;
         * 
         * default:
         * System.out.print("Wrong operator");
         * }
         */

        // Loops
        // While loop
        /*
         * int counter = 0;
         * while (100 > counter) {
         * System.out.print("Hello Loops" + " ");
         * counter++;
         * }
         */

        // Print number from 1 to 10
        /*
         * int num = 1;
         * while (num <= 10) {
         * System.out.print(num + " ");
         * num++;
         * }
         */

        // Print number from 1 to n
        /*
         * int n = scn.nextInt();
         * int count = 1;
         * while (count <= n) {
         * System.out.print(count++ + " ");
         * }
         * System.out.println();
         */

        // Print sum of first n natural numbers
        /*
         * int sum = 0;
         * int count = 1;
         * int n = scn.nextInt();
         * while (count <= n) {
         * sum += count;
         * count++;
         * }
         * 
         * System.out.println("first n natural number of sum : " + sum);
         */

        // For Loop
        /*
         * for(int i=0; i<=23; i++){
         * System.out.println("Hello Doll");
         * }
         */

        // Print SQUARE pattern
        /*
         * * * *
         * * * *
         * * * *
         * * * *
         */
        /*
         * for(int i=1; i<=4; i++){
         * System.out.println("* * * *");
         * }
         */

        // Print Reverse of a number
        /*
         * int num = scn.nextInt();
         * while (num > 0) {
         * int lastDigit = num % 10;
         * System.out.print(lastDigit);
         * num = num / 10;
         * }
         */

        // Reverse the given number
        /*
         * int num = scn.nextInt();
         * int rev = 0;
         * while (num > 0) {
         * int lastDigit = num % 10;
         * rev = (rev * 10) + lastDigit;
         * num = num / 10;
         * }
         * 
         * System.out.println(rev);
         */

        // Do - While loop
        /*
         * int count = 1;
         * do{
         * System.out.println("Hello");
         * count++;
         * }while(count <= 10);
         */

        /*
         * for(int i=1; i<=5; i++){
         * if(i == 3){
         * break;
         * }
         * System.out.println(i);
         * }
         */

        // Break keyword
        /* do {
            System.out.print("Enter your number : ");
            int user = scn.nextInt();
            if (user % 10 == 0) {
                break;
            }
            System.out.println(user);
        } while (true); */

        // Continue keyword
        /* for(int i=1; i<=5; i++){
            if(i == 3){
                continue;
            }
            System.out.println(i);
        } */

        /* do{
            System.out.print("Enter your number : ");
            int user = scn.nextInt();
            if(user % 10 == 0){
                continue;
            }
            System.out.println(user);
        }while(true); */

        // Check if a number is prime or not
        int n = scn.nextInt();
        boolean isPrime = true;
        /* for(int i=2; i<=n-1; i++){
            if(n%i == 0){
                isPrime = false;
            }
        } */

        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                isPrime = false;
            }
        }

        System.out.println(isPrime ? "Prime Number" : "Not Prime");
    }
}