import java.lang.reflect.Array;

import java.util.Arrays;
public class testGreedyFractional {
    public static void main(String[] args) {
        int n = 4;
        int[] P = {18, 30, 40, 21};
        int[] W = {3, 6, 10, 7};
        int cap = 15;

        double[] a = frackKnapsack( n,  cap,  P,  W);

        System.out.println(Arrays.toString(a));
    }
    public static double[] frackKnapsack(int n,int cap,int[] P,int[] W){
        //TODO: implement this method
        double[] ret = new double[n+1];
        int i = 0;
        int currWeight = 0;
        int weightNeeded = cap;
        int currProfit = 0;
        while( i < n && weightNeeded > 0){ //items remaining and instance not solved
            if(W[i] < weightNeeded) { // if adding the weight exceeds the maxWeight of knapsack
                weightNeeded -= W[i]; //subtract the weight from weightNeeded
                currWeight += W[i];
                ret[0] += P[i]; //add the profit to currProfit
                ret[i+1] = (double)W[i]/W[i];
                i++;
            }else if(W[i] > weightNeeded){
                double fractional = (double)weightNeeded/W[i];
                ret[i+1] = fractional;
                ret[0] += P[i]*fractional;
                currWeight += W[i]*fractional;
            }else {
                ret[i] = 0.0; // reject the item
                i++;
            }
            if(currWeight == cap) { //maxWeight reached or no more items
                break; //instance is solved
            }


        }
        return ret;
    }
}
