// The Homework3 class that implements the three methods in the programming question
// Raelyn Mendoza

public class Homework3
{
    // This method takes two int parameters and returns the number of combinations when choosing 
    // k elements out of a set of n objects, also known as n choose k. To receive any credit, you 
    // should NOT use multiplication, division, factorial, or recursion. Only a single one-dimensional 
    // array is allowed. 
    public int combinations(int n, int k)
    {
        // TODO: implement this method
        // c(n,k) = c(n-1; k) + c(n-1, k-1)
        int[] c = new int[k+1];
        c[0] = 1;
        int i, j;
        for (i = 1; i <= n; i++) {
            int l;
            if (i > k) {
                l = k;
            } else {
                l = i;
            }
            for (j = l; j > 0; j--) {
                c[j] = c[j] + c[j - 1];
            }
        }
        return c[k];
    }
    
    // This method takes an integer n and returns the number of ways to multiply n chained matrices
    public int numOrders(int n)
    {
        // TODO: implement this method
        int orders = 0;

        if(n <= 2) return 1;
        for(int i = 1; i <= n-1; i++){
            orders += numOrders(i) * numOrders(n-i);
        }
        return orders; // replace this statement with your own return
    }
    
    // This method finds and returns the maximum element multiplications and build the order matrix P
    public int maxMulti(int n, int[] d, int[][] M, int[][] P)
    {       
        // TODO: implement this method
        int i, j, k, diagonal, multi;
        for(i = 1; i <= n; i++){
            M[i][i] = 0;
        }
        for(diagonal = 1; diagonal <= n-1; diagonal++){
            for(i = 1; i <= n-diagonal; i++){
                j = i + diagonal;
                M[i][j] = -1;
                for(k = i; k <= j-1; k++){
                    multi = M[i][k] + M[k+1][j] + d[i-1]*d[k]*d[j];
                    if(multi > M[i][j]){
                        M[i][j] = multi;
                        P[i][j] = k;
                    }
                }
            }
        }
        return M[1][n]; // replace this statement with your own return
    }
    
    // This method takes as parameters an int array P, two ints, as well as a 
    // String and recursively updates the string so that it represents the order
    // of multiplications.
    // Do not make any changes to this method!
    public String buildOrder(int[][] P, int i, int j, String order)
    {
        if (i == j)
            return order + "A" + i;
        else
        {
            int k = P[i][j];
            String tmp = order + "(";
            tmp = buildOrder(P, i, k, tmp);
            tmp = buildOrder(P, k + 1, j, tmp);
            return tmp + ")";
        }
    }       
}
