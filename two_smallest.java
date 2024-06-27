import java.util.Scanner;

public class two_smallest{
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
            System.out.println("Enter two number: ");
            int a = user.nextInt();
            int b = user.nextInt();

            System.out.println((a>b) ? b: a);
            user.close();
        }
    
    
}
