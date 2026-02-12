package Languages.Java;

public class Methods {
    public static void helloWorld(){
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        return;
    }

    public static int sumOfTwoNum(int A, int B){ //parameters or formal parameters
        return A+B;
    }

    public static void swap(int a, int b){
        // Swap
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    // Factorial of a number n
    public static int factorialNum(int n){
        int fact = 1;
        while (n > 0) {
            fact *= n--;
        }

        // System.out.println("Factorial is : " + fact);
        return fact;
    }

    // Binomial Coefficient
    public static void binoCoeff(int n, int r){
        int fn = factorialNum(n);
        int r_fact = factorialNum(r);
        int fnmr = factorialNum(n-r);

        int binCoff = fn / (r_fact * fnmr);

        System.out.println("Binomial coeff : " + binCoff);
    }

    // Prime Number
    public static boolean isPrime(int n){
        boolean isPrime = true;
        for(int i=2; i<=n-1; i++){
            if(n % i == 0){
                isPrime = false;
            }
        }

        return isPrime;
    }

    // Prine All Primes in a Range 
    public static void printPrimes(int rangeNum){
        for(int i=2; i<=rangeNum-1; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }

    // Binary To Decimal
    public static void binToDec(int binNum){
        int pow = 0;
        int decNUm = 0;
        int binaryNum = binNum;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNUm = decNUm + (int) (lastDigit * Math.pow(2, pow++));
            binNum = binNum / 10;
        }

        System.out.println("Decimal of " + binaryNum + " = " + decNUm);
    }

    // Decimal to Binary
    public static void decToBin(int decNUm){
        int myNum = decNUm;
        int pow = 0;
        int binNum = 0;
        while (decNUm > 0) {
            int rem = decNUm % 2;
            binNum = binNum  + (rem * (int) Math.pow(10, pow++));
            decNUm = decNUm / 2;
        }

        System.out.println("Binary form of " + myNum + " = " + binNum);
    }

    // check if a number is a palindrome 
    public static void isPalindrome(int num){
        int myNum = num;
        int rev = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            rev = lastDigit + (rev * 10);
            num /= 10;
        }

        if(rev == myNum){
            System.out.println("isPalindrome");
        }else{
            System.out.println("not Palindrome");
        }
    }

    // Write a Java method to compute the sum of the digits in an integer
    public static void sumOfDigits(int digit){
        int sumOfDigit = 0;
        while (digit > 0) {
            int lastDigit = digit % 10;
            sumOfDigit += lastDigit;
            digit /= 10;
        }

        System.out.println("Sum of Digit : " + sumOfDigit);
    }

    
    public static void main(String[] args) {
        /* helloWorld();
        int sum = sumOfTwoNum(80, 55);//arguments or actual parameters
        System.out.println("Sum is : " + sum); */

        // Swap - Values Exchange
        /* int a = 5;
        int b = 10;
        // Swap
        int temp = a;
        a = b; 
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b); */

        // factorialNum(5);
        // binoCoeff(5, 2);
        // System.out.println(isPrime(49));
        // printPrimes(100);

        // binToDec(101);
        // decToBin(7);
        // isPalindrome(99);
        sumOfDigits(12345);
    }
}
