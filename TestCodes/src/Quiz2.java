import java.util.Arrays;

public class Quiz2 {
    public static void main(String[] args) { //psmv
        int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] out = coordinatesOf(3, A, 7);
        System.out.println(Arrays.toString(out));
    }
    public static int[] coordinatesOf(int n, int[][]A, int x){
        int low = 0;
        int high = n * n - 1;
        while (low <= high){
            int mid = (low+high)/2;
            int row = mid / n; // why do this
            int col = mid % n; // why do this
            if (x < A[row][col])
                high= mid-1;
            else if (x > A[row][col])
                low = mid+1;
            else
                return new int[]{row, col}; //returns an one element array with that element being a set
        }
        return new int[]{-1};
    } // time complexity is logn^2 = 2logn --> Theta log(n)
}