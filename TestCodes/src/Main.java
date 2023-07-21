public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 3, 4, 2, 1, 6, 8, 9, 7, 10};
        int n = 10;

        System.out.println(verifyArr(arr, n));

    }
    public static boolean verifyArr(int[] a, int n){
        int[] occurs = new int[n +1];
        for(int i = 0; i <= a.length -1; i++)
            occurs[a[i]]++;
        for(int i = 1; i <= n; i++)
            if(occurs[i] == 0){
                return false;
            }
        return true;
    }
}

