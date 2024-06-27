public class Prime_in_numbercount {

        public static void main(String[] args) {
            int start = 1; 
            int end = 100; 
    
            int primeCount = countPrimesInRange(start, end);
            System.out.println("Number of prime numbers between " + start + " and " + end + ": " + primeCount);
        }
    
    
        public static boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    
        
        public static int countPrimesInRange(int start, int end) {
            int count = 0;
            for (int i = start; i <= end; i++) {
                if (isPrime(i)) {
                    count++;
                }
            }
            return count;
        }
    
    
}
