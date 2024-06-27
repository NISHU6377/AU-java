import java.util.Scanner;
public class sum_first10_number {

        public static void main(String[] args) {
            Scanner user = new Scanner(System.in);
            System.out.println("Enter 1 to 10 number : ");
            int n= user.nextInt();
            user.close();
            sum(n);
             
        }
        public static int sum(int n) {
            int sum=0;
            for(int i=1;i<=n;i++){ 
                sum+= i;
        
            }
            System.out.println("fist  10 number fo sum is : "+sum);
            return 0;
        }
    }
    
