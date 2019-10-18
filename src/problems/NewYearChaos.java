package problems;

public class NewYearChaos {
  public static void solution(int[] q) {
    int bride = 0;

    for ( int i = 0; i < q.length; i++ ) {
      if ( q[i] > (i+1)+2 ) {
        System.out.println("Too chaotic");
        return;
      }
    }

    for ( int i = 0; i < q.length; i++ ) {
      if ( q[i] == (i+1) ) continue; // 자신의 자리에 있거나
      for ( int j = i+1; j < q.length; j++ ) {
        if ( q[i] > q[j] ) {
          bride++;

          int temp = q[i];
          q[i] = q[j];
          q[j] = temp;

          if ( q[i] == (i+1) ) break;
        }
      }
    }
    System.out.println(bride);
  }

  public static void main(String[] args) {
    NewYearChaos.solution(new int[]{1, 2, 5, 3, 7, 8, 6, 4});
  }
}

