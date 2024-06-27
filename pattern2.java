import java.util.Scanner;
public class pattern2 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter the name : ");
        String n = user.nextLine();
        user.close();
        int num = n.length();
        for(int i= 1;i<=num;i++){
            for(int j =0;j<i;j++){
                System.out.print(" "+n.charAt(j));

            }
            System.out.println();
        }
    }
    
}
