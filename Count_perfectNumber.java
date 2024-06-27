import java.util.Scanner;

public class Count_perfectNumber {

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = user.nextInt();
        user.close();
        System.out.println(c(number));

    }

    public static boolean countperfect(int n) {
        if (n < 1) {
            return false;
        }
        int sum = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;

            }

        }
        return sum == n;

    }
    public static int c(int v){
        int count = 0;
        for (int j = 1; j <= v; j++) {
            if(countperfect(j)){
                count++;
            }
        }
        return count;

    }
    

}
