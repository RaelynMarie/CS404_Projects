// The Homework5 class that includes methods for the Hamiltonian circuit problem
// Raelyn Mendoza

import java.util.ArrayList;
import java.util.Arrays;

public class Homework5
{
    // instance variables
    private int n;                  // number of vertices
    private boolean[][] W;          // adjacency matrix
    private int[] vindex;           // indices of each vertex on the path
    private int numCheckedNodes;    // number of visited nodes

    // This method initializes the instance variables.
    // Do not make any changes to this method! 
    public void setupGraph(int numVertices, boolean[][] adjMatrix)
    {
        n = numVertices;
        W = adjMatrix;        
        vindex = new int[n];
        vindex[0] = 1;              // make v1 the starting vertex
        numCheckedNodes = 0;
    }
    
    // This method implements the backtracking algorithm for the Hamiltonian circuit 
    // problem. It updates the counter numCheckedNodes whenever a node in the state
    // space tree is visited.
    public void hamiltonian(int i)
    {
        // TODO: implement this method
        int j;
        numCheckedNodes++;
        if(promising(i)){
            if(i == n-1){
                System.out.println("Solution: "+Arrays.toString(vindex));
            }else{
                for(j = 2; j <= n; j++){ //try all vertices as next one
                    vindex[i+1] = j;
                    hamiltonian(i+1);
                }
            }
        }
    }
    
    // This method takes an int (number of vertices)as the parameter, and uses the 
    // Monte Carlo approach to estimate the number of nodes that the algorithm will 
    // check before finding all Hamiltonian circuits for the graph represented by W.
    // You should assume that v1 is the start and end vertices.
    public int estimateHamiltonian(int n) 
    {
        // TODO: implement this method
        int v = 1;
        int numnodes = 1;
        int m = 1;
        int mprod = 1;
        int i = n-1;
        while(m != 0 && i > 0){
            int t = i; //the number of children
            mprod = mprod * m;
            numnodes = numnodes + mprod * t;
            ArrayList<Integer> promisingChildren = new ArrayList<Integer>();
            for(int j = 2; j <= n; j++){
                vindex[j-1] = j;
                if(promising(j-1)){
                    promisingChildren.add(j);
                }
            }
            m = promisingChildren.size(); //the number of promising children
            if(m != 0){
                int index = (int)(Math.random() * promisingChildren.size());
                v = promisingChildren.get(index); //getting a random child from the list of promising children
                vindex[index] = v;

            }
            i--;

        }
        return numnodes; // replace this statement with your own return
    }
    
    // This method takes an int (ith vertex on the path) as the parameter and checks if 
    // placing a vertex at vindex[i] can potentially lead to a solution, i.e., does not 
    // create conflicts.
    public boolean promising(int i)
    {
        // TODO: implement this method
        int j;
        boolean prom;

        if(i == n-1 && !(W[vindex[n-1]][vindex[0]])){
            prom = false;
        } else if (i > 0 && !(W[vindex[i-1]][vindex[i]])) { //ith vertex must be adjacent to (i-1)st
            prom = false;
        }else{
            prom = true;
            j = 1;
            while(j < i && prom){ //check if vertex is already selected
                if(vindex[i] == vindex[j]){
                    prom = false;
                }
                j++;
            }
        }
        return prom; // replace this statement with your own return
    }
    
    // Do not make any changes to this method!
    public int getCheckedNodes()
    {
        return numCheckedNodes;
    }
}
