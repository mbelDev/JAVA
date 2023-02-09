package lib;

class Rect {

  public int w, h;

  public Rect(int _w, int _h) {
    w = _w;
    h = _h;
  }

  protected int area() {
    return w * h;
  }

  @Override
  public boolean equals(Object obj) {
    Rect target = (Rect) obj;
    // if (w * h == obj.w * obj.h) {
    // }
    return true;
  }
}

public class RectEx {

  public static void main(String[] args) {
    Rect r01 = new Rect(10, 10);
    Rect r02 = new Rect(20, 5);
    if (r01.equals(r02)) {
      System.out.print("넓이는 같다.");
    } else {
      System.out.print("넓이는 다르다.");
    }
  }
}
