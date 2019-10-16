package problems;

import java.util.HashMap;
import java.util.Map;

public class Marathon {
  static String solution(String[] participant, String[] completion) {
    Map<String, Integer> partMap = new HashMap<>();
    for (String s : participant) {
      if ( partMap.get(s) == null ) {
        partMap.put(s, 1);
      } else {
        int cnt = partMap.get(s) + 1;
        partMap.put(s, cnt);
      }
    }

    for (String comp : completion) {
      int cnt = partMap.get(comp)-1;
      partMap.put(comp, cnt);

      if ( partMap.get(comp) == 0 ) {
        partMap.remove(comp);
      }
    }
    return partMap.keySet().iterator().next();
  }
}
