import java.util.Scanner;

public class three_biggest {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
            System.out.println("Enter any  three number  you want : ");
            int a = user.nextInt();
            int b = user.nextInt();
            int c = user.nextInt();

            if(a>b&&a>c){
                System.out.println("the biggest number is : "+a);
            }
            else if(b>a&&b>c){
                System.out.println("the biggest number is : "+b);
            }
            else{
                System.out.println("the biggest number is : "+c);
            }
            user.close();
        }
    
    
}
