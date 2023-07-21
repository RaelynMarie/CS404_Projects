// The Homework1 class that contains three algorithms
// Raelyn Mendoza

public class Homework1
{
    // This method takes two two-dimensional integer arrays.
    // It returns a two-dimensional integer array that holds the product of matrices A and B.
    public int[][] matrixMultiplication(int[][] A, int[][] B)
    {
        // TODO: implement this method

        int[][] C = new int[A.length][B[0].length]; //rows in C = rows in A / cols in C = cols in B
        int sum = 0;
        int product = 0;
        for(int m = 0; m < A.length; m++){
            for(int p = 0; p < B[0].length; p++){
                sum = 0;
                for(int n = 0; n < A[m].length; n++){
                    product = A[m][n] * B[n][p];
                    sum += product;
                }
                C[m][p] = sum;
                product = 0;
            }
        }
        return C;
    }

    // This method takes an array as well as two integers: low and high.
    // It returns true if the array is sorted in nondecreasing order between the indices low and high, or false otherwise.
    public boolean isSorted(int[] A, int low, int high)
    {
        // TODO: implement this method
        if(low == high){
            return true;
        }else{
            if(A[low+1] >= A[low]){
                return isSorted(A, low+1, high);
            }else{
                return false;
            }
        }
    }

    // This method takes an array as well as two integers: low and high.
    // It returns the index of the largest element in array A between indices low and high.
    public int indexOfMax(int[] A, int low, int high) {
        // TODO: implement this method
        if (A[low] == A[high]) {
            return low;
        }
        if (low + 1 == high && A[low] > A[high]){
            return low;
        }
        else if (low +1 == high && A[low] < A[high]) {
            return high;
        }



        if( A[indexOfMax(A,low,(low+high)/2)] > A[indexOfMax(A, (low+high)/2 + 1, high)]) {
            return indexOfMax(A, low, (low + high) / 2);
        }else {
            return indexOfMax(A, (low + high) / 2 + 1, high);
        }
    }
}
