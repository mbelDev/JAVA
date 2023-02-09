import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {

  public static void main(String[] args) {
    ArrayList<String> arrayList = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    for (int i = 0; i < 4; i++) {
      System.out.println("이름을 입력하세요.");
      String name = input.next();
      arrayList.add(name);
    }
    System.out.println(arrayList);
    int lengthName = 0;
    String bestName = null;
    for (String item : arrayList) {
      if (lengthName == 0) {
        lengthName = item.length();
        bestName = item;
      } else if (lengthName < item.length()) {
        lengthName = item.length();
        bestName = item;
      }
    }
    System.out.println(bestName);
  }

  static String longestName(String[] input) {
    int lengthName = 0;
    String bestName = null;
    for (String item : input) {
      if (lengthName == 0) {
        lengthName = item.length();
        bestName = item;
      } else if (lengthName < item.length()) {
        lengthName = item.length();
        bestName = item;
      }
    }
    return bestName;
  }
}
