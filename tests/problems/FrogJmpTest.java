package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrogJmpTest {

  @Test
  void solution() {
    int answer = 142730189;
    assertEquals(new FrogJmp().solution(3, 999111321, 7), answer);
  }
}
