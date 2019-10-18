import java.util.Arrays;

public class AddressBook {
  public static boolean solution(String[] phone_book) {
    boolean answer = true;

    for (String phone : phone_book ) {
      if (Arrays.stream(phone_book).filter(
        p -> !p.equals(phone) && p.indexOf(phone) == 0 ).count() > 0) {
        answer = false;
        break;
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    String[] s = {"12", "123", "1235", "567", "88"};
    System.out.println(AddressBook.solution(s));
  }
}
