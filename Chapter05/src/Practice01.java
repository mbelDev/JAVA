import java.util.Scanner;
import javax.swing.plaf.nimbus.AbstractRegionPainter;

public class Practice01 {

  public static void main(String[] args) {
    // ColorTV myTV = new ColorTV(32, 1024);
    // myTV.printProperty();
    // IPTV ipTV = new IPTV("192.1.1.1", 32, 2048);
    // ipTV.printProperty();

    // 실습 3번
    // Won2Dollar toDollar = new Won2Dollar(1200);
    // toDollar.run();

    // 실습 4번
    // Km2Mile toMile = new Km2Mile(1.6);
    // toMile.run();

    // 실습 5번
    // ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
    // cp.setXY(10, 20);
    // cp.setColor("RED");
    // String str = cp.toString();
    // System.out.println(str + "입니다.");

    // 실습 6번
    // ColorPoint zeroPoint = new ColorPoint();
    // System.out.println(zeroPoint.toString() + "입니다.");

    // ColorPoint cp = new ColorPoint(10, 10);
    // cp.setXY(5, 5);
    // cp.setColor("RED");
    // System.out.println(cp.toString() + "입니다.");

    // 실습 7번
    // Point3D p = new Point3D(1, 2, 3);
    // System.out.println(p.toSting() + "입니다.");

    // p.moveUp();
    // System.out.println(p.toSting() + "입니다.");

    // p.moveDown();
    // p.move(10, 10);
    // System.out.println(p.toSting() + "입니다.");

    // p.move(100, 200, 300);
    // System.out.println(p.toSting() + "입니다.");

    // 실습 8번
    PositivePoint p = new PositivePoint();
    p.move(10, 10);
    System.out.println(p.toString() + "입니다.");

    p.move(-5, 5);
    System.out.println(p.toString() + "입니다.");

    PositivePoint p2 = new PositivePoint(-10, -10);
    System.out.println(p2.toString() + "입니다.");
  }
}

class TV {

  private int size;

  public TV(int _size) {
    size = _size;
  }

  protected int getSize() {
    return size;
  }
}

class ColorTV extends TV {

  private int color;

  public ColorTV(int _size, int _color) {
    super(_size);
    color = _color;
  }

  public void printProperty() {
    System.out.println(getSize() + "인치 " + color + "컬러");
  }
}

class IPTV extends TV {

  private String addr;
  private int color;

  public IPTV(String _addr, int _size, int _color) {
    super(_size);
    color = _color;
    addr = _addr;
  }

  public void printProperty() {
    System.out.println(
      "나의 IPTV는 " + addr + "주소의 " + getSize() + "인치 " + color + "컬러"
    );
  }
}

abstract class Converter {

  protected abstract double convert(double src);

  protected abstract String getSrcString();

  protected abstract String getDestString();

  protected double ratio;

  public void run() {
    Scanner scanner = new Scanner(System.in);
    System.out.println(
      getSrcString() + "을 " + getDestString() + "으로 바꿉니다."
    );
    System.out.print(getSrcString() + "을 입력하세요>>");
    double val = scanner.nextDouble();
    double res = convert(val);
    scanner.close();
  }
}

class Won2Dollar extends Converter {

  protected String srcString = "원";
  protected String destString = "달러";

  public Won2Dollar(double _ratio) {
    super();
    ratio = _ratio;
  }

  protected String getSrcString() {
    return srcString;
  }

  protected String getDestString() {
    return destString;
  }

  protected double convert(double src) {
    System.out.println(
      "변환결과: " + src / ratio + getDestString() + "입니다."
    );
    return src / ratio;
  }
}

class Km2Mile extends Converter {

  protected String srcString = "Km";
  protected String destString = "Mile";

  public Km2Mile(double _ratio) {
    super();
    ratio = _ratio;
  }

  protected String getSrcString() {
    return srcString;
  }

  protected String getDestString() {
    return destString;
  }

  protected double convert(double src) {
    System.out.println(
      "변환 결과: " + src / ratio + getDestString() + "입니다."
    );
    return src / ratio;
  }
}

class Point {

  protected int x, y;

  public Point(int _x, int _y) {
    x = _x;
    y = _y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  protected void move(int _x, int _y) {
    x = _x;
    y = _y;
  }
}

class ColorPoint extends Point {

  private String color = "BLACK";

  public ColorPoint() {
    super(0, 0);
  }

  public ColorPoint(int _x, int _y) {
    super(_x, _y);
  }

  public ColorPoint(int _x, int _y, String _color) {
    super(_x, _y);
    color = _color;
  }

  protected void setXY(int _x, int _y) {
    move(_x, _y);
  }

  protected void setColor(String _color) {
    color = _color;
  }

  public String toString() {
    String result;
    result = color + "색의 (" + x + "," + y + ")의 점";
    return result;
  }
}

class Point3D extends Point {

  private int z;

  public Point3D() {
    super(0, 0);
    z = 0;
  }

  public Point3D(int _x, int _y, int _z) {
    super(_x, _y);
    z = _z;
  }

  protected void moveUp() {
    z++;
  }

  protected void moveDown() {
    z--;
  }

  protected void move(int _x, int _y) {
    x = _x;
    y = _y;
  }

  protected void move(int _x, int _y, int _z) {
    x = _x;
    y = _y;
    z = _z;
  }

  public String toString() {
    String result;
    result = "(" + x + "," + y + "," + z + ")의 점";
    return result;
  }
}

class PositivePoint extends Point {

  public PositivePoint() {
    super(0, 0);
  }

  public PositivePoint(int _x, int _y) {
    super(0, 0);
    if (_x < 0 || _y < 0) {
      move(0, 0);
    }
  }

  protected void move(int _x, int _y) {
    if (_x >= 0 && _y >= 0) {
      x = _x;
      y = _y;
    }
  }

  public String toString() {
    String result;
    result = "(" + x + "," + y + ")의 점";
    return result;
  }
}
