public class firstdigit_lastdigit {
    public static void main(String[] args) {
        int n = 23456789;
        finddigit(n);

    }

    public static void finddigit(int num) {
        int fname = 0;
        int lname = 0;
        lname = num % 10;
        while (num != 0) {
            fname = num % 10;
            num /= 10;
        }
        System.out.println("The first digit of the number  is :" + fname);
        System.out.println("The last digit of the number  is :" + lname);
    }
}
