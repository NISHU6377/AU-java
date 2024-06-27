public class total_digit {
    public static void main(String[] args) {
        int n = 056;
        System.out.println("count of the number is : " + find_digit(n));
    }

    public static int find_digit(int number) {
        int sum = 0;
        do {
            sum++;
            number = number / 10;

        } while (number != 0);
        return sum;
    }

}
