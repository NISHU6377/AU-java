import java.util.Scanner;

public class check_P_N_Zero {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
            System.out.println("Enter any number : ");
            int number = user.nextInt();

            if(number<0){
                System.out.println("number negative");

            }

            else if(number>0){
                System.out.println("number positive");

            }
            else{
                System.out.println("number is zero");
            }
            user.close();
        }

}
