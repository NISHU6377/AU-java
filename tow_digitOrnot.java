import java.util.Scanner;

public class tow_digitOrnot {
    public static void main(String[] args) {
        Scanner nishu = new Scanner(System.in);
        System.out.println("Enter any number to check : ");
        int n = nishu.nextInt();

        if (n >= 10 && n <= 99) {
            System.out.println("Given number is two digit number : " + n);

        } else {
            System.out.println("Given number is not a two digit number : " + n);
        }
        nishu.close();
    }

}
