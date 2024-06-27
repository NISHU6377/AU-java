public class tut2 {

        // Method to check if a number is perfect
        public static boolean isPerfect(int number) {
            int sum = 0;
    
            // Calculate the sum of proper divisors
            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }
    
            // Check if sum of divisors is equal to the number
            return sum == number;
        }
    
        // Method to count the number of perfect numbers up to n
        public static int countPerfectNumbersUpTo(int n) {
            int count = 0;
            for (int i = 1; i <= n; i++) {
                if (isPerfect(i)) {
                    count++;
                }
            }
            return count;
        }
    
        public static void main(String[] args) {
            // Define the upper limit
            int n = 100;  // You can change this limit as needed
    
            // Get the count of perfect numbers within the range
            int perfectCount = countPerfectNumbersUpTo(n);
    
            // Print the result
            System.out.println("The number of perfect numbers up to " + n + " is: " + perfectCount);
        }
    
    
}
