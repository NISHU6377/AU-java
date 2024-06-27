import java.util.Scanner;   
public class special_two_digit {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
            System.out.println("Enter any two digit number for show number is  special two digit or not :");
            int n = user.nextInt();
            int r=n%10;
            int res=n/10;
            int result=(r*res)+(r+res);

            System.out.println((result==n) ? "yes": "no");
            user.close();
        }

    
    
}
