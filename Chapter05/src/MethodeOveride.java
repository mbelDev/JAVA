public class MethodeOveride {

  public static void main(String[] args) {
    // Shape shape = new Shape();
    // shape.draw();
    // Line line = new Line();
    // line.draw("master");
    Weapon weapon;
    weapon = new Weapon();
    System.out.println("대미지는 " + weapon.fire());
    weapon = new Cannon();
    System.out.println("대미지는 " + weapon.fire());
  }
}

// class Shape {

//   public void draw() {
//     System.out.println("Shape");
//   }
// }

// class Line extends Shape {

//   public void draw(String _name) {
//     System.out.println(_name + "Line");
//   }
// }

class Weapon {

  int fire() {
    return 1;
  }
}

class Cannon extends Weapon {

  int fire() {
    return 10;
  }
}
