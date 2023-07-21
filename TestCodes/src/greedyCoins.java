public class greedyCoins {
    public static void main(String[] args) {
        int[] coins1 = {25, 10, 10, 5, 1, 1};
        int owed1 = 36;

        System.out.print("Solution 1: ");
        change(coins1, owed1);

        int[] coins2 = {12, 10, 5, 1, 1, 1, 1};
        int owed2 = 16;

        System.out.print("Solution 2: ");
        change(coins2, owed2);

        int[] coins3 = {25, 10, 10, 5, 5, 1};
        int owed3 = 47;

        System.out.print("Solution3: ");
        change(coins3, owed3);
    }
    public static void change(int[] coins, int owed){
        String solution = "";
        //boolean solved = false;
        int i = 0;
        int currChange = 0;
        while(i < coins.length /*&& solved==false*/){ //there are more coins and the instance is not solved
            int currCoin = coins[i]; //grab largest remaining coin assuming array of coins is sorted
            if(currChange+currCoin > owed){ //feasibility check
                i++;
                continue; //reject coin
            }
            else{
                currChange += currCoin; //add coin to change
                solution += currCoin + ",";
                i++;
            }
            if(currChange == owed){ //if total value of change equals the amount owed
                //solved = true; //solution check
                break;
            }
        }
        System.out.println(solution);
    }
}
