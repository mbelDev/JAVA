package lib;

import java.util.Scanner;

public class StringBufferEx {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // StringBuffer sb = new StringBuffer("This");
    // System.out.println(sb);
    // sb.append(" is pencil");
    // System.out.println(sb);
    // sb.insert(8, "my ");
    // System.out.println(sb);
    // sb.replace(8, 11, "your ");
    // System.out.println(sb);
    // sb.delete(8, 13);
    // System.out.println(sb);

    // System.out.println(sb.indexOf("pencil"));
    StringBuffer text = new StringBuffer("우리는 Love Sick Girls");
    System.out.println(text);
    String order;
    while (true) {
      System.out.print("명령 :");
      order = input.next();
      if (order.equals("그만")) {
        break;
      } else {
        changeString(order, text);
      }
    }
  }

  static void changeString(String input, StringBuffer target) {
    if (input.indexOf("!") != -1) {
      int startPoint;
      int endPoint;
      String[] arrayTxt = input.split("!");
      if (arrayTxt.length == 2) {
        startPoint = target.indexOf(arrayTxt[0]);
        endPoint = startPoint + arrayTxt[0].length();
        if (startPoint == -1 || endPoint == -1) {
          System.out.println("찾을 수 없습니다!");
        } else {
          System.out.println(target.replace(startPoint, endPoint, arrayTxt[1]));
        }
      } else {
        printErr();
      }
    } else {
      printErr();
    }
  }

  protected static void printErr() {
    System.out.println("잘못된 명령입니다!");
  }
}
