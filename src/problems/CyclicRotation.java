package problems;

public class CyclicRotation {
  public int[] solution(int[] A, int K) {
    // write your code in Java SE 8
    printArr(A);
    int lastIdx = A.length-1;
    int[] result = new int[A.length];

    if ( A.length != 0 && K % A.length != 0 ) {
      K = K % A.length;
      for (int i = 0; i < A.length; i++) {
        int changeIdx = -1;
        if ( i+K <= lastIdx ) {
          changeIdx = i+K;
        } else {
          changeIdx = i+K-A.length;
        }

        result[changeIdx] = A[i];
      }
    } else {
      result = A;
    }

    printArr(result);
    return result;
  }

  public void printArr(int[] A) {
    System.out.print("[");
    for (int i = 0; i < A.length; i++) {
      System.out.print(A[i]);
      if ( i != A.length-1 ) {
        System.out.print(",");
      }
    }
    System.out.println("]");
  }
}
