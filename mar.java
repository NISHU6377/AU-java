import java.util.Scanner;
public class mar {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Ente any integer : ");
        int n = user.nextInt();  //1234

        int r=n%10;             //4
        n=n/10;                //123
        int r1=n%10;          //3
        n=n/10;              //12
        int r2=n%10;        // 2
        int res = n/10;    //1
         System.out.println(r+r1+r2+res); // 4+3+2+1
         user.close();
        
    }
    
}
