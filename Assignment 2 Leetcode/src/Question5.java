import java.util.ArrayList;
import java.util.List;

public class Question5 { //Spiral Matrix

        public List<Integer> spiralOrder(int[][] matrix) {
            int VISITED = 101;
            int rows = matrix.length;
            int columns = matrix[0].length;
            int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
            int currentDirection = 0;
            int changeDirection = 0;

            int row = 0;
            int col = 0;

            List<Integer> result = new ArrayList<>();
            result.add(matrix[0][0]);
            matrix[0][0] = VISITED;
            while (changeDirection < 2) {
                while (row + directions[currentDirection][0] >= 0 &&
                        row + directions[currentDirection][0] < rows &&
                        col + directions[currentDirection][1] >= 0 &&
                        col + directions[currentDirection][1] < columns &&
                        matrix[row + directions[currentDirection][0]]
                                [col + directions[currentDirection][1]] != VISITED) {

                    changeDirection = 0;

                    row = row + directions[currentDirection][0];
                    col = col + directions[currentDirection][1];
                    result.add(matrix[row][col]);
                    matrix[row][col] = VISITED;
                }

                currentDirection = (currentDirection + 1) % 4;

                changeDirection++;
            }
            return result;
        }
    }