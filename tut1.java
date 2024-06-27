import java.util.Scanner;
public class tut1 {
    public static void main(String[] args) {
        Scanner aman = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int n = aman.nextInt();

        if(n%3==0 && n%5==0){
            System.out.println("nishu");
        }
        else if(n%5==0){
            System.out.println("babita");
        }
        else if(n%3==0){
            System.out.println("khushi");
        }
        else{
            System.out.println("Gaviesh puri goswami");
        }
        aman.close();
    }
    
}
