import java.util.Scanner;

public class middle_value {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
            System.out.println("Enter any three number : ");
            int a = user.nextInt();
            int b = user.nextInt();
            int c = user.nextInt();

            if((a > b && a < c) || (a > c && b > a))
                System.out.println("Middle value is : "+a);

            else if ((b > a && b < c) || (b > c && a > b))
                System.out.println("Middle value is : "+b);

            else
                System.out.println("Middle value is : "+c);
            user.close();    
        }
    
}
