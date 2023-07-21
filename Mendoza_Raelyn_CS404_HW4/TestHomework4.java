// Test driver for the Homework4 class
// Do not make any changes to this file!
// Xiwei Wang

import java.util.Arrays;

public class TestHomework4 
{
    static Homework4 myHW4;
    static int numPassedTests;
    static int numTotalTests;

    public static void main(String[] args)
    {

        myHW4 = new Homework4();

        numPassedTests = 0;
        numTotalTests = 0;

        int[] n = {3, 4, 6};
        int[] W = {30, 16, 45};
        int[][] p = {{0, 50, 60, 140},
                {0, 40, 30, 50, 10},
                {0, 5, 26, 42, 15, 40, 30}};
        int[][] w = {{0, 5, 10, 20},
                {0, 2, 5, 10, 5},
                {0, 5, 13, 7, 5, 20, 10}};
        int[][] expOutput = {{190, 200},
                {80, 90},
                {127, 127}};

        for (int i = 0; i < n.length; i++)
            runTest(i + 1, n[i], W[i], p[i], w[i], expOutput[i]);

        System.out.println("Total test cases: " + numTotalTests + "\nCorrect: " + numPassedTests + "\nWrong: " + (numTotalTests - numPassedTests)); 
    }

    static void testKnapsack(int i, int in_n, int in_W, int[] in_p, int[] in_w, int expOutput, boolean greedy)
    {
        int iReturn = -1;
        String testResult = "[Failed]";
        String eMsg = "N/A";
        String method = "";
        int n = 0;
        int[] d = null;

        try
        {
            if (greedy)
            {
                iReturn = myHW4.greedyKnapsack(in_w, in_p, in_n, in_W);
                method = "greedyKnapsack";
            }
            else
            {
                iReturn = myHW4.dpKnapsack(in_w, in_p, in_n, in_W);
                method = "dpKnapsack";
            }

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
        String text = "Test " + numTotalTests + ": " + method + "(w" + i + ", p" + i + ", n" + i + ", W" + i + ")" +
                testResult + "\n" + " Expected: " + expOutput;
        printMessage(eMsg, text, "" + iReturn);
    }

    static void printMessage(String eMsg, String text, String ret)
    {
        System.out.println(text);
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + ret + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");
    }

    static void runTest(int i, int in_n, int in_W, int[] in_p, int[] in_w, int[] expOutput)
    {
        System.out.println("Problem " + i + ":\nn" + i + " = " + in_n + ", W" + i + " = " + in_W);
        System.out.println("p" + i + " = {" + Arrays.toString(in_p).substring(4).replace(']', '}'));
        System.out.println("w" + i + " = {" + Arrays.toString(in_w).substring(4).replace(']', '}') + "\n");

        testKnapsack(i, in_n, in_W, in_p, in_w, expOutput[0], true);
        testKnapsack(i, in_n, in_W, in_p, in_w, expOutput[1], false);
    }
}