import java.util.Arrays;

public class L2023140022_19_Test extends Solution19 {


    public static void main(String[] args) {


        /**
         * 测试用例设计的总体原则：
         * 1. 等价类划分原则：将输入的可能情况划分为有效等价类和无效等价类，分别测试。
         * 2. 边界值分析：特别关注数组的边缘和角落情况。
         * 3. 特殊情况测试：比如空数组或者单个元素的数组。
         * 4. 正常情况测试：测试普通的游戏进展。
         */


        /**
         * 测试方法目的：验证单元素游戏板的行为
         * 测试用例：单元素数组
         */


        int[][] board1 = {{1}};
        int[][] expected1 = {{0}};
        Solution19.gameOfLife(board1);
        if (isEqual(board1, expected1)) {
            System.out.println("PASS");
        }


        /**
         * 测试方法目的：验证正常游戏进展
         * 测试用例：具有多个活细胞和死细胞的标准游戏板
         */


        int[][] board2 = {{0, 1, 0}, {0, 0, 1}, {1, 1, 1}, {0, 0, 0}};
        int[][] expected2 = {{0, 0, 0}, {1, 0, 1}, {0, 1, 1}, {0, 1, 0}};
        Solution19.gameOfLife(board2);
        if (isEqual(board2, expected2)) {
            System.out.println("PASS");
        }


        /**
         * 测试方法目的：验证边界情况的处理
         * 测试用例：边缘细胞的活动情况
         */


        int[][] board3 = {{1, 1}, {1, 0}};
        int[][] expected3 = {{1, 1}, {1, 1}};
        Solution19.gameOfLife(board3);
        if (isEqual(board3, expected3)) {
            System.out.println("PASS");
        }



        /**
         * 测试方法目的：验证超大型矩阵计算
         * 测试用例：10*10的矩阵
         */




        int[][] board4 = {{1, 0, 1, 0, 1, 0, 0, 1, 0, 1
        },{0, 1, 0, 1, 0, 1, 1, 0, 1, 1
        },{1, 0, 1, 0, 1, 0, 1, 0, 1, 0
        },{0, 1, 0, 1, 1, 0, 0, 1, 0, 1
        },{1, 0, 1, 0, 0, 1, 1, 0, 1, 0
        },{0, 1, 0, 1, 0, 1, 0, 1, 0, 1
        },{1, 0, 1, 0, 1, 0, 1, 0, 1, 0
        },{0, 1, 0, 1, 0, 1, 1, 0, 1, 1
        },{1, 0, 1, 0, 1, 0, 0, 1, 0, 1
        },{0, 1, 0, 1, 0, 1, 1, 0, 1, 0}};
        int[][] expected4 = {{0, 1, 1, 1, 1, 1, 1, 1, 0, 1},
                {1, 0, 0, 0, 0, 0, 1, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 1, 0, 0, 0},
                {1, 0, 0, 0, 1, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 1, 0, 0, 0, 1},
                {1, 0, 0, 1, 0, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 1, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {0, 1, 1, 1, 1, 1, 1, 1, 1, 0}};
        Solution19.gameOfLife(board4);
        if (isEqual(board4, expected4)) {
            System.out.println("PASS");
        }


    }



    public static boolean isEqual(int[][] array1, int[][] array2)
    {
        boolean isEqual = true;
        if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {
                if (!Arrays.equals(array1[i], array2[i])) {
                    isEqual = false;
                    break;
                }
            }
        } else {
            isEqual = false;
        }
        return isEqual;
    }

    // 其他测试用例可以根据需要添加，例如测试特定模式、更大的游戏板等。
}
