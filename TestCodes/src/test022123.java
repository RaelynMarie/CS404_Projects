public class test022123 {
    public static void main(String[] args){
        int n = 4;
        System.out.println(factorial(n));
    }
    public static int factorial(int n){
        int result = 0;
        if(n==0) return 1;
        else if (n>0) {
            result = factorial(n-1)*n;
        }
        return result;
    }
}
