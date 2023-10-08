package lab_1;

import java.util.Arrays;

public class Matrix {

  private final int[][] matrix;

  private int[][] expectedMatrix;

  public Matrix(int rowSize, int columnSize, int[] rowsValues) {
    this.matrix = new int[rowSize][columnSize];

    fillRows(rowsValues);
  }

  public void fillRows(int[] values) {
    for (int[] rowArray : matrix) {
      System.arraycopy(values, 0, rowArray, 0, rowArray.length);
    }
  }

  // метод у которого вычисляем цикломатическую сложность
  public void algorithmToSumNegativeNumbers() {
    for (int[] rowArray : matrix) {
      for (int index = 1; index < rowArray.length; index++) {
        if (isNegative(rowArray[0])) {
          rowArray[0] = sumCurrentNumWithPreviousNum(rowArray[0], rowArray[index- 1]);
        }
        if (isNegative(rowArray[index])) {
          rowArray[index] = sumCurrentNumWithPreviousNum(rowArray[index], rowArray[index - 1]);
        }
      }
    }
  }

  private boolean isNegative(int num) {
    return num < 0;
  }

  private int sumCurrentNumWithPreviousNum(int currentNum, int previousNum) {
    return currentNum + previousNum;
  }

  public void setExpectedMatrix(int[][] expectedMatrix) {
    this.expectedMatrix = expectedMatrix;
  }

  public int[][] getExpectedMatrix() {
    return expectedMatrix;
  }

  public int[][] getMatrix() {
    return matrix;
  }
}
