package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddOccurrencesInArrayTest {

  @Test
  void solution() {
    OddOccurrencesInArray test = new OddOccurrencesInArray();
    int answer = test.solution(new int[]{9,3,9,3,9,7,9});
    assertEquals(7, answer);
  }

  @Test
  void xorTest() {
    int res = 3;
    System.out.println(res ^= 3);
  }
}
