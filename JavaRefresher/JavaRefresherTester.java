import java.util.List;
import java.util.Random;

/*
 * Problem 4.1: The avg pairs of people with shared birthdays are 45
 * Problem 4.2: I think 30 people
 * Problem 4.3: It took 23 people for there to be a 50% chance of 2 people sharing the same birthday
 * Percentage of 2 people having atleast 1 pair of birthdays 0.264
Percentage of 3 people having atleast 1 pair of birthdays 0.732
Percentage of 4 people having atleast 1 pair of birthdays 1.752
Percentage of 5 people having atleast 1 pair of birthdays 2.606
Percentage of 6 people having atleast 1 pair of birthdays 3.9739999999999998
Percentage of 7 people having atleast 1 pair of birthdays 5.466
Percentage of 8 people having atleast 1 pair of birthdays 7.692
Percentage of 9 people having atleast 1 pair of birthdays 9.468
Percentage of 10 people having atleast 1 pair of birthdays 11.836
Percentage of 11 people having atleast 1 pair of birthdays 14.074
Percentage of 12 people having atleast 1 pair of birthdays 16.826
Percentage of 13 people having atleast 1 pair of birthdays 19.548
Percentage of 14 people having atleast 1 pair of birthdays 22.486
Percentage of 15 people having atleast 1 pair of birthdays 25.16
Percentage of 16 people having atleast 1 pair of birthdays 28.424
Percentage of 17 people having atleast 1 pair of birthdays 31.752000000000002
Percentage of 18 people having atleast 1 pair of birthdays 34.166000000000004
Percentage of 19 people having atleast 1 pair of birthdays 37.814
Percentage of 20 people having atleast 1 pair of birthdays 41.126000000000005
Percentage of 21 people having atleast 1 pair of birthdays 44.016
Percentage of 22 people having atleast 1 pair of birthdays 47.896
Percentage of 23 people having atleast 1 pair of birthdays 50.727999999999994
Percentage of 24 people having atleast 1 pair of birthdays 53.717999999999996
Percentage of 25 people having atleast 1 pair of birthdays 57.038
Percentage of 26 people having atleast 1 pair of birthdays 59.650000000000006
Percentage of 27 people having atleast 1 pair of birthdays 62.727999999999994
Percentage of 28 people having atleast 1 pair of birthdays 65.27
Percentage of 29 people having atleast 1 pair of birthdays 68.098
Percentage of 30 people having atleast 1 pair of birthdays 70.56400000000001
Percentage of 31 people having atleast 1 pair of birthdays 72.964
Percentage of 32 people having atleast 1 pair of birthdays 75.40599999999999
Percentage of 33 people having atleast 1 pair of birthdays 77.23400000000001
Percentage of 34 people having atleast 1 pair of birthdays 79.766
Percentage of 35 people having atleast 1 pair of birthdays 81.27600000000001
Percentage of 36 people having atleast 1 pair of birthdays 83.134
Percentage of 37 people having atleast 1 pair of birthdays 85.168
Percentage of 38 people having atleast 1 pair of birthdays 86.406
Percentage of 39 people having atleast 1 pair of birthdays 87.558
Percentage of 40 people having atleast 1 pair of birthdays 89.044
Percentage of 41 people having atleast 1 pair of birthdays 90.39
Percentage of 42 people having atleast 1 pair of birthdays 91.56800000000001
Percentage of 43 people having atleast 1 pair of birthdays 92.522
Percentage of 44 people having atleast 1 pair of birthdays 93.316
Percentage of 45 people having atleast 1 pair of birthdays 94.052
Percentage of 46 people having atleast 1 pair of birthdays 94.696
Percentage of 47 people having atleast 1 pair of birthdays 95.49600000000001
Percentage of 48 people having atleast 1 pair of birthdays 96.16
Percentage of 49 people having atleast 1 pair of birthdays 96.61800000000001
Percentage of 50 people having atleast 1 pair of birthdays 97.09400000000001
Percentage of 51 people having atleast 1 pair of birthdays 97.454
Percentage of 52 people having atleast 1 pair of birthdays 97.802
Percentage of 53 people having atleast 1 pair of birthdays 98.176
Percentage of 54 people having atleast 1 pair of birthdays 98.418
Percentage of 55 people having atleast 1 pair of birthdays 98.52199999999999
Percentage of 56 people having atleast 1 pair of birthdays 98.846
Percentage of 57 people having atleast 1 pair of birthdays 99.042
Percentage of 58 people having atleast 1 pair of birthdays 99.13
Percentage of 59 people having atleast 1 pair of birthdays 99.318
Percentage of 60 people having atleast 1 pair of birthdays 99.378
Percentage of 61 people having atleast 1 pair of birthdays 99.496
Percentage of 62 people having atleast 1 pair of birthdays 99.602
Percentage of 63 people having atleast 1 pair of birthdays 99.626
Percentage of 64 people having atleast 1 pair of birthdays 99.70400000000001
Percentage of 65 people having atleast 1 pair of birthdays 99.764
Percentage of 66 people having atleast 1 pair of birthdays 99.78399999999999
Percentage of 67 people having atleast 1 pair of birthdays 99.848
Percentage of 68 people having atleast 1 pair of birthdays 99.87
Percentage of 69 people having atleast 1 pair of birthdays 99.914
Percentage of 70 people having atleast 1 pair of birthdays 99.922
Percentage of 71 people having atleast 1 pair of birthdays 99.928
Percentage of 72 people having atleast 1 pair of birthdays 99.908
Percentage of 73 people having atleast 1 pair of birthdays 99.966
Percentage of 74 people having atleast 1 pair of birthdays 99.968
Percentage of 75 people having atleast 1 pair of birthdays 99.97200000000001
Percentage of 76 people having atleast 1 pair of birthdays 99.97200000000001
Percentage of 77 people having atleast 1 pair of birthdays 99.98599999999999
Percentage of 78 people having atleast 1 pair of birthdays 99.99
Percentage of 79 people having atleast 1 pair of birthdays 99.98
Percentage of 80 people having atleast 1 pair of birthdays 99.988
Percentage of 81 people having atleast 1 pair of birthdays 99.992
Percentage of 82 people having atleast 1 pair of birthdays 99.998
Percentage of 83 people having atleast 1 pair of birthdays 99.998
Percentage of 84 people having atleast 1 pair of birthdays 100.0
Percentage of 85 people having atleast 1 pair of birthdays 99.998
Percentage of 86 people having atleast 1 pair of birthdays 100.0
Percentage of 87 people having atleast 1 pair of birthdays 100.0
Percentage of 88 people having atleast 1 pair of birthdays 99.994
Percentage of 89 people having atleast 1 pair of birthdays 100.0
Percentage of 90 people having atleast 1 pair of birthdays 100.0
Percentage of 91 people having atleast 1 pair of birthdays 100.0
Percentage of 92 people having atleast 1 pair of birthdays 99.998
Percentage of 93 people having atleast 1 pair of birthdays 100.0
Percentage of 94 people having atleast 1 pair of birthdays 100.0
Percentage of 95 people having atleast 1 pair of birthdays 99.998
Percentage of 96 people having atleast 1 pair of birthdays 100.0
Percentage of 97 people having atleast 1 pair of birthdays 100.0
Percentage of 98 people having atleast 1 pair of birthdays 100.0
Percentage of 99 people having atleast 1 pair of birthdays 100.0
Percentage of 100 people having atleast 1 pair of birthdays 100.0
 */

