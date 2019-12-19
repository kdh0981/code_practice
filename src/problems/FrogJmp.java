package problems;

public class FrogJmp {
  public int solution(int X, int Y, int D) {
    // write your code in Java SE 8
    // X >= Y 인 포지션 찾기, D 점프거리
    // 단순접근 X += D 를 X >= Y 일 때 까지 반복 (Timeout -> max input 1,000,000,000)
    // 해결책 -> (Y-X)/D 한 값이 최소 회수가 된다. (소수점이 있을 경우에는 올림)
    return Double.valueOf(Math.ceil((double)((Y-X)/D))).intValue();
  }
}
