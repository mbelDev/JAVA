import java.util.Stack;

class GStack<T> {

  int tos; // top of Stack
  Object stack[];

  public GStack() {
    tos = 0;
    stack = new Object[10];
  }

  public void push(T item) {
    if (tos == 10) {
      return;
    } else {
      stack[tos] = item;
      tos++;
    }
  }

  public T pop() {
    if (tos == 0) {
      return null;
    } else {
      return (T) stack[tos];
    }
  }
}

public class GenericStackEx {

  public static void main(String[] args) {
    GStack<String> stringStack = new GStack<>();
    stringStack.push("권인호");
    stringStack.push("김승효");
    stringStack.push("마징가");
    println(stringStack.pop() + " " + stringStack.tos + " ");

    GStack<Integer> intStack = new GStack<>();
    intStack.push(99);
    intStack.push(25);
    intStack.push(68);
    println(intStack.pop() + " " + intStack.tos);
  }

  static void print(String txt) {
    System.out.print(txt);
  }

  static void println(String txt) {
    System.out.println(txt);
  }
}
