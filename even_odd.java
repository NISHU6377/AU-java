import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        Scanner even = new Scanner(System.in);
            System.out.print("Enter any number you want to chack number even or odd :");
            int number = even.nextInt();

            // if (number % 2 == 0)
            //     System.out.print("\n Given number is even");
            // else
            //     System.out.print("\n Given number is odd");
            
            System.out.println((number%2==0) ? "even": "odd");
            even.close();
        }    
    

}
