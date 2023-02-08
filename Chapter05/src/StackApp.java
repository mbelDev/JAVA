import java.util.Scanner;

interface Stack {
  int length();
  int capacity();
  String pop();
  boolean push(String val);
}

class StringStack implements Stack {

  private int maxLength;
  private int length = 0;
  private String[] stackArr;

  public StringStack(int _maxLength) {
    maxLength = _maxLength;
    stackArr = new String[_maxLength];
  }

  public int length() {
    return length;
  }

  public int capacity() {
    return maxLength - length;
  }

  public String pop() {
    length--;
    return stackArr[length];
    // return popString;
  }

  public boolean push(String _val) {
    if (capacity() == 0) {
      return false;
    } else {
      stackArr[length] = _val;
      length++;
      return true;
    }
  }
}

public class StackApp {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    print("총 스택 저장 공간의 크기 입력 >>");
    int lengthInt = input.nextInt();
    StringStack stringStack = new StringStack(lengthInt);
    while (true) {
      System.out.print("문자열 입력 >>");
      String str = input.next();
      if (str.equals("그만!")) {
        break;
      } else {
        boolean res = stringStack.push(str);
        if (res == false) {
          System.out.println("주..죽여줘.. (스택이 꽉 차서 푸쉬 불가)");
        }
      }
    }
    while (stringStack.length() > 0) {
      print(stringStack.pop());
    }
  }

  public static void print(String input) {
    System.out.print(input);
  }
}
