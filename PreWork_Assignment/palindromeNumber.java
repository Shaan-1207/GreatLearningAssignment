package PreWork_Assignment;

import java.util.Scanner;

public class palindromeNumber {
    Scanner sc = new Scanner(System.in);

    //create a method for checking wheather it is a Palindrome Number or Not...
    public void checkPalindromeNumber(int num){
        System.out.println("                       ");
        System.out.println("----------------------");
    
    int originalNum = num;
     int reversedNum = 0;
     int  remainder;
    
        while(num != 0){
            
            remainder = num %10;
            reversedNum = reversedNum * 10 +remainder;
            num /=10;
        }
        
         
        if(originalNum==reversedNum){
           System.out.println(originalNum + " is Palindrome.");
        }else{
            System.out.println(originalNum+" is not Palindrome");
        }
        System.out.println("----------------------");
        System.out.println("                       ");
    }
}
