import java.util.Vector;

class Point {

  private int x;
  private int y;

  public Point(int _x, int _y) {
    x = _x;
    y = _y;
  }

  public String toString() {
    return "(" + x + "," + y + ")";
  }
}

public class PointVector {

  public static void main(String[] args) {
    Vector<Point> vec2 = new Vector<>();
    vec2.add(new Point(1, 1));
    vec2.add(new Point(2, 2));
    vec2.add(new Point(3, 3));

    System.out.println(vec2.get(2));
  }
}
