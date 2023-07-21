// Practice 8
// Raelyn Mendoza

import java.util.Arrays;

public class GraphColoring
{
    // instance variables
    static int[] vcolor;
    static int n;
    static int m;
    static int[][] W;
    
    public static void main(String[] args)
    {

        n = 4;
        vcolor = new int[n + 1];
        int[][] G =
        {
            {0, 0, 0, 0, 0},
            {0, 0, 1, 1, 1},
            {0, 1, 0, 1, 0},
            {0, 1, 1, 0, 1},
            {0, 1, 0, 1, 0}
        };
        W = G;
        System.out.println("\nOutput1 produced by greedyColoring:");
        greedyColoring(W, vcolor, n);

        n = 6;
        vcolor = new int[n + 1];
        int[][] G2 =
        {
            {0, 0, 0, 0, 0, 0, 0},
            {0, 0, 1, 1, 0, 1, 1},
            {0, 1, 0, 1, 1, 0, 1},
            {0, 1, 1, 0, 1, 1, 0},
            {0, 0, 1, 1, 0, 1, 1},
            {0, 1, 0, 1, 1, 0, 1},
            {0, 1, 1, 0, 1, 1, 0}
        };

        W = G2;
        System.out.println("\nOutput2 produced by greedyColoring:");
        greedyColoring(W, vcolor, n);

        n = 4;
        vcolor = new int[n + 1];
        int[][] G3 =
                {
                        {0, 0, 0, 0, 0},
                        {0, 0, 1, 1, 1},
                        {0, 1, 0, 1, 1},
                        {0, 1, 1, 0, 1},
                        {0, 1, 1, 1, 0}
                };
        W = G3;
        System.out.println("\nOutput3 produced by greedyColoring:");
        greedyColoring(W, vcolor, n);


    }
    
    public static void greedyColoring(int[][] W, int[] vcolor, int n)
    {
        // TODO: implement this method using the greedy coloring algorithm
        int vertex = 1;

        while(vertex <= n) { //keep going until there are no more vertices to color
            vcolor[vertex]= 1;
            for (int adjVertex = 1; adjVertex <= n; adjVertex++){
                if(vertex==adjVertex) continue; //ex (1,1) just move to next adj vertex
                if (W[vertex][adjVertex] == 1 && vcolor[vertex] == vcolor[adjVertex]) { //check for conflicts
                    vcolor[vertex]++; // try the next color
                }
            }
            vertex++; //move to the next vertex now
        }

        System.out.println("["+Arrays.toString(vcolor).substring(4));
    }
}

// if we want to give the amount of colors available for use
//    int vertex = 1;
//    int numOfColors = 2;
//
//        while(vertex <= n) { //keep going until there are no more vertices to color
//                vcolor[vertex]= 1;
//                for (int adjVertex = 1; adjVertex <= n; adjVertex++){
//                if(vertex==adjVertex) continue; //ex (1,1) just move to next adj vertex
//                if (W[vertex][adjVertex] == 1 && vcolor[vertex] == vcolor[adjVertex]) { //check for conflicts
//                vcolor[vertex]++; // try the next color
//                if(vcolor[vertex] > numOfColors){
//                vcolor[vertex]=0;
//                System.out.println("Can not fill graph with only " + numOfColors + " colors!");
//                System.out.println("V" + vertex + " is not colored.");
//                break;
//                }
//                }
//                }
//                vertex++; //move to the next vertex now
//                }
//
//                System.out.println("["+Arrays.toString(vcolor).substring(4));