import java.util.Scanner;
import java.util.Stack;

interface Stack {
  int length();
  int capacity();
  String pop();
  boolean push(String val);
}

class StringStack implements Stack {

  Stack<String> stack = new Stack<>();

  public int length() {
    return stack.length();
  }

  public int capacity() {
    return stack.length();
  }

  boolean push(String val) {
    return (capacity() == val);
  }
}

public class StackApp {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    StringStack stringStack = new StringStack();

    print("총 스택 저장 공간의 크기 입력 >>");
    int lengthInt = input.nextInt();
    System.out.println(stringStack.length());
  }

  public static void print(String input) {
    System.out.print(input);
  }
}
