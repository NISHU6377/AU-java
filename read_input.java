import java.util.Scanner;

public class read_input {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
            System.out.print("Enter your Name : ");
            String na = user.nextLine();

            System.out.print("Enter your mobile number : ");
            long num = user.nextLong();

            System.out.print("Enter your 10th number : ");
            float ten = user.nextFloat();

            System.out.print("Enter your 12th number : ");
            float twl = user.nextFloat();

            System.out.print("Enter your degree number : ");
            float gra = user.nextFloat();



            System.out.println("name : "+na);
            System.out.println("number: "+num);
            System.out.println("10th per: "+ten);
            System.out.println("12th per: "+twl);
            System.out.println("grav: "+gra);
            user.close();
        }


    
}