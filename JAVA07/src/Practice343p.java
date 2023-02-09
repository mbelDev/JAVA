import java.util.HashMap;
import java.util.Scanner;

public class Practice343p {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    HashMap<String, Integer> nations = new HashMap<String, Integer>();
    println(
      "나라 이름과 인구를 입력하시오...예를 들어... Korea 5000 처럼 말이오...."
    );
    while (true) {
      print("나라 이름, 인구 >>");
      String name = input.next();
      if (name.equals("그만")) {
        break;
      }
      int popul = input.nextInt();
      nations.put(name, popul);
    }
    println("인구 검색의 시간이오.... 나라 이름을 입력하시오... ");
    while (true) {
      String search = input.next();
      if (search.equals("그만")) {
        break;
      }
      if (nations.get(search) == null) {
        println(search + "... 그런 나라는 없다오...");
      } else {
        println(search + "의 인구는... " + nations.get(search) + "이라오..");
      }
    }
  }

  static void print(String txt) {
    System.out.print(txt);
  }

  static void println(String txt) {
    System.out.println(txt);
  }
}
