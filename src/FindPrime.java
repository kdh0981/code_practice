import java.util.ArrayList;
import java.util.List;

public class FindPrime {
  public int solution(int n) {
    List<Boolean> isPrimeList = new ArrayList<>();

    // 0, 1 은 소수가 아님
    isPrimeList.add(false);
    isPrimeList.add(false);

    for ( int i = 2; i <= n; i++ ) {
      // 에라토스테네스의 체 생성
      isPrimeList.add(true);
    }

    for ( int i = 2; i <= n; i++ ) {
      int j = 2;
      while (i * j <= n) {
        if ( isPrimeList.get(i*j) ) { // 효율성 point: 앞의 배수로 처리된 것은 다시 처리하지 않는다.
          isPrimeList.set(i * j, false);
        }
        j++;
      }
    }

    return  ((Long)isPrimeList.stream().filter(isPrime -> isPrime).count()).intValue();
  }
}
