package lab_1;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MatrixAlgorithmTest {

  @Test
  void Should_Sum_With_Only_Negative_Numbers() {
    Matrix matrix = new Matrix(4, 4, new int[]{-1, -1, 2, 5});
    matrix.setExpectedMatrix(new int[][]{
        {4, 3, 2, 5},
        {4, 3, 2, 5},
        {4, 3, 2, 5},
        {4, 3, 2, 5}
    });

    matrix.algorithmToSumNegativeNumbers();

    Assertions.assertArrayEquals(matrix.getMatrix(), matrix.getExpectedMatrix());
  }

  @Test
  void Should_Not_Sum_With_Only_Positive_Numbers() {
    Matrix matrix = new Matrix(2, 2, new int[]{1, 1});
    matrix.setExpectedMatrix(new int[][]{{1, 1}, {1, 1}});

    matrix.algorithmToSumNegativeNumbers();

    Assertions.assertArrayEquals(matrix.getMatrix(), matrix.getExpectedMatrix());
  }

  @Test
  void Should_Sum_With_Second_Negative_Number() {
    Matrix matrix = new Matrix(2, 2, new int[]{1, -1});
    matrix.setExpectedMatrix(new int[][]{{1, 0}, {1, 0}});

    matrix.algorithmToSumNegativeNumbers();

    Assertions.assertArrayEquals(matrix.getMatrix(), matrix.getExpectedMatrix());
  }
}