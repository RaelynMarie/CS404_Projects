// The Homework4 class that solves the Knapsack problem using the greedy as well as
// dynamic programming approaches
// Raelyn Mendoza

public class Homework4
{
    // This method implements the greedy approach based algorithm for the Knapsack
    // problem. The method uses the largest profit per unit weight strategy to select
    // an item and add it to the knapsack (without breaking it).
    // NOTE: if two items have equal unit profit, pick the one that is heavier.
    // It takes a weight array and a corresponding profit array, as well as two ints 
    // as parameters. Both arrays are indexed from 1 to n, where n is
    // the total number of candidate items). W is the capacity of the knapsack.
    // The method returns the optimal profit of items that can fit into the knapsack
    // without breaking it.
    public int greedyKnapsack(int[] w, int[] p, int n, int W)
    {
        // TODO: implement this method
        int[] pwRatios = new int[n + 1]; //saves the profit per unit weight
        int[] indexOrder = new int[n + 1]; //saves the indexes for the profit weight ratios

        //grabs profit per unit weight ratios and their indexes
        for (int i = 1; i <= n; i++) {
            pwRatios[i] = p[i] / w[i];
            indexOrder[i] = i;
        }

        //sorts the profit per unit weight ratio in descending order while keeping track of the indexes
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                int tempRatio = pwRatios[j];
                int tempIndex = indexOrder[j];
                if(pwRatios[j] > pwRatios[j + 1]){ //theyre already in order so dont even check
                    continue;
                }else if (pwRatios[j] < pwRatios[j + 1]) {
                    // swap pwRatios[j+1] and pwRatios[j] based on profit per unit weight
                    pwRatios[j] = pwRatios[j + 1];
                    indexOrder[j] = indexOrder[j+1];
                    pwRatios[j + 1] = tempRatio;
                    indexOrder[j+1] = tempIndex;
                } else if(pwRatios[j] == pwRatios[j + 1]){
                    // swap pwRatios[j+1] and pwRatios[j] based on the weight if their profit per units are the same
                    if(w[indexOrder[j]] < w[indexOrder[j+1]]){
                        pwRatios[j] = pwRatios[j + 1];
                        indexOrder[j] = indexOrder[j+1];
                        pwRatios[j + 1] = tempRatio;
                        indexOrder[j+1] = tempIndex;
                    }else{
                        continue;
                    }
                }
            }
        }

        int i = 1;
        int currWeight = 0;
        int currProfit = 0;
        while( i <= n && currWeight < W){ //items remaining and instance not solved
            if((currWeight + w[indexOrder[i]]) < W) { // if adding the weight exceeds the maxWeight of knapsack
                currWeight += w[indexOrder[i]]; //add the weight to currweight
                currProfit += p[indexOrder[i]]; //add the profit to currProfit
            }else {
                i++;
                continue; // reject the item
            }

            if(currWeight == W) { //maxWeight reached or no more items
                break; //instance is solved
            }

            i++;
        }
        return currProfit; // replace this statement with your own return
    }
    
    // This method implements the dynamic programming algorithm for the Knapsack
    // problem. The parameters and return are described in the above method.
    public int dpKnapsack(int[] w, int[] p, int n, int W)
    {
        // TODO: implement this method
        int i, j;
        int[][] P = new int[n+1][W+ 1];

        for(i = 1; i<= n; i++){
            for( j = 1; j <= W; j++){
                if(w[i] <= j){
                    P[i][j] = Math.max(P[i-1][j], p[i]+P[i-1][j-w[i]]);
                }
                else{  //if (w[i] > j)
                    P[i][j] = P[i-1][j];
                }
            }
        }

        return P[n][W]; // replace this statement with your own return
    }
}
