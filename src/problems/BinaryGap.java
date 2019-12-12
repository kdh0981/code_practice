package problems;

public class BinaryGap {
  public static int solution(int N) {
    String binaryString = Integer.toBinaryString(N);
//    System.out.println(binaryString);

    char[] binarys = binaryString.toCharArray();

    int start = -1;
    int end = -1;
    int gap = 0;
    for (int i = 0; i < binarys.length; i++) {
      if ( binarys[i] == '1' ) {
        if ( start != -1 ) {
          end = i;

          if ( gap < end-start-1 ) {
            gap = end - start -1;
          }

          start = end;
          end = -1;
        } else {
          start = i;
        }
      }
    }

    return gap;
  }

  public static void main(String args[]) {
    System.out.println(solution(328));
  }
}
