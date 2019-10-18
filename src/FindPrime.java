public class FindPrime {
  public static int solution(int n) {
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

    return answer;
  }

  public static void main(String args[]) {
      System.out.println(new FindPrime().solution(100));
  }
}
