// Test driver for the Homework1 class
// Do not make any changes to this file!
// Xiwei Wang

import java.util.Arrays;

public class TestHomework1
{
    public static void main(String[] args)
    {
        Homework1 myHW1 = new Homework1();
        int[][] myArray1 = null;
        int[][] myArray2 = null;
        int[][] myArray3 = null;
        int[] myArray4 = null;
        int n = 0, low = 0, high = 0;
        int numPassedTests = 0;
        int numTotalTests = 0;
        String testResult;

        // Test 1
        numTotalTests++;
        int[][] iaReturn = null;
        testResult = "[Failed]";
        String eMsg = "N/A";
        try
        {
            int[][] testArray1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
                };

            int[][] testArray2 = {
                {11, 12, 13},
                {14, 15, 16},
                {17, 18, 19}
                };

            int[][] testArray3 = {
                {90, 96, 102},
                {216, 231, 246},
                {342, 366, 390}
                };

            myArray1 = testArray1;
            myArray2 = testArray2;
            myArray3 = testArray3;

            iaReturn = myHW1.matrixMultiplication(myArray1, myArray2);

            if (compareArrays(iaReturn, myArray3) == true)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }

        System.out.print("Test " + numTotalTests + ": matrixMultiplication - " + testResult + "\n" + buildArrayString(myArray1));
        System.out.print("X\n" + buildArrayString(myArray2));
        System.out.println(" --------------\n Expected:\n" + buildArrayString(myArray3));
        if (eMsg.equals("N/A"))
            System.out.println(" Yours:\n" + buildArrayString(iaReturn) + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 2
        numTotalTests++;
        iaReturn = null;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            int[][] testArray1 = {
                {1, 2, 3},
                {4, 5, 6},
                };

            int[][] testArray2 = {
                {7, 8, 9},
                {1, 0, 5},
                {10, 3, 2}
                };

            int[][] testArray3 = {
                {39, 17, 25},
                {93, 50, 73}
                };

            myArray1 = testArray1;
            myArray2 = testArray2;
            myArray3 = testArray3;

            iaReturn = myHW1.matrixMultiplication(myArray1, myArray2);

            if (compareArrays(iaReturn, myArray3) == true)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }

        System.out.print("Test " + numTotalTests + ": matrixMultiplication - " + testResult + "\n" + buildArrayString(myArray1));
        System.out.print("X\n" + buildArrayString(myArray2));
        System.out.println(" --------------\n Expected:\n" + buildArrayString(myArray3));
        if (eMsg.equals("N/A"))
            System.out.println(" Yours:\n" + buildArrayString(iaReturn) + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 3
        numTotalTests++;
        iaReturn = null;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            int[][] testArray1 = {
                {7, 6, 3}
                };

            int[][] testArray2 = {
                {7},
                {1},
                {10}
                };

            int[][] testArray3 = {
                {85}
                };

            myArray1 = testArray1;
            myArray2 = testArray2;
            myArray3 = testArray3;

            iaReturn = myHW1.matrixMultiplication(myArray1, myArray2);

            if (compareArrays(iaReturn, myArray3) == true)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }

        System.out.print("Test " + numTotalTests + ": matrixMultiplication - " + testResult + "\n" + buildArrayString(myArray1));
        System.out.print("X\n" + buildArrayString(myArray2));
        System.out.println(" --------------\n Expected:\n" + buildArrayString(myArray3));
        if (eMsg.equals("N/A"))
            System.out.println(" Yours:\n" + buildArrayString(iaReturn) + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 4
        numTotalTests++;
        iaReturn = null;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            int[][] testArray1 = {
                {18, 26, 52, 12},
                {23, 18, 31, 65},
                {10, 22, 14, 18}
                };

            int[][] testArray2 = {
                {7}, 
                {8},
                {9},
                {1}
                };

            int[][] testArray3 = {
                {814},
                {649},
                {390}
                };

            myArray1 = testArray1;
            myArray2 = testArray2;
            myArray3 = testArray3;

            iaReturn = myHW1.matrixMultiplication(myArray1, myArray2);

            if (compareArrays(iaReturn, myArray3) == true)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }

        System.out.print("Test " + numTotalTests + ": matrixMultiplication - " + testResult + "\n" + buildArrayString(myArray1));
        System.out.print("X\n" + buildArrayString(myArray2));
        System.out.println(" --------------\n Expected:\n" + buildArrayString(myArray3));
        if (eMsg.equals("N/A"))
            System.out.println(" Yours:\n" + buildArrayString(iaReturn) + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 5
        numTotalTests++;
        iaReturn = null;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            int[][] testArray1 = {
                {15}
                };

            int[][] testArray2 = {
                {7, 8, 9, 1}
                };

            int[][] testArray3 = {
                {105, 120, 135, 15}
                };

            myArray1 = testArray1;
            myArray2 = testArray2;
            myArray3 = testArray3;

            iaReturn = myHW1.matrixMultiplication(myArray1, myArray2);

            if (compareArrays(iaReturn, myArray3) == true)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }

