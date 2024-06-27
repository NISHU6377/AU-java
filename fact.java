import java.util.Scanner;
public class fact {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter any number that  want to find factorial : ");
        int n = user.nextInt();
        user.close();
        int result = factorial(n);
        System.out.println("the factorial of given number is : "+ result);


    }
    public static int factorial(int n){
        if(n == 0 || n == 1)
            return 1;
        else{
            return n*factorial(n-1);
        } 
    }
    // public static int findfactorial(int n){
    //     if(n == 0 || n == 1)
    //         return 1;
    //      for ()
    // }
    
}
