import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx {

  static void print(String txt) {
    System.out.print(txt);
  }

  static void println(String txt) {
    System.out.println(txt);
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    HashMap<String, String> dic = new HashMap();
    dic.put("apple", "사과");
    dic.put("banana", "바나나");
    dic.put("melon", "메론");
    dic.put("dragon fruits", "용과");

    println(dic.get("apple"));
    while (true) {
      println("찾으시는 단어를 입력하시오....");
      String eng = input.next();
      if (eng.equals("exit")) {
        input.close();
        break;
      }
      String kor = dic.get(eng);
      if (kor != null) {
        println(kor + "를 찾으시오...?");
      } else {
        println("찾으시는 단어가 없소이만...");
      }
    }
  }
}
