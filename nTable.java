import java.util.Scanner;

public class nTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = sc.nextInt();
        sc.close();
        multiplication(num);
    }
    public static int multiplication(int num) {
        int table = 1;
        for(int i =1; i<=num; i++) {
            table = num * i;
            System.out.println(num + " * " + i + " = " + table);
        }
        return 0;
    }
}
