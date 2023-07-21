//You are provided with a one-dimensional int array d that has n pairs of elements,
// which is 2n in total.
// Each pair represents the row and column dimensions of a matrix.


public class Exam1Problem12 {
    public static void main(String[] args) {
        int[] d = {5, 2, 3, 4, 4, 2, 2, 7, 5, 3, 3, 1};
    }
    public static void longestMultiple(int n, int[] d){
        int currLen = 1, maxLen = 0;
        int currStart = 1, maxStart = 1;

        for(int i =1; i <= n-1; i++){
            int dc = d[i*2-1];
            int dr = d[i*2];
            if(dc == dr){
                currLen++;
            }
            if(currLen > maxLen){
//                maxLen = ;
//                maxStart = ;
            }else{
                currLen = 1;
                currStart = i+1;
            }
            //maxLen
            //maxStart -> maxStart + maxLen-1
        }
    }
}
