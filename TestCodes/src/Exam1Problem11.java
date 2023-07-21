//Write a divide-and-conquer algorithm for the method ascPairs that takes as parameters
// an unsorted array A (with no duplicates), as well as indices low and high.
// It returns the total number of ascending adjacent pairs in the subarray specified
// by low and high (inclusive). An ascending adjacent pair means that the
// first number in the pair is smaller than the second number in the same pair.
// For instance, (4, 5) is an ascending pair while (5, 4) is not.
// Note: in order to receive any credit, your algorithm must NOT have any looping
// statements such as while, for, AND your method should NOT call any other methods
// except itself nor should it alter the content of the array parameter.

//ascPairs(A, 0, 7) would return 4, because (7, 10), (10, 31), (19, 22) , and (15, 27)
// are ascending pairs. ascPairs(A, 3, 5) would return 1, because the only
// ascending pair is (19. 22).
public class Exam1Problem11 {
    public static void main(String[] args) {
        int[] A = {25, 7, 10, 31, 19, 22, 15, 27};
        int low = 0;
        int high = 7;
        System.out.println(ascPairs(A, low, high));
    }
    public static int ascPairs(int[] A, int low, int high)
    {
        // TODO: implement this method

        if(low >= high){
            return 0;

        }else{

            int mid = (low + high)/2;

            int leftPairs = ascPairs(A, low, mid);

            int rightPairs = ascPairs(A, mid+1, high);

            if(A[mid] < A[mid+1]){
                return 1+leftPairs+rightPairs;
            }else{
                return leftPairs+rightPairs;
            }
        }
    }
}
