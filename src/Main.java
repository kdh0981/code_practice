import problems.AddressBook;
import problems.FindPrime;
import problems.Marathon;
import problems.SockMerchant;

public class Main {
    public static void main(String[] args) {
        System.out.println(FindPrime.solution(100));
        System.out.println(Marathon.solution(
          new String[]{"mislav", "stanko", "mislav", "ana"},
          new String[]{"stanko", "ana", "mislav"})
        );

        System.out.println(AddressBook.solution(new String[]{"12", "123", "1235", "567", "88"}));
        System.out.println(SockMerchant.solution(9, new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20}));
    }
}
