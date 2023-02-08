import java.util.Scanner;

abstract class Calc {

  protected int a, b;

  abstract void setValue(int a, int b);

  abstract int calculate();
}

class Add extends Calc {

  protected void setValue(int a, int b) {
    this.a = a;
    this.b = b;
  }

  protected int calculate() {
    return a + b;
  }
}

class Sub extends Calc {

  protected void setValue(int a, int b) {
    this.a = a;
    this.b = b;
  }

  protected int calculate() {
    return a - b;
  }
}

class Mul extends Calc {

  protected void setValue(int a, int b) {
    this.a = a;
    this.b = b;
  }

  protected int calculate() {
    return a * b;
  }
}

class Div extends Calc {

  protected void setValue(int a, int b) {
    this.a = a;
    this.b = b;
  }

  protected int calculate() {
    return a / b;
  }
}

public class Calculate {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("두 자연수와 연산자를 입력하라 >>");
    int a = input.nextInt();
    int b = input.nextInt();
    String sign = input.next();
    Calc calc = null;
    switch (sign) {
      case "+":
        calc = new Add();
        break;
      case "-":
        calc = new Sub();
        break;
      case "/":
        calc = new Div();
        break;
      case "*":
        calc = new Mul();
        break;
    }
    calc.setValue(a, b);
    System.out.println(calc.calculate());
  }
}
