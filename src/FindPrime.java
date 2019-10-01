public class FindPrime {
  public int solution(int n) {
    long start = System.currentTimeMillis();
    int answer = 0;

    for ( int i = 2; i <= n; i++ ) {
      boolean isPrime = true;

      for ( int j = 2; j < i; j++ ) {
        if ( i != j && i % j == 0 ) {
          isPrime = false;
          break;
        }
      }

      if ( isPrime ) answer++;
    }

    long end = System.currentTimeMillis();
    System.out.println("time:::" + (end - start) + "ms");
    return answer;
  }
}