public class JavaRefresherTester {
    public static void main(String[] args) {
        final String newline = System.getProperty("line.separator");

        // test 1, hamming distance
        int[] h1 = { 1, 2, 3, 4, 5, 4, 3, 2, 1 };
        int[] h2 = { 2, 6, 10, 4, 9, 4, 3, -1, 1 };
        int expected = 5;
        int actual = JavaRefresher.hammingDistance(h1, h2);
        System.out.println("Test 1 hamming distance: expected value: " + expected
                + ", actual value: " + actual);
        if (expected == actual) {
            System.out.println(" passed test 1, hamming distance");
        } else {
            System.out.println(" ***** FAILED ***** test 1, hamming distance");
        }

        // test 2, hamming distance
        h1 = new int[500000];
        h2 = new int[500000];
        Random rand = new Random();
        h1[rand.nextInt(500000)] = 5;
        expected = 1;
        actual = JavaRefresher.hammingDistance(h1, h2);
        System.out.println(newline + "Test 3 hamming distance: expected value: " + expected
                + ", actual value: " + actual);
        if (expected == actual) {
            System.out.println(" passed test 3, hamming distance");
        } else {
            System.out.println(" ***** FAILED ***** test 3, hamming distance");
        }

        // test 3, isPermutation
        int[] a = { 5, 7, 6 };
        int[] b = { 6, 5, 7 };
        boolean expectedBool = true;
        boolean actualBool = JavaRefresher.isPermutation(a, b);
        System.out.println(newline + "Test 4 isPermutation: expected value: " + expectedBool
                + ", actual value: " + actualBool);
        if (expectedBool == actualBool) {
            System.out.println(" passed test 4, isPermutation");
        } else {
            System.out.println(" ***** FAILED ***** test 4, isPermutation");
        }

        // test 4, not Permutation
        a = new int[] { -180997325, 1320698025 };
        b = new int[] { 1320698025, -180987325 };
        expectedBool = false;
        actualBool = JavaRefresher.isPermutation(a, b);
        System.out.println(newline + "Test 7 isPermutation: expected value: " + expectedBool
                + ", actual value: " + actualBool);
        if (expectedBool == actualBool) {
            System.out.println(" passed test 7, isPermutation");
        } else {
            System.out.println(" ***** FAILED ***** test 7, isPermutation");
        }

        // test 5, mostVowels
        String[] arrayOfStrings = { "q9eruubhqepurg", "uoaeyyyyi", "sodihfaaaaajkdsiiiiiiiii" };
        int expectedResult = 3;
        int actualResult = JavaRefresher.mostVowels(arrayOfStrings);
        System.out.println(newline + "Test 15 mostVowels: expected result: " + expectedResult
                + ", actual result: " + actualResult);
        if (actualResult == expectedResult) {
            System.out.println("passed test 15, mostVowels");
        } else {
            System.out.println("***** FAILED ***** test 15, mostVowels");
        }

        // test 6, mostVowels
        arrayOfStrings = new String[] { "Going", "YeElOwStOnE NAtIOnAl FOrEst", "", "true", null,
                "!!!!>>+_)(*&^%$#@!>)))???\\///\n\n/n" };
        expectedResult = 1;
        actualResult = JavaRefresher.mostVowels(arrayOfStrings);
        System.out.println(newline + "Test 16 mostVowels: expected result: " + expectedResult
                + ", actual result: " + actualResult);
        if (actualResult == expectedResult) {
            System.out.println("passed test 16, mostVowels");
        } else {
            System.out.println("***** FAILED ***** test 16, mostVowels");
        }

        // test 7, sharedBirthdays, simple test
        int pairs = JavaRefresher.sharedBirthdays(1, 1);
        System.out.println(newline + "Test 21 shared birthdays: expected: 0, actual: " + pairs);
        int expectedShared = 0;
        if (pairs == expectedShared) {
            System.out.println("passed test 21, shared birthdays");
        } else {
            System.out.println("***** FAILED ***** test 21, shared birthdays");
        }

        // test 8, sharedBirthdays, stress test
        pairs = JavaRefresher.sharedBirthdays(512659781, 196);
        System.out.println(
                newline + "Test 28 shared birthdays - stress test. (Is solution slow?) : expected: > 0"
                        + ", actual: " + pairs);
        if (pairs > 0) {
            System.out.println("passed test 28, shared birthdays");
        } else {
            System.out.println("***** FAILED ***** test 28, shared birthdays. "
                    + "Expected at least 1 pair. Value returned: " + pairs);
        }

        // test 9, queensAreASafe
        char[][] board = { { 'q', '.', '.' },
                { '.', '.', 'q' },
                { '.', '.', '.' } };

        expectedBool = true;
        actualBool = JavaRefresher.queensAreSafe(board);
        System.out.println(newline + "Test 30 queensAreSafe: expected value: " + expectedBool
                + ", actual value: " + actualBool);
        if (expectedBool == actualBool) {
            System.out.println(" passed test 30, queensAreSafe");
        } else {
            System.out.println(" ***** FAILED ***** test 30, queensAreSafe");
        }

        // test 10, queensAreASafe
        board = new char[][] {
                { 'q', '.', '.', '.', '.', '.', '.', '.', '.', 'q' },
                { '.', '.', '.', '.', 'q', '.', '.', 'q', '.', '.' },
                { '.', '.', '.', '.', '.', '.', '.', '.', '.', '.' },
                { '.', '.', '.', '.', '.', '.', '.', '.', 'q', '.' },
                { '.', '.', 'q', '.', '.', '.', '.', '.', '.', '.' },
                { '.', '.', '.', '.', 'q', '.', 'q', '.', '.', '.' },
                { '.', '.', '.', 'q', '.', '.', '.', '.', '.', '.' },
                { '.', '.', '.', '.', '.', 'q', '.', '.', '.', '.' },
                { '.', '.', '.', '.', '.', '.', '.', '.', '.', '.' },
                { '.', '.', '.', '.', 'q', '.', '.', '.', 'q', '.' }, };
        expectedBool = false;
        actualBool = JavaRefresher.queensAreSafe(board);
        System.out.println(newline + "Test 33 queensAreSafe: expected value: " + expectedBool
                + ", actual value: " + actualBool);
        if (expectedBool == actualBool) {
            System.out.println(" passed test 33, queensAreSafe");
        } else {
            System.out.println(" ***** FAILED ***** test 33, queensAreSafe");
        }
    } // end of main method

    // pre: list != null
    private static int[] intListToArray(List<Integer> list) {
        if (list == null) {
            throw new IllegalArgumentException("list parameter may not be null.");
        }
        int[] result = new int[list.size()];
        int arrayIndex = 0;
        for (int x : list) {
            result[arrayIndex++] = x;
        }
        return result;
    }
}
