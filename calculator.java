import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
            System.out.println("Enter any two  number : ");
            int a = user.nextInt();
            int b = user.nextInt();
	    user.close();

            System.out.println("Choose  opration from +,-,*,/ : ");
            char res = user.next().charAt(0);

            switch(res){
                case '+' :
                System.out.println(a+b);
                break;

                case '-' :
                System.out.println(a-b);
                break;

                case '*' :
                System.out.println(a*b);
                break;

                case '/' :
                System.out.println(a/b);
                break;
            }
            System.out.println("nishu");
            
        }


    

}
