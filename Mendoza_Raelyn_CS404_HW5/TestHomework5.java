// Test driver for the Homework5 class
// Do not make any changes to this file!
// Xiwei Wang

public class TestHomework5 
{
    public static void main(String[] args)
    {
        Homework5 myHW5 = new Homework5();
        int n = 0;
        boolean[][] W;
        int numCheckedNodes = 0;
        int numTotalTests = 0;
        String testResult;
                
        // Test 1
        numTotalTests++;
        int iReturn1 = -1;
        int iReturn2 = -1;
        testResult = "[Failed]";
        String eMsg = "N/A";
        try
        {
            // set n
            n = 5;

            // set matrix W (the first row and first colums are dummies)
            boolean[][] testW1 = {
                {false, false, false, false, false, false},
                {false, true, true, false, false, true},
                {false, true, true, true, true, true},
                {false, false, true, true, true, false},
                {false, false, true, true, true, false},
                {false, true, true, false, false, true},
                };

            // correct answer
            numCheckedNodes = 45;
            
            W = testW1; 
            
            myHW5.setupGraph(n, W);
            
            System.out.println("Test " + numTotalTests + ":");
            printMatrix(W, "W1");
            
            System.out.println(" - hamiltonian(0) on W1:");
            myHW5.hamiltonian(0);
            iReturn1 = myHW5.getCheckedNodes();           
            
            System.out.println("\n - estimateHamiltonian(" + n + ", W1):");
            iReturn2 = myHW5.estimateHamiltonian(n);
            
            if (iReturn1 == numCheckedNodes)
                testResult = "[Passed]";   
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        catch (StackOverflowError e)
        {
            eMsg = "Stack Overflow error occurred.";   
        }
        
        System.out.println(" Expected: # of checked nodes = " + numCheckedNodes + " " + testResult);
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: # of checked nodes: " + iReturn1 + ", # of estimated checked nodes: " + iReturn2 + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");
    
        // Test 2
        numTotalTests++;
        iReturn1 = -1;
        iReturn2 = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            // set n
            n = 8;

            // set matrix W (the first row and first colums are dummies)
            boolean[][] testW2 = {
                {false, false, false, false, false, false, false, false, false},
                {false, true, true, true, false, false, false, false, true},
                {false, true, true, true, false, false, false, true, true},
                {false, true, true, true, true, false, true, false, false},
                {false, false, false, true, true, true, false, false, false},
                {false, false, false, false, true, true, true, false, false},
                {false, false, false, true, false, true, true, true, false},
                {false, true, true, false, false, false, false, true, true},
                {false, true, true, false, false, false, false, true, true},
                };

            // correct answer
            numCheckedNodes = 379;
            
            W = testW2; 
            
            myHW5.setupGraph(n, W);
            
            System.out.println("Test " + numTotalTests + ":");
            printMatrix(W, "W2");
            
            System.out.println(" - hamiltonian(0) on W2:");
            myHW5.hamiltonian(0);
            iReturn1 = myHW5.getCheckedNodes();           
            
            System.out.println("\n - estimateHamiltonian(" + n + ", W2):");
            iReturn2 = myHW5.estimateHamiltonian(n);
            
            if (iReturn1 == numCheckedNodes)
                testResult = "[Passed]";   
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        catch (StackOverflowError e)
        {
            eMsg = "Stack Overflow error occurred.";   
        }
        
        System.out.println(" Expected: # of checked nodes = " + numCheckedNodes + " " + testResult);
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: # of checked nodes: " + iReturn1 + ", # of estimated checked nodes: " + iReturn2 + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");       
    }
    
    public static void printMatrix(boolean[][] matrix, String s)
    {
        System.out.println(" " + s + " = ");
        for (int i = 1; i < matrix.length; i++)
        {
            for (int j = 1; j < matrix[i].length; j++)
                if (matrix[i][j] == true)
                    System.out.format("%6s", "T");
                else
                    System.out.format("%6s", "F");

            System.out.println();
        }

        System.out.println();
    }   
}