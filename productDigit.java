public class productDigit {
    public static void main(String[] args) {
        int num = 2584;
        int res = product(num);
        System.out.println(res);
    }
    static int product(int a) {
        int multi = 1;
        while (a>0) {
            int digit = a%10;
            multi *= digit;
            a/=10;
        }
        return multi;
    }
}
