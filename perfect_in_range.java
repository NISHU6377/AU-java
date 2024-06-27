import java.util.Scanner;

public class perfect_in_range {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.print("Enter any range to print perfect number : ");
        int number = user.nextInt();
        user.close();

        for(int j = 1;j<=number;j++){
            if(rangePerfect(j)){
                System.out.println(" perfect number is : "+j);
            }
        }
    }

    public static boolean rangePerfect(int n) {
        if (n < 1) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum==n;

    }

}
