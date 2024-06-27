import java.util.Scanner;

public class four_biggest {
        public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
            System.out.println("Enter any  four number  you want : ");
            int a = user.nextInt();
            int b = user.nextInt();
            int c = user.nextInt();
            int d = user.nextInt();

            if(a>b && a>c && a>d){
                System.out.println("Biggest number is : "+a);
            }
            else if(b>a && b>c && b>d){
                System.out.println("Biggest number is : "+b);
            }
            else if(c>a && c>b && c>d){
                System.out.println("Biggest number is : "+c);
            }
            else{
                System.out.println("Biggest number is : "+d);
            }
            user.close();
        }

        
}
