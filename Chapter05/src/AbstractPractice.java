public class AbstractPractice {

  public static void main(String[] args) {
    GoodCalculator good = new GoodCalculator();
    System.out.println(good.add(7, 5));
    System.out.println(good.subtract(50, 22));
    System.out.println(good.average(new int[] { 2, 4, 6, 8, 11, 23 }));
  }
}

abstract class Calculator {

  public abstract int add(int _a, int _b);

  public abstract int subtract(int _a, int _b);

  public abstract int average(int _a[]);
}

class GoodCalculator extends Calculator {

  public int add(int _a, int _b) {
    System.out.println("나는 Add를 구현했다.");
    return _a + _b;
  }

  public int subtract(int _a, int _b) {
    System.out.println("나는 Subtract를 구현했다.");
    return _a - _b;
  }

  public int average(int _a[]) {
    System.out.println("나는 Average를 구현했다.");
    int sum = 0;
    for (int item : _a) {
      sum += item;
    }
    return sum / _a.length;
  }
}
