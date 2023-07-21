public class Quiz6Prob1 {
    public static void main(String[] args){
        int x = 2;
        int n = 5;
        int m = 3;

        System.out.println("x to the power of n mod m is: " + modFunc(x, n, m));
    }
    public static int modFunc(int x, int n, int m){
        if(n == 0){
            return 1;
        }
        else if (n % 2 == 0) {
            return (modFunc(x, n/2, m)*modFunc(x, n/2, m))%m;
        }
        else{

            return ((x%m)*modFunc(x, n-1, m))%m;
        }
    }

}

