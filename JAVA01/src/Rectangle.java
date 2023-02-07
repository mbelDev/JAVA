public class Rectangle {

  int x, y, width, height;

  public Rectangle() {
    x = 0;
    y = 0;
    width = 1;
    height = 1;
  }

  public Rectangle(int _x, int _y, int _width, int _height) {
    x = _x;
    y = _y;
    width = _width;
    height = _height;
  }

  public int square() {
    return width * height;
  }

  public void show() {
    System.out.println(
      "(" + x + "," + y + ")에서 크기가 " + width + "x" + height + "인 사각형"
    );
  }

  boolean contains(Rectangle r) {
    if (
      (r.x + r.width < this.x + this.width && r.x > this.x) &&
      (r.y + r.height < this.y + this.height && r.y > this.y)
    ) {
      return true;
    } else {
      return false;
    }
  }
}
