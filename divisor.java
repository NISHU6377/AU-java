class divisor{
    public static void main(String[] args) {
        int n = 25;
        divisorOfn(n);
    }
    static void divisorOfn(int a) {
        for(int i =1; i<=(a/2); i++) {
            if(a%i==0) {
                System.out.println("Divisor is: "+i);
            }
        }
    }
}