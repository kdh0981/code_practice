package problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SockMerchant {
    public static int solution(int n, int[] ar) {
        Map<Integer, Boolean> existSocks = new HashMap<>();
        int pairCnt = 0;

        for (int i = 0; i < ar.length; i++) {
            int value = ar[i];
            if ( existSocks.get(value) == null ) {
                existSocks.put(value, true);
                int socksCnt = ((Long) Arrays.stream(ar).filter(one -> one == value).count()).intValue();
                pairCnt += socksCnt % 2 == 0? socksCnt/2 : (socksCnt-1)/2;
            }
        }
        return pairCnt;
    }

    public static void main(String[] args) {
        System.out.println(SockMerchant.solution(9, new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20}));
    }
}
