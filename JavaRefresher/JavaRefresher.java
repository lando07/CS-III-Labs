
// Landon Smith
import static java.lang.System.out;

import java.util.Random;

public class JavaRefresher {

    /**
     * Determine the Hamming distance between two arrays of ints.
     * Neither the parameter aData or
     * bData are altered as a result of this method.
     * 
     * @param aData != null, aData.length == aData.length
     * @param bData != null
     * @return the Hamming Distance between the two arrays of ints.
     */
    public static int hammingDistance(int[] aData, int[] bData) {
        // check preconditions
        if (aData == null || bData == null || aData.length != bData.length) {
            throw new IllegalArgumentException("Violation of precondition: " +
                    "hammingDistance. neither parameter may equal null, arrays" +
                    " must be equal length.");
        }

        // My Implementation
        int distance = 0;
        for (int i = 0; i < aData.length; i++) {
            if (aData[i] != bData[i])
                distance++;
        }
        return distance;
    }

    /**
     * Determine if one array of ints is a permutation of another.
     * Neither the parameter aData or
     * the parameter bData are altered as a result of this method.
     * 
     * @param aData != null
     * @param bData != null
     * @return true if aData is a permutation of bData,
     *         false otherwise
     * 
     */
    public static boolean isPermutation(int[] aData, int[] bData) {
        // check preconditions
        if (aData == null || bData == null) {
            throw new IllegalArgumentException("Violation of precondition: " +
                    "isPermutation. neither parameter may equal null.");
        }
        // My Implementation
        int[] tracker = { aData[0] };
        if (aData.length != bData.length)
            return false;
        for (int i = 0; i < aData.length; i++) {
            int currNum = aData[i];
            if (exists(currNum, tracker) && i != 0) {// will guarantee that if the first element is zero then it will
                                                     // still run the first time
                continue;
            }
            if (i != 0)
                addValToArray(currNum, tracker);
            int curraNumOccurences = 0;
            int currbNumOccurences = 0;
            for (int j = 0; j < aData.length; j++) {
                if (currNum == aData[j])
                    curraNumOccurences++;
                if (currNum == bData[j])
                    currbNumOccurences++;
            }
            if (curraNumOccurences != currbNumOccurences)
                return false;
        }
        return true;
    }

    private static boolean exists(int val, int[] arr) {
        for (int num : arr)
            if (num == val)
                return true;
        return false;
    }

