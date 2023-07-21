// The Homework2 class that implements three divide-and-conquer methods
// Raelyn Mendoza

public class Homework2 
{
    // This method finds the length of the shortest path from vertex src to vertex dest.
    // Make sure you implement using divide-and-conquer approach.
    public int minCost(int src, int dest, int[][] W, int[][] P)
    {
        // TODO: implement this method
        int mid = P[src][dest];
        int rightSide;
        int leftSide;
        if(src == dest){
            return 0;
        }
        if(P[src][dest] == 0){
            return W[src][dest];
        }
        else{
            leftSide = minCost(src, mid, W, P);
            rightSide = minCost(mid, dest, W, P);

        }
        return leftSide + rightSide;
    }
    
    // This method finds the index p so that elements from A[low] to A[p] are
    // monotonically increasing, while elements from A[p] to A[high] are 
    // monotonically decreasing.
    // Make sure you implement using divide-and-conquer approach.
    public int findIndex(int[] A, int low, int high)
    {
        // TODO: implement this method
        int p = (low+high)/2;

        if(low == high){
            return p;
        }
        if (A[p - 1] < A[p] && A[p+1] < A[p]) {
            return p;
        }
        if(A[p-1] > A[p] && A[p] > A[p+1]){
            return findIndex(A, low, p-1);

        }else{
            return findIndex(A,p+1, high);
        }
    }
    
    // This method takes as parameters a double array A and two indices. It computes
    // the average of the floating point numbers in A that are located between indices
    // low and high inclusive. 
    // Make sure you implement using divide-and-conquer approach.
    public double average(double[] A, int low, int high)
    {
        // TODO: implement this method
        int mid = (low+high)/2;
        int count = (mid-low)+1;
        int count2 = high-mid;
        double sumLeft, sumRight;
        //list size 1
        if(low == high){
            return A[low];
        }
        //list size 2
        else if(low == mid && mid+1 == high){
            return (A[low] + A[high]) /2;
        }
        //mid will be in the middle
        else{
            sumLeft = average(A, low, mid)*count;
            sumRight = average(A, mid+1, high)*count2;
        }
        return (sumLeft+sumRight)/(count+count2);
    }
}
