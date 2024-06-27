public class sumofDigit {
    public static void main(String[] args) {
        int n = 228;
        int res = ans(n);
        System.out.println("sum of digits: " +res);
    }
    static int ans(int a) {
        int sum=0;
        while (a!=0) {
            sum=sum+a%10;
            a=a/10;     
        }
        return sum;
    }

}
