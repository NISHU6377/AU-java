import java.util.Scanner;

public class Check_prime {

    public static int checkprimenumber(int n){
        int count =0;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                count++;
                break;
            }
        }
        if(count==1){
            System.out.println(n+ "  :- is not prime number");
        
        }
        else{
            System.out.println(n+ "  :- is  prime number");
        
        }
        return 0;
        
    }

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.print("Enter number to check prime or not :: ");
        int number= user.nextInt();
        user.close();
        checkprimenumber(number);
        
    }
    
}
