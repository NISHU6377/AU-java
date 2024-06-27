import java.util.Scanner;
public class digit_or_number {
    public static void main(String[] args) {
        
        Scanner user = new Scanner(System.in);
        System.out.println("Enter any integer value you want to check : ");
        long n1 = user.nextLong();
        if(n1>=0 && n1<=9){
            System.out.println("Integer is digit : " +n1);
        }
        else if(n1>9){
            System.out.println("Integer is a number :"+n1);
        }
        else{
            System.out.println("please enter the valid integer ");
        }
        user.close();
    }
    
}
