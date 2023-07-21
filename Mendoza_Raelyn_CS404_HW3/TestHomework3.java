// Test driver for the Homework3 class
// Do not make any changes to this file!
// Xiwei Wang

import java.util.Arrays;

public class TestHomework3 
{
    static Homework3 myHW3;
    static int numPassedTests;
    static int numTotalTests;

    public static void main(String[] args)
    {    
        myHW3 = new Homework3();

        numPassedTests = 0;
        numTotalTests = 0;

        // Tests for combinations
        int[] input1_n = {1, 5, 7, 4, 9, 1024};
        int[] input1_k = {1, 1, 7, 2, 4, 1022};
        int[] expOutput1 = {1, 5, 1, 6, 126, 523776};
        for (int i = 0; i < input1_n.length; i++)
            testCombinations(input1_n[i], input1_k[i], expOutput1[i]);

        // Tests for numOrders
        int[] input2 = {2, 4, 8, 10};
        int[] expOutput2 = {1, 5, 429, 4862};
        for (int i = 0; i < input2.length; i++)
            testNumOrders(input2[i], expOutput2[i]);

        // Tests for maxMulti
        int[][] input3 = {{5, 2, 3, 4, 6, 7, 8},
                {1, 2, 3, 4, 5, 6, 7},
                {9, 8, 7, 6, 5, 4, 3, 2, 1}};
        int[] expOutput3_multi = {786, 490, 1512};
        String[] expOutput3_order = {"(((A1A2)A3)A4)(A5A6)", "A1(A2(A3(A4(A5A6))))", "((((((A1A2)A3)A4)A5)A6)A7)A8"};
        for (int i = 0; i < input3.length; i++)
            testMaxMulti(input3[i], expOutput3_multi[i], expOutput3_order[i]);
        
        System.out.println("Total test cases: " + numTotalTests + "\nCorrect: " + numPassedTests + "\nWrong: " + (numTotalTests - numPassedTests));
    }

    static void testCombinations(int inN, int inK, int expOutput)
    {
        int iReturn = -1;
        String testResult = "[Failed]";
        String eMsg = "N/A";

        try
        {
            iReturn = myHW3.combinations(inN, inK);

            if (iReturn == expOutput)
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

        numTotalTests++;
        String text = "Test " + numTotalTests + ": combinations(" + inN + ", " + inK + ") - " + testResult + "\n Expected: " + expOutput;
        printMessage(eMsg, text, "" + iReturn);
    }

    static void testNumOrders(int input, int expOutput)
    {
        int iReturn = -1;
        String testResult = "[Failed]";
        String eMsg = "N/A";

        try
        {
            iReturn = myHW3.numOrders(input);

            if (iReturn == expOutput)
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

        numTotalTests++;
        String text = "Test " + numTotalTests + ": numOrders(" + input + ") - " + testResult + "\n Expected: " + expOutput;
        printMessage(eMsg, text, "" + iReturn);
    }

    static void testMaxMulti(int[] input, int expOutMulti, String expOutOrder)
    {
        int iReturn = -1;
        String sReturn = "";
        String testResult = "[Failed]";
        String eMsg = "N/A";
        int n = 0;
        int[] d = null;

        try
        {
            n = input.length - 1;  // number of matrices
            d = input;
            int[][] M = new int[n + 1][n + 1];
            int[][] P = new int[n + 1][n + 1];

            // populate the first row and first column with zeros
            for (int m = 0; m <= n; m++)
                M[0][m] = M[m][0] = P[0][m] = P[m][0] = 0;

            iReturn = myHW3.maxMulti(n, d, M, P);
            sReturn = myHW3.buildOrder(P, 1, n, sReturn);
            sReturn = sReturn.substring(1, sReturn.length() - 1);   // remove the first and the last parenthesis

            if (iReturn == expOutMulti && sReturn.equals(expOutOrder))
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

        numTotalTests++;
        String text = "Test " + numTotalTests + ": d = " + Arrays.toString(d) + ", buildOrder(1, " + n + ") - " + testResult +
                "\n" + " Expected: max # multiplications = " + expOutMulti + " and order is " + expOutOrder;
        printMessage(eMsg, text, "max # multiplications = " + iReturn + " and order is " + sReturn + "\n");
    }

    static void printMessage(String eMsg, String text, String ret)
    {
        System.out.println(text);
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + ret + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");
    }
}