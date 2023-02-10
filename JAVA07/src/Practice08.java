import java.util.HashMap;
import java.util.Scanner;

class Customer {

  private String name;
  private int point;

  public Customer(String _name, int _point) {
    name = _name;
    point = _point;
  }

  public String getName() {
    return name;
  }

  public int getPoint() {
    return point;
  }

  public void setPoint(int _point) {
    point = _point;
  }

  public void addPoint(int _point) {
    point += _point;
  }

  public void subPoint(int _point) {
    point -= _point;
  }
}

public class Practice08 {

  public static void main(String[] args) {
    HashMap<String, Customer> membership = new HashMap<>();
    Scanner input = new Scanner(System.in);
    println("** 포인트 관리 프로그램 입니다. **");
    while (true) {
      print("이름과 포인트 입력>>");
      String name = input.next();
      if (name.equals("그만")) {
        break;
      }
      int point = input.nextInt();
      Customer member = membership.get(name);
      if (member == null) {
        membership.put(name, new Customer(name, point));
      } else {
        member.addPoint(point);
      }

      for (String item : membership.keySet()) {
        Customer printMember = membership.get(item);
        print(
          "(" + printMember.getName() + "," + printMember.getPoint() + ") "
        );
      }
      println("");
    }
  }

  static void print(String txt) {
    System.out.print(txt);
  }

  static void println(String txt) {
    System.out.println(txt);
  }
}
