import java.util.Scanner;
public class valid_months{
    public static void main(String[] args) {
        Scanner nishu = new Scanner(System.in);
        System.out.println("Enter the months number : ");
        int month= nishu.nextInt();

        if(month>=1 && month<=12){
            System.out.println("months is valid");
        }
        else{
            System.out.println("months is not valid");
        }
        nishu.close();
    }

}