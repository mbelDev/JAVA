package lib;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerEx {

  public static void main(String[] args) {
    String txt01 = "건담/건캐논/건탱크/인/화이트베이스";
    String txt02 = "건담/건캐논/건탱크/인/화이트베이스";
    StringTokenizer st = new StringTokenizer(txt01, "/");
    String[] arrayTxt = txt02.split("/"); // 배열을 Return
    while (st.hasMoreTokens()) {
      System.out.println(st.nextToken());
    }
    for (String item : arrayTxt) {
      System.out.println(item);
    }
    Scanner input = new Scanner(System.in);
    while (true) {
      String yourTxt = input.nextLine();
      if (yourTxt.equals("그만")) {
        System.out.println("워..원통하다...");
        break;
      } else {
        StringTokenizer output = new StringTokenizer(yourTxt, " ");
        System.out.println("어절 갯수는" + output.countTokens());
      }
    }

    System.out.print("당신의 문장...내가 돌려 드리리다...");
    String turnTxt = input.nextLine();
    String turnOut = new String(turnTxt);
    for (int i = 0; i < turnOut.length() + 1; i++) {
      System.out.print(turnOut.substring(i));
      System.out.print(turnOut.substring(0, i));
      System.out.println("");
    }
  }
}
// StringTokenizer와 split의 비교.
// 위의 두 코드는 같은 결과를 도출한다.
