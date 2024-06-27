import java.util.Scanner;
public class table {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter the number you want to find multiplication table : ");
        int n = user.nextInt();
        user.close();
        ftable(n);

    }
    public static int ftable(int a){
        for(int i=1;i<=10;i++){
            System.out.println(a +" * "+i+" = "+a*i);
        }
        return 0;
    }
    
}
