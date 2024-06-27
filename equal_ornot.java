import java.util.Scanner;

public class equal_ornot {

        public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
            System.out.println("Enter any two number : ");
            int n1 = user.nextInt();
            int n2 = user.nextInt();

            if(n1 == n2){
                System.out.println("number are equal");

            }
            else{
                System.out.println("number is not equal ");
            }
            user.close();
        }

    
    
}
