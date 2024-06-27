import java.util.Scanner;
public class leep_year {
    public static void main(String[] args) {
        Scanner year = new Scanner(System.in);
        System.out.println("Enter the any year for check leep or not : ");
        int y = year.nextInt();

        if(y%4 == 0 && y%100!=0 || y% 400 == 0){
            System.out.println("This is a leep year :"+y);
        }
        else{
            System.out.println("This is not a leep year :"+y);
        }
        year.close();
    }
}
