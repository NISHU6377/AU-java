public class reverseOfNumber {
    public static void main(String[] args) {
        int num = 2356;
        int res = reverse(num);
        System.out.println(res);
    }
    static int reverse(int number) {
        int sum = 0,ans=0;
        while (number>0) {
            int digit = number % 10;
            ans = ans * 10 + digit;
            number /= 10;
        }
        return ans;
    }
}
