import java.util.Scanner;
public class Value_positive {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
            System.out.println("Enter any number : ");
            int number = user.nextInt();

            System.out.println((number<0)? "negative": "positive");
            
            System.out.println("the positive format of : " +Math.abs(number));
            user.close();
        }
    
}
