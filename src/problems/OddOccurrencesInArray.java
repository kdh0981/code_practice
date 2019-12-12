package problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray {
  public int solution(int[] A) {
    // write your code in Java SE 8
    Map<Integer, Integer> numberMap = new HashMap<>();
    for (int i = 0; i < A.length; i++) {
      if ( numberMap.get(A[i]) != null ) {
        numberMap.put(A[i], numberMap.get(A[i])+1);
      } else {
        numberMap.put(A[i], 1);
      }
    }

    int nonPair = -1;
    for (Integer num : numberMap.keySet()) {
      if ( numberMap.get(num) % 2 == 1 ) {
        nonPair = num;
        break;
      }
    }
    return nonPair;
  }
}
