package PreWork_Assignment;

public class primeNum {
    public void isPrime(int num){
        System.out.println("----------------------");

        boolean isPrime = false;
        for(int i =2 ; i<=num/2; ++i){
            //non-prime condition
            if(num%i==0){
                isPrime =true;
                break;
            }
        }
        if(!isPrime){
            System.out.println(num + " is prime number");
        }else{
    
            System.out.println(num + " is non-prime number");
        }
        System.out.println("----------------------");
    }
    
}
