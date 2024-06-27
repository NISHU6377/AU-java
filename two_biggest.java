import java.util.Scanner;
public class two_biggest {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
            System.out.println("Enter two number: ");
            int a = user.nextInt();
            int b = user.nextInt();

            System.out.println((a>b) ? a : b);
            user.close();
        }
    
    
}
