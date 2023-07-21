// Test driver for the Homework2 class
// Do not make any changes to this file!
// Xiwei Wang

import java.io.*;
import java.util.Arrays;

public class TestHomework2
{
    public static void main(String[] args)
    {        
        Homework2 myHW2 = new Homework2();
        int[] d = null;
        int src = -1, dest = -1;
        int low = -1, high = -1;
        final int inf = 99999;
        int[] myIntArray = null;
        double[] myDoubleArray = null;
        int numPassedTests = 0;
        int numTotalTests = 0;
        String testResult;
        
        // declare and print out matrices W and P
        int[][] W = {
            {0, 0, 0, 0, 0, 0},
            {0, 0, 1, inf, 1, 5},
            {0, 9, 0, 3, 2, inf},
            {0, inf, inf, 0, 4, inf},
            {0, inf, inf, 2, 0, 3},
            {0, 3, inf, inf, inf, 0}
            };
        
        int[][] P = {
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 4, 0, 4}, 
            {0, 5, 0, 0, 0, 4}, 
            {0, 5, 5, 0, 0, 4}, 
            {0, 5, 5, 0, 0, 0}, 
            {0, 0, 1, 4, 1, 0} 
        };
        
        System.out.println("The following tests are based on the adjacent matrix W and shortest path matrix P shown below:");
        System.out.println("W = ");
        for (int i = 1; i < W.length; i++)
        {
            for (int j = 1; j < W[i].length; j++)
                if (W[i][j] == inf)
                    System.out.format("%-6s", "∞");
                else
                    System.out.format("%-6d", W[i][j]);
            
            System.out.println();
        }
            
        System.out.println("\nP = ");
        for (int i = 1; i < P.length; i++)
        {
            for (int j = 1; j < P[i].length; j++)
                System.out.format("%-6d", P[i][j]);
            
            System.out.println();
        }     
        
        System.out.println();
        