    private static int[] addValToArray(int val, int[] arr) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[newArr.length - 1] = val;
        return newArr;
    }

    /**
     * Determine the index of the String that
     * has the largest number of vowels.
     * Vowels are defined as 'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o',
     * 'U', and 'u'.
     * The parameter arrayOfStrings is not altered as a result of this method.
     * pre: arrayOfStrings != null, arrayOfStrings.length > 0,
     * there is an least 1 non null element in arrayOfStrings.
     * post: return the index of the non-null element in arrayOfStrings that has the
     * largest number of characters that are vowels.
     * If there is a tie return the index closest to zero.
     * The empty String, "", has zero vowels.
     * It is possible for the maximum number of vowels to be 0.
     * 
     * @param arrayOfStrings the array to check
     * @return the index of the non-null element in arrayOfStrings that has
     *         the largest number of vowels.
     */
    public static int mostVowels(String[] arrayOfStrings) {
        // check preconditions
        if (arrayOfStrings == null || arrayOfStrings.length == 0 || !atLeastOneNonNull(arrayOfStrings)) {
            throw new IllegalArgumentException("Violation of precondition: " +
                    "mostVowels. parameter may not equal null and must contain " +
                    "at least one none null value.");
        }
        final String vowels = "AaEeIiOoUu";
        int mostVowelsIdx = 0;
        int mostVowels = 0;
        int i = 0;
        while (arrayOfStrings[i] == null) {
            i++;
            mostVowelsIdx++;
        }
        for (; i < arrayOfStrings.length; i++) {// i is already declared
            int currVowels = 0;
            String tmp = arrayOfStrings[i];
            if (tmp == null)
                continue;
            for (char c : tmp.toCharArray()) {
                if (vowels.indexOf(c) > -1)
                    currVowels++;
            }
            if (currVowels > mostVowels) {
                mostVowels = currVowels;
                mostVowelsIdx = i;
            }
        }

        return mostVowelsIdx;
    }

    /**
     * Perform an experiment simulating the birthday problem.
     * Pick random birthdays for the given number of people.
     * Return the number of pairs of people that share the
     * same birthday.
     * 
     * @param numPeople     The number of people in the experiment.
     *                      This value must be > 0
     * @param numDaysInYear The number of days in the year for this experiement.
     *                      This value must be > 0
     * @return The number of pairs of people that share a birthday
     *         after running the simulation.
     */
    public static int sharedBirthdays(int numPeople, int numDaysInYear) {
        // check preconditions
        if (numPeople <= 0 || numDaysInYear <= 0) {
            throw new IllegalArgumentException("Violation of precondition: " +
                    "sharedBirthdays. both parameters must be greater than 0. " +
                    "numPeople: " + numPeople +
                    ", numDaysInYear: " + numDaysInYear);
        }

        Random rand = new Random();
        int[] vals = new int[numDaysInYear];
        for (int i = 0; i < numPeople; i++) {
            vals[rand.nextInt(numDaysInYear)]++;
        }
        int pairs = 0;
        for (int num : vals) {
            if (num < 2)
                continue;
            for (int i = 1; i < num; i++) {
                pairs += i;
            }
        }

        return pairs;
    }

    /**
     * Determine if the chess board represented by board is a safe set up.
     * pre: board != null, board.length > 0, board is a square matrix.
     * (In other words all rows in board have board.length columns.),
     * all elements of board == 'q' or '.'. 'q's represent queens, '.'s
     * represent open spaces.
     * post: return true if the configuration of board is safe,
     * that is no queen can attack any other queen on the board.
     * false otherwise.
     * the parameter board is not altered as a result of
     * this method.
     * 
     * @param board the chessboard
     * @return true if the configuration of board is safe,
     *         that is no queen can attack any other queen on the board.
     *         false otherwise.
     */
    public static boolean queensAreSafe(char[][] board) {
        char[] validChars = { 'q', '.' };
        // check preconditions
        if (board == null || board.length == 0 || !isSquare(board)
                || !onlyContains(board, validChars)) {
            throw new IllegalArgumentException("Violation of precondition: " +
                    "queensAreSafe. The board may not be null, must be square, " +
                    "and may only contain 'q's and '.'s");
        }
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[r].length; c++) {
                if (board[r][c] == 'q') {
                    boolean v = checkVertical(r, c, board);
                    boolean h = checkHorizontal(r, c, board);
                    boolean dFU = checkDiagonalFUp(r, c, board);
                    boolean dFD = checkDiagonalFDn(r, c, board);
                    boolean dBD = checkDiagonalBkD(r, c, board);
                    boolean dBU = checkDiagonalBkU(r, c, board);
                    if (!(v && h && dFU && dFD && dBD && dBU))
                        return false;
                }
            }
        }
        return true;
    }

    private static boolean checkDiagonalFUp(int r, int c, char[][] board) {
        r--;
        c++;
        while (r > -1 && c < board[r].length) {
            if (board[r][c] == 'q')
                return false;
            r--;
            c++;
        }
        return true;
    }

    private static boolean checkDiagonalFDn(int r, int c, char[][] board) {
        r++;
        c++;
        while (r < board.length && c < board[r].length) {
            if (board[r][c] == 'q')
                return false;
            r++;
            c++;
        }
        return true;
    }

    private static boolean checkDiagonalBkU(int r, int c, char[][] board) {
        r--;
        c--;
        while (r > -1 && c > -1) {
            if (board[r][c] == 'q')
                return false;
            r--;
            c--;
        }
        return true;
    }

    private static boolean checkDiagonalBkD(int r, int c, char[][] board) {
        r++;
        c--;
        while (r < board.length && c > -1) {
            if (board[r][c] == 'q')
                return false;
            r++;
            c--;
        }
        return true;
    }

    private static boolean checkVertical(int r, int c, char[][] board) {
        for (int col = 0; col < board.length; col++) {
            if (col == c)
                continue;
            if (board[r][col] == 'q')
                return false;
        }
        return true;
    }

    private static boolean checkHorizontal(int r, int c, char[][] board) {
        for (int row = 0; row < board[r].length; row++) {
            if (row == r)
                continue;
            if (board[row][c] == 'q')
                return false;
        }
        return true;
    }

    // !!!!! ***** !!!!! ***** !!!!! ****** !!!!! ****** !!!!! ****** !!!!!!
    // Put your birthday problem experiment code here:
    public static void perfManyExp() {
        for (int j = 2; j <= 100; j++) {
            int count = 0;
            for (int i = 0; i < 50000; i++) {
                if (sharedBirthdays(j, 365) > 0)
                    count++;
            }
            out.println("Percentage of " + j + " people having atleast 1 pair of birthdays " + (count / 50000.0) * 100);

        }
    }

    // HELPER METHODS -- USED TO VALIDATE INPUTS FOR SOME OF THE METHODS
    // DO NOT MODIFY UNLESS INSTRUCTED

    /*
     * pre: arrayOfStrings != null
     * post: return true if at least one element in arrayOfStrings is
     * not null, otherwise return false.
     */
    private static boolean atLeastOneNonNull(String[] arrayOfStrings) {
        // check precondition
        if (arrayOfStrings == null) {
            throw new IllegalArgumentException("Violation of precondition: " +
                    "atLeastOneNonNull. parameter may not equal null.");
        }
        boolean foundNonNull = false;
        int i = 0;
        while (!foundNonNull && i < arrayOfStrings.length) {
            foundNonNull = arrayOfStrings[i] != null;
            i++;
        }
        return foundNonNull;
    }

    /*
     * pre: mat != null
     * post: return true if mat is a square matrix, false otherwise
     */
    private static boolean isSquare(char[][] mat) {
        if (mat == null) {
            throw new IllegalArgumentException("Violation of precondition: " +
                    "isSquare. Parameter may not be null.");
        }
        final int numRows = mat.length;
        int row = 0;
        boolean isSquare = true;
        while (isSquare && row < numRows) {
            isSquare = (mat[row] != null) && (mat[row].length == numRows);
            row++;
        }
        return isSquare;
    }

    /*
     * pre: mat != null, valid != null
     * post: return true if all elements in mat are one of the
     * characters in valid
     */
    private static boolean onlyContains(char[][] mat, char[] valid) {
        // check preconditions
        if (mat == null || valid == null) {
            throw new IllegalArgumentException("Violation of precondition: " +
                    "onlyContains. Parameters may not be null.");
        }
        String validChars = new String(valid);
        int row = 0;
        boolean onlyContainsValidChars = true;
        while (onlyContainsValidChars && row < mat.length) {
            int col = 0;
            while (onlyContainsValidChars && col < mat[row].length) {
                int indexOfChar = validChars.indexOf(mat[row][col]);
                onlyContainsValidChars = indexOfChar != -1;
                col++;
            }
            row++;
        }
        return onlyContainsValidChars;
    }

    /*
     * pre: mat != null, mat.length > 0
     * post: return true if mat is rectangular
     */
    private static boolean isRectangular(int[][] mat) {
        // check preconditions
        if (mat == null || mat.length == 0) {
            throw new IllegalArgumentException("Violation of precondition: " +
                    "isRectangular. Parameter may not be null and must contain" +
                    " at least one row.");
        }
        boolean correct = mat[0] != null;
        int row = 0;
        while (correct && row < mat.length) {
            correct = (mat[row] != null)
                    && (mat[row].length == mat[0].length);
            row++;
        }
        return correct;
    }

    // make constructor private so no instances of JavaRefresher can be created
    private JavaRefresher() {

    }
}
