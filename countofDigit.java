public class countofDigit {
    public static void main(String[] args) {
        int n = 0235;
        int res = count(n);
        System.out.println(res);
    }
    static int count(int x) {
        
        int c=0;
        do{
            x=x/10; 
            c++;
        }
        while (x!=0);
            return c;
        
    }
}
