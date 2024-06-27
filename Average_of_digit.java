import java.util.Scanner;
public class Average_of_digit {  
    public static double a(int avgr){
        int temp = avgr;
        int sum = 0;
        int count = 0;

        while (temp != 0) {
            int digit = temp % 10;
            sum += digit;
            count++;
            temp /= 10;
        }
        double average =  (float)sum / count;
        return average;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println(a(number));
        sc.close();
    }
}
