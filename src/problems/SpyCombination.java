package problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SpyCombination {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, List<String>> clothMap = new HashMap<>();
        for (String[] cloth : clothes) { // 종류별 옷 정리
            List<String> clothList = clothMap.getOrDefault(cloth[1], new ArrayList<>());
            clothList.add(cloth[0]);
            clothMap.put(cloth[1], clothList);
        }
//        System.out.println(clothMap);

        for (String category : clothMap.keySet()) { // 경우의 수 계산 (모든 카테고리의 곱)
            answer *= clothMap.get(category).size() + 1; // 안 입는 경우를 포함 (+1)
        }

//        System.out.println(answer - 1);
        return answer - 1; // 모두 안입는 경우 제외
    }
}
