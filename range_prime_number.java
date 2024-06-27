public class range_prime_number {

        public static void printPrimesInRange(int start, int end) {
            if (end < 2) {
                System.out.println("No prime numbers in this range.");
                return;
            }
    
            boolean[] isPrime = new boolean[end + 1];
            for (int i = 0; i <= end; i++) {
                isPrime[i] = true;
            }
            isPrime[0] = false; 
            isPrime[1] = false; 
    
            
            for (int num = 2; num * num <= end; num++) {
                if (isPrime[num]) {
                    for (int multiple = num * num; multiple <= end; multiple += num) {
                        isPrime[multiple] = false;
                    }
                }
            }
    
            boolean foundPrime = false;
            for (int num = start; num <= end; num++) {
                if (isPrime[num]) {
                    if (!foundPrime) {
                        System.out.print("Prime numbers in the range " + start + " to " + end + " are: ");
                        foundPrime = true;
                    }
                    System.out.print(num + " ");
                }
            }
            if (!foundPrime) {
                System.out.println("No prime numbers in this range.");
            } else {
                System.out.println();
            }
        }
    
        public static void main(String[] args) {
            printPrimesInRange(10, 50);
        }
    }
    
