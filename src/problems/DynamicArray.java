package problems;

import java.util.ArrayList;
import java.util.List;

public class DynamicArray {
  public static List<Integer> solution(int n, List<List<Integer>> queries) {
    List<List<Integer>> seqList = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      seqList.add(new ArrayList<>());
    }

    List<Integer> lastAnswers = new ArrayList<>();

    int lastAnswer = 0;
    for (List<Integer> query : queries) {
      int type = query.get(0);
      int x = query.get(1);
      int y = query.get(2);

      if (type == 1) {
        seqList.get((x ^ lastAnswer) % n).add(y);
      } else { // type 2
        List<Integer> list = seqList.get((x ^ lastAnswer) % n);
        lastAnswer = list.get(y % list.size());
        lastAnswers.add(lastAnswer);
        System.out.println(lastAnswer);
      }
    }

    return lastAnswers;
  }

  public static void main(String args[]) {
     List<List<Integer>> queries = new ArrayList<>();
     queries.add(new ArrayList<Integer>(){{
       add(1);
       add(0);
       add(5);
     }});
     queries.add(new ArrayList<Integer>(){{
       add(1);
       add(1);
       add(7);
     }});
     queries.add(new ArrayList<Integer>(){{
       add(1);
       add(0);
       add(3);
     }});
     queries.add(new ArrayList<Integer>(){{
       add(2);
       add(1);
       add(0);
     }});
     queries.add(new ArrayList<Integer>(){{
       add(2);
       add(1);
       add(1);
     }});

     DynamicArray.solution(2, queries);
  }
}
