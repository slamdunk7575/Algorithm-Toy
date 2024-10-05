package me.algo.datastructure.array;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public List<Integer> solve(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return result;
        }

        int rowStart = 0;
        int rowEnd = matrix.length - 1;
        int colStart = 0;
        int colEnd = matrix[0].length - 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            // right
            for (int i = colStart; i <= colEnd; i++) {
                result.add(matrix[rowStart][i]);
            }
            rowStart++;

            // down
            for (int i = rowStart; i <= rowEnd; i++) {
                result.add(matrix[i][colEnd]);
            }
            colEnd--;

            // left
            System.out.println("rowStart: " + rowStart + " rowEnd: " + rowEnd);
            // 위의 while()문 조건식에서 검사하고 있는데
            // left, up 부분의 if 조건문을 추가로 넣어주는 이유?
            // while 안에서 (예: rowStart++) 를 하면서 rowStart >= rowEnd 가 되는 순간이 발생하기 때문
            if (rowStart <= rowEnd) {
                for (int i = colEnd; i >= colStart; i--) {
                    result.add(matrix[rowEnd][i]);
                }
            }
            rowEnd--;

            // up
            System.out.println("colStart: " + colStart + " colEnd: " + colEnd);
            if (colStart <= colEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    result.add(matrix[i][colStart]);
                }
            }
            colStart++;
        }

        return result;
    }

}
