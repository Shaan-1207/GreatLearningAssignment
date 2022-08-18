package PreWork_Assignment;

import java.util.*;


/*
 * Question:
 * Write a program that performs multiple operations:
 * Check for palindrome number
 * Prints the pattern of stars in decreasing order based on the input
 * Check whether the input number is a prime number
 * Print Fibonacci series of size n with first two numbers as 0, 1 
 */

public class PreWork_Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        palindromeNumber paliNum = new palindromeNumber();
        pattern printStar = new pattern();
        primeNum isPrime = new primeNum();
        fibonacci fib = new fibonacci();

        System.out.println(
                "                                \n"+
                "--------------------------------\n"+
                "Choose options from below list.\n" +
                        "1. Find palindrome of number.\n" +
                        "2. Print Pattern for a given no.\n" +
                        "3. Check whether the no is a  prime number.\n" +
                        "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit <--\n"+
                        "--------------------------------\n"+
                        "                                ");
        do {


            System.out.print("Choose your option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                System.out.print("Find palindrome of number ");
                
                    int num = sc.nextInt();
                    paliNum.checkPalindromeNumber(num);
                    break;
                case 2:
                    System.out.print("Print Pattern for a given no ");
                    num = sc.nextInt();
                    printStar.printStarPattern(num);
                    break;
                case 3:
                    System.out.print("Check whether the no is a  prime number ");
                    num = sc.nextInt();
                    isPrime.isPrime(num);
                    ;
                    break;
                case 4:
                    System.out.println("Check whether the no is a  prime number ");
                    num = sc.nextInt();
                    System.out.print("Print Fibonacci series ");
                    fib.fib(num);
                    ;
                    break;

                default:

            }

        } while (choice != 0);

        System.out.println("Exited Successfully!!!");

        sc.close();
    }
}
