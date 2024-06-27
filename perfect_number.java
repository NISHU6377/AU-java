import java.util.Scanner;

public class perfect_number {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter number to check it perfect or not : ");
        int n = user.nextInt();
        user.close();
        if(check_perfect(n)){

            System.out.println(n + " is a perfect number ");
        }
        else{
            System.out.println(n + " is not a  perfect number ");
        }

    }

    public static boolean check_perfect(int a) {
        if(a<1){
            return false;
        }
        int sum = 0;

        for (int i=1; i <= a / 2; i++) {
            if (a % i == 0) {
                sum += i;
            }
        }
        return sum == a;
        
    }

}