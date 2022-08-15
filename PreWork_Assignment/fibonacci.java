package PreWork_Assignment;

public class fibonacci {
    
    public void fib(int n){
        System.out.println("----------------------");
        int f1 = 0, f2 =2;

        if (n<1)
        System.out.print(f1 + "  ");

        for(int i = 1; i<n; i++){
            System.out.print(f2 + "  ");
            int nextFib = f1 +f2;
            f1 = f2;
            f2 = nextFib;
        }
        System.out.println("----------------------");
        
    }
}
