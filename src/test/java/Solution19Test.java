import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Solution19Test {

    //hello!try to pass this?HAHAHA???LLLLL REALyy??
    @Test
    public void testSingleElementBoard() {
        int[][] board = {{1}};
        int[][] expected = {{0}};
        Solution19.gameOfLife(board);
        assertTrue(isEqual(board, expected));
    }

    @Test
    public void testStandardGameProgress() {
        int[][] board = {{0, 1, 0}, {0, 0, 1}, {1, 1, 1}, {0, 0, 0}};
        int[][] expected = {{0, 0, 0}, {1, 0, 1}, {0, 1, 1}, {0, 1, 0}};
        Solution19.gameOfLife(board);
        assertTrue(isEqual(board, expected));
    }

    @Test
    public void testBoundaryCells() {
        int[][] board = {{1, 1}, {1, 0}};
        int[][] expected = {{1, 1}, {1, 1}};
        Solution19.gameOfLife(board);
        assertTrue(isEqual(board, expected));
    }

    @Test
    public void testLargeMatrix() {
        int[][] board = {
                {1, 0, 1, 0, 1, 0, 0, 1, 0, 1},
                {0, 1, 0, 1, 0, 1, 1, 0, 1, 1},
                {1, 0, 1, 0, 1, 0, 1, 0, 1, 0},
                {0, 1, 0, 1, 1, 0, 0, 1, 0, 1},
                {1, 0, 1, 0, 0, 1, 1, 0, 1, 0},
                {0, 1, 0, 1, 0, 1, 0, 1, 0, 1},
                {1, 0, 1, 0, 1, 0, 1, 0, 1, 0},
                {0, 1, 0, 1, 0, 1, 1, 0, 1, 1},
                {1, 0, 1, 0, 1, 0, 0, 1, 0, 1},
                {0, 1, 0, 1, 0, 1, 1, 0, 1, 0}
        };
        int[][] expected = {
                {0, 1, 1, 1, 1, 1, 1, 1, 0, 1},
                {1, 0, 0, 0, 0, 0, 1, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 1, 0, 0, 0},
                {1, 0, 0, 0, 1, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 1, 0, 0, 0, 1},
                {1, 0, 0, 1, 0, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 1, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {0, 1, 1, 1, 1, 1, 1, 1, 1, 0}
        };
        Solution19.gameOfLife(board);
        assertTrue(isEqual(board, expected));
    }

    private static boolean isEqual(int[][] array1, int[][] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (!Arrays.equals(array1[i], array2[i])) {
                return false;
            }
        }

        return true;
    }
}