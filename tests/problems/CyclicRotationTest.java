package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CyclicRotationTest {

  @Test
  void solution() {
    CyclicRotation test = new CyclicRotation();
    test.solution(new int[]{3,8,9,7,6}, 3);
  }
}