        // Test 1
        numTotalTests++;
        int iReturn = -1;
        testResult = "[Failed]";
        String eMsg = "N/A";
        try
        {
            src = 1;
            dest = 2;
            
            iReturn = myHW2.minCost(src, dest, W, P);
            
            if (iReturn == 1)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        catch (StackOverflowError e)
        {
            eMsg = "Stack Overflow error occurred.";   
        }
        
        System.out.println("Test " + numTotalTests + ": minCost(src = " + src + ", dest = " + dest + ") - " + testResult);
        System.out.println(" Expected: 1");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + iReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");          
        
        // Test 2
        numTotalTests++;
        iReturn = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            src = 2;
            dest = 1;
            
            iReturn = myHW2.minCost(src, dest, W, P);
            
            if (iReturn == 8)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        catch (StackOverflowError e)
        {
            eMsg = "Stack Overflow error occurred.";   
        }
        
        System.out.println("Test " + numTotalTests + ": minCost(src = " + src + ", dest = " + dest + ") - " + testResult);
        System.out.println(" Expected: 8");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + iReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");  
        
        // Test 3
        numTotalTests++;
        iReturn = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            src = 3;
            dest = 2;
            
            iReturn = myHW2.minCost(src, dest, W, P);
            
            if (iReturn == 11)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        catch (StackOverflowError e)
        {
            eMsg = "Stack Overflow error occurred.";   
        }
        
        System.out.println("Test " + numTotalTests + ": minCost(src = " + src + ", dest = " + dest + ") - " + testResult);
        System.out.println(" Expected: 11");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + iReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");
        
        // Test 4
        numTotalTests++;
        iReturn = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            src = 5;
            dest = 3;
            
            iReturn = myHW2.minCost(src, dest, W, P);
            
            if (iReturn == 6)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        catch (StackOverflowError e)
        {
            eMsg = "Stack Overflow error occurred.";   
        }
        
        System.out.println("Test " + numTotalTests + ": minCost(src = " + src + ", dest = " + dest + ") - " + testResult);
        System.out.println(" Expected: 6");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + iReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");
        
        // Test 5
        numTotalTests++;
        iReturn = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            src = 5;
            dest = 4;
            
            iReturn = myHW2.minCost(src, dest, W, P);
            
            if (iReturn == 4)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        catch (StackOverflowError e)
        {
            eMsg = "Stack Overflow error occurred.";   
        }
        
        System.out.println("Test " + numTotalTests + ": minCost(src = " + src + ", dest = " + dest + ") - " + testResult);
        System.out.println(" Expected: 4");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + iReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");
        
        // Test 6
        numTotalTests++;
        iReturn = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            src = 3;
            dest = 3;
            
            iReturn = myHW2.minCost(src, dest, W, P);
            
            if (iReturn == 0)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        catch (StackOverflowError e)
        {
            eMsg = "Stack Overflow error occurred.";   
        }
        
        System.out.println("Test " + numTotalTests + ": minCost(src = " + src + ", dest = " + dest + ") - " + testResult);
        System.out.println(" Expected: 0");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + iReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");
        
        // Test 7
        numTotalTests++;
        iReturn = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            int[] testArray = {12, 20, 25, 45, 30, 29, 2};
            myIntArray = testArray;
            low = 0;
            high = myIntArray.length - 1;
            
            iReturn = myHW2.findIndex(myIntArray, low, high);
            
            if (iReturn == 3)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        catch (StackOverflowError e)
        {
            eMsg = "Stack Overflow error occurred.";   
        }
        
        System.out.println("Test " + numTotalTests + ": findIndex(" + Arrays.toString(myIntArray) + ", " + low + ", " + high + ") - " + testResult);
        System.out.println(" Expected: 3");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + iReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");
        
        // Test 8
        numTotalTests++;
        iReturn = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            int[] testArray = {30};
            myIntArray = testArray;
            low = 0;
            high = myIntArray.length - 1;
            
            iReturn = myHW2.findIndex(myIntArray, low, high);
            
            if (iReturn == 0)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        catch (StackOverflowError e)
        {
            eMsg = "Stack Overflow error occurred.";   
        }
        
        System.out.println("Test " + numTotalTests + ": findIndex(" + Arrays.toString(myIntArray) + ", " + low + ", " + high + ") - " + testResult);
        System.out.println(" Expected: 0");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + iReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");
        
        // Test 9
        numTotalTests++;
        iReturn = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            int[] testArray = {12, 20, 25, 30, 45, 50, 2};
            myIntArray = testArray;
            low = 0;
            high = myIntArray.length - 1;
            
            iReturn = myHW2.findIndex(myIntArray, low, high);
            
            if (iReturn == 5)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        catch (StackOverflowError e)
        {
            eMsg = "Stack Overflow error occurred.";   
        }
        
        System.out.println("Test " + numTotalTests + ": findIndex(" + Arrays.toString(myIntArray) + ", " + low + ", " + high + ") - " + testResult);
        System.out.println(" Expected: 5");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + iReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");
        
        // Test 10
        numTotalTests++;
        iReturn = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            int[] testArray = {12, 20, 25, 30, 45, 50, 60};
            myIntArray = testArray;
            low = 0;
            high = myIntArray.length - 1;
            
            iReturn = myHW2.findIndex(myIntArray, low, high);
            
            if (iReturn == 6)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        catch (StackOverflowError e)
        {
            eMsg = "Stack Overflow error occurred.";   
        }
        
        System.out.println("Test " + numTotalTests + ": findIndex(" + Arrays.toString(myIntArray) + ", " + low + ", " + high + ") - " + testResult);
        System.out.println(" Expected: 6");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + iReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");
        
        // Test 11
        numTotalTests++;
        iReturn = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            int[] testArray = {60, 50, 45, 30, 25, 20, 12};
            myIntArray = testArray;
            low = 0;
            high = myIntArray.length - 1;
            
            iReturn = myHW2.findIndex(myIntArray, low, high);
            
            if (iReturn == 0)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        catch (StackOverflowError e)
        {
            eMsg = "Stack Overflow error occurred.";   
        }
        
        System.out.println("Test " + numTotalTests + ": findIndex(" + Arrays.toString(myIntArray) + ", " + low + ", " + high + ") - " + testResult);
        System.out.println(" Expected: 0");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + iReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");
        
        // Test 12
        numTotalTests++;
        iReturn = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            int[] testArray = {60, 73, 21, 33, 42, 39, 15, 10, 34, 98, 74};
            myIntArray = testArray;
            low = 2;
            high = 7;
            
            iReturn = myHW2.findIndex(myIntArray, low, high);
            
            if (iReturn == 4)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        catch (StackOverflowError e)
        {
            eMsg = "Stack Overflow error occurred.";   
        }
        
        System.out.println("Test " + numTotalTests + ": findIndex(" + Arrays.toString(myIntArray) + ", " + low + ", " + high + ") - " + testResult);
        System.out.println(" Expected: 4");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + iReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");
        
        // Test 13
        numTotalTests++;
        iReturn = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            int[] testArray = {12, 32, 45, 12, 25, 70, 81};
            myIntArray = testArray;
            low = 0;
            high = 4;
            
            iReturn = myHW2.findIndex(myIntArray, low, high);
            
            if (iReturn == 2)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        catch (StackOverflowError e)
        {
            eMsg = "Stack Overflow error occurred.";   
        }
        
        System.out.println("Test " + numTotalTests + ": findIndex(" + Arrays.toString(myIntArray) + ", " + low + ", " + high + ") - " + testResult);
        System.out.println(" Expected: 2");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + iReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");
        
        // Test 14
        numTotalTests++;
        iReturn = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            int[] testArray = {60, 50, 65, 12, 25, 44, 37};
            myIntArray = testArray;
            low = 3;
            high = 6;
            
            iReturn = myHW2.findIndex(myIntArray, low, high);
            
            if (iReturn == 5)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        catch (StackOverflowError e)
        {
            eMsg = "Stack Overflow error occurred.";   
        }
        
        System.out.println("Test " + numTotalTests + ": findIndex(" + Arrays.toString(myIntArray) + ", " + low + ", " + high + ") - " + testResult);
        System.out.println(" Expected: 5");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + iReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");
        
        // Test 15
        numTotalTests++;
        double dReturn = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            double[] testArray = {10.4, 50.5, 84.6, 13.2, 10.1, 26.9, 71.4, 23.5};
            myDoubleArray = testArray;
            low = 4;
            high = 4;
            
            dReturn = myHW2.average(myDoubleArray, low, high);
            
            if (dReturn == 10.1)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        catch (StackOverflowError e)
        {
            eMsg = "Stack Overflow error occurred.";   
        }
        
        System.out.println("Test " + numTotalTests + ": average(" + Arrays.toString(myDoubleArray) + ", " + low + ", " + high + ") - " + testResult);
        System.out.println(" Expected: 10.1");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + dReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n"); 
        
        // Test 16
        numTotalTests++;
        dReturn = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            double[] testArray = {10.4, 50.5, 84.6, 13.2, 10.1, 26.9, 71.4, 23.5};
            myDoubleArray = testArray;
            low = 0;
            high = 7;
            
            dReturn = myHW2.average(myDoubleArray, low, high);
            
            if (dReturn == 36.325)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        catch (StackOverflowError e)
        {
            eMsg = "Stack Overflow error occurred.";   
        }
        
        System.out.println("Test " + numTotalTests + ": average(" + Arrays.toString(myDoubleArray) + ", " + low + ", " + high + ") - " + testResult);
        System.out.println(" Expected: 36.325");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + dReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");
        
        // Test 17
        numTotalTests++;
        dReturn = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            double[] testArray = {10.4, 50.5, 84.6, 13.2, 10.1, 26.9, 71.4, 23.5};
            myDoubleArray = testArray;
            low = 3;
            high = 7;
            
            dReturn = myHW2.average(myDoubleArray, low, high);
            
            if (dReturn == 29.02)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        catch (StackOverflowError e)
        {
            eMsg = "Stack Overflow error occurred.";   
        }
        
        System.out.println("Test " + numTotalTests + ": average(" + Arrays.toString(myDoubleArray) + ", " + low + ", " + high + ") - " + testResult);
        System.out.println(" Expected: 29.02");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + dReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");
        
        // Test 18
        numTotalTests++;
        dReturn = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            double[] testArray = {10.4, 50.5, 84.6, 13.2, 10.1, 26.9, 71.4, 23.5};
            myDoubleArray = testArray;
            low = 4;
            high = 5;
            
            dReturn = myHW2.average(myDoubleArray, low, high);
            
            if (dReturn == 18.5)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        catch (StackOverflowError e)
        {
            eMsg = "Stack Overflow error occurred.";   
        }
        
        System.out.println("Test " + numTotalTests + ": average(" + Arrays.toString(myDoubleArray) + ", " + low + ", " + high + ") - " + testResult);
        System.out.println(" Expected: 18.5");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + dReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");      
        
        // Test 19
        numTotalTests++;
        dReturn = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            double[] testArray = {10.4, 50.5, 84.6, 13.2, 10.1, 26.9, 71.4, 23.5};
            myDoubleArray = testArray;
            low = 0;
            high = 2;
            
            dReturn = myHW2.average(myDoubleArray, low, high);
            
            if (dReturn == 48.5)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        catch (StackOverflowError e)
        {
            eMsg = "Stack Overflow error occurred.";   
        }
        
        System.out.println("Test " + numTotalTests + ": average(" + Arrays.toString(myDoubleArray) + ", " + low + ", " + high + ") - " + testResult);
        System.out.println(" Expected: 48.5");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + dReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");          
        
        System.out.println("Total test cases: " + numTotalTests + "\nCorrect: " + numPassedTests + "\nWrong: " + (numTotalTests - numPassedTests));        	
    }
}
