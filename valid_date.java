import java.util.Scanner;

public class valid_date {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the date, month and year formate is dd/mm/year :");
        int d = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();

        if ((y > 0) && (d > 0 && d < 32) && (m > 0 && m < 13)) {
            if (m == 2) {
                if (d == 29) {
                    System.out.println(
                            (y % 4 == 0 && (y % 100 != 0 || y % 400 == 0)) ? "valid date" : "not a valid date");
                } else if (d < 29) {
                    System.out.println("valid hai");
                } else {
                    System.out.println("not a valid date");
                }
            } else if (m == 4 || m == 6 || m == 9 || m == 11) {
                if (d < 31) {
                    System.out.println("valid hai");
                } else {
                    System.out.println("not a valid date");
                }
            }
            else{
                System.out.println("valid hai");;
            }
        } else {
            System.out.println("not a valid date");
        }
        sc.close();
    }
}