        System.out.print("Test " + numTotalTests + ": matrixMultiplication - " + testResult + "\n" + buildArrayString(myArray1));
        System.out.print("X\n" + buildArrayString(myArray2));
        System.out.println(" --------------\n Expected:\n" + buildArrayString(myArray3));
        if (eMsg.equals("N/A"))
            System.out.println(" Yours:\n" + buildArrayString(iaReturn) + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 6
        numTotalTests++;
        boolean bReturn = false;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            low = 0;
            high = 6;
            int[] testArray = {1, 2, 3, 4, 5, 6, 7};

            myArray4 = testArray;

            bReturn = myHW1.isSorted(myArray4, low, high);

            if (bReturn == true)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }

        System.out.println("Test " + numTotalTests + ": isSorted - " + testResult + "\n " + Arrays.toString(myArray4) + " low = " + low + ", high = " + high);
        System.out.println(" --------------\n Expected: true");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + bReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 7
        numTotalTests++;
        bReturn = false;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            low = 0;
            high = 6;
            int[] testArray = {1, 2, 3, 4, 4, 6, 7};

            myArray4 = testArray;

            bReturn = myHW1.isSorted(myArray4, low, high);

            if (bReturn == true)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }

        System.out.println("Test " + numTotalTests + ": isSorted - " + testResult + "\n " + Arrays.toString(myArray4) + " low = " + low + ", high = " + high);
        System.out.println(" --------------\n Expected: true");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + bReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 8
        numTotalTests++;
        bReturn = false;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            low = 0;
            high = 2;
            int[] testArray = {3, 2, 1, 4, 5, 6, 7};

            myArray4 = testArray;

            bReturn = myHW1.isSorted(myArray4, low, high);

            if (bReturn == false)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }

        System.out.println("Test " + numTotalTests + ": isSorted - " + testResult + "\n " + Arrays.toString(myArray4) + " low = " + low + ", high = " + high);
        System.out.println(" --------------\n Expected: false");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + bReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 9
        numTotalTests++;
        bReturn = false;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            low = 1;
            high = 4;
            int[] testArray = {3, 1, 4, 2, 5, 6, 7};

            myArray4 = testArray;

            bReturn = myHW1.isSorted(myArray4, low, high);

            if (bReturn == false)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }

        System.out.println("Test " + numTotalTests + ": isSorted - " + testResult + "\n " + Arrays.toString(myArray4) + " low = " + low + ", high = " + high);
        System.out.println(" --------------\n Expected: false");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + bReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 10
        numTotalTests++;
        bReturn = false;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            low = 3;
            high = 3;
            int[] testArray = {3, 2, 1, 4, 5, 6, 7};

            myArray4 = testArray;

            bReturn = myHW1.isSorted(myArray4, low, high);

            if (bReturn == true)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }

        System.out.println("Test " + numTotalTests + ": isSorted - " + testResult + "\n " + Arrays.toString(myArray4) + " low = " + low + ", high = " + high);
        System.out.println(" --------------\n Expected: true");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + bReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 11
        numTotalTests++;
        bReturn = false;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            low = 0;
            high = 0;
            int[] testArray = {3, 2, 1, 4, 5, 6, 7};

            myArray4 = testArray;

            bReturn = myHW1.isSorted(myArray4, low, high);

            if (bReturn == true)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }

        System.out.println("Test " + numTotalTests + ": isSorted - " + testResult + "\n " + Arrays.toString(myArray4) + " low = " + low + ", high = " + high);
        System.out.println(" --------------\n Expected: true");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + bReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 12
        numTotalTests++;
        bReturn = false;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            low = 3;
            high = 6;
            int[] testArray = {3, 2, 1, 4, 5, 6, 7};

            myArray4 = testArray;

            bReturn = myHW1.isSorted(myArray4, low, high);

            if (bReturn == true)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }

        System.out.println("Test " + numTotalTests + ": isSorted - " + testResult + "\n " + Arrays.toString(myArray4) + " low = " + low + ", high = " + high);
        System.out.println(" --------------\n Expected: true");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + bReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 13
        numTotalTests++;
        bReturn = false;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            low = 4;
            high = 7;
            int[] testArray = {3, 2, 1, 4, 5, 16, 7, 13};

            myArray4 = testArray;

            bReturn = myHW1.isSorted(myArray4, low, high);

            if (bReturn == false)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }

        System.out.println("Test " + numTotalTests + ": isSorted - " + testResult + "\n " + Arrays.toString(myArray4) + " low = " + low + ", high = " + high);
        System.out.println(" --------------\n Expected: false");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + bReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 14
        numTotalTests++;
        bReturn = false;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            low = 3;
            high = 6;
            int[] testArray = {3, 2, 1, 4, 5, 6, 17, 13};

            myArray4 = testArray;

            bReturn = myHW1.isSorted(myArray4, low, high);

            if (bReturn == true)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }

        System.out.println("Test " + numTotalTests + ": isSorted - " + testResult + "\n " + Arrays.toString(myArray4) + " low = " + low + ", high = " + high);
        System.out.println(" --------------\n Expected: true");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + bReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 15
        numTotalTests++;
        bReturn = false;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            low = 7;
            high = 7;
            int[] testArray = {3, 2, 1, 4, 5, 6, 17, 13};

            myArray4 = testArray;

            bReturn = myHW1.isSorted(myArray4, low, high);

            if (bReturn == true)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }

        System.out.println("Test " + numTotalTests + ": isSorted - " + testResult + "\n " + Arrays.toString(myArray4) + " low = " + low + ", high = " + high);
        System.out.println(" --------------\n Expected: true");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + bReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // declare and print out the array
        int[] myArray = {10, 15, 20, 8, 32, 6, 11, 3, 19, 12, 13};

        System.out.println("Tests 16 to 20 are based on the following array:");
        System.out.println(Arrays.toString(myArray) + "\n");

        // Test 16
        numTotalTests++;
        int iReturn = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            low = 0;
            high = 10;

            iReturn = myHW1.indexOfMax(myArray, low, high);

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

        System.out.println("Test " + numTotalTests + ": indexOfMax(low = " + low + ", high = " + high + ") - " + testResult);
        System.out.println(" Expected: 4");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + iReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 17
        numTotalTests++;
        iReturn = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            low = 5;
            high = 6;

            iReturn = myHW1.indexOfMax(myArray, low, high);

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

        System.out.println("Test " + numTotalTests + ": indexOfMax(low = " + low + ", high = " + high + ") - " + testResult);
        System.out.println(" Expected: 6");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + iReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 28
        numTotalTests++;
        iReturn = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            low = 7;
            high = 10;

            iReturn = myHW1.indexOfMax(myArray, low, high);

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

        System.out.println("Test " + numTotalTests + ": indexOfMax(low = " + low + ", high = " + high + ") - " + testResult);
        System.out.println(" Expected: 8");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + iReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 19
        numTotalTests++;
        iReturn = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            low = 6;
            high = 7;

            iReturn = myHW1.indexOfMax(myArray, low, high);

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

        System.out.println("Test " + numTotalTests + ": indexOfMax(low = " + low + ", high = " + high + ") - " + testResult);
        System.out.println(" Expected: 6");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + iReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 20
        numTotalTests++;
        iReturn = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            low = 10;
            high = 10;

            iReturn = myHW1.indexOfMax(myArray, low, high);

            if (iReturn == 10)
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

        System.out.println("Test " + numTotalTests + ": indexOfMax(low = " + low + ", high = " + high + ") - " + testResult);
        System.out.println(" Expected: 10");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + iReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");


        System.out.println("Total test cases: " + numTotalTests + "\nCorrect: " + numPassedTests + "\nWrong: " + (numTotalTests - numPassedTests));
    }

    public static String buildArrayString(int[][] numArray)
    {
        String arrString = "";

        for (int i = 0; i < numArray.length; i++)
        {
            for (int j = 0; j < numArray[i].length; j++)
                arrString += String.format("%4d", numArray[i][j]);

            arrString += "\n";
        }

        return arrString;
    }

    public static boolean compareArrays(int[][] numArray1, int[][] numArray2)
    {
        int row1 = numArray1.length;
        int row2 = numArray2.length;

        if (row1 < 1 || row2 < 1)
            return false;

        int col1 = numArray1[0].length;
        int col2 = numArray2[0].length;

        if (row1 != row2 || col1 != col2)
            return false;

        for (int i = 0; i < row1; i++)
            for (int j = 0; j < col1; j++)
                if (numArray1[i][j] != numArray2[i][j])
                    return false;

        return true;
    }
}
