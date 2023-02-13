import java.util.HashMap;
import java.util.Scanner;

class StuMem {

  private String name;
  private double grade;

  public StuMem(String _name, double _grade) {
    name = _name;
    grade = _grade;
  }

  public String getName() {
    return name;
  }

  public double getGrade() {
    return grade;
  }
}

public class Practice07 {

  public static void main(String[] args) {
    HashMap<String, StuMem> stuList = new HashMap<>();
    Scanner input = new Scanner(System.in);
    println("미래장학금 관리 시스템 입니다.");
    for (int i = 0; i < 5; i++) {
      print("이름과 학점 >>");
      String name = input.next();
      double grade = input.nextDouble();
      stuList.put(name, new StuMem(name, grade));
    }
    println("장학금 선정 기준 학점 입력 >>");
    double cutLine = input.nextDouble();
    print("장학금 대상자 : ");
    for (String item : stuList.keySet()) {
      StuMem target = stuList.get(item);
      if (target.getGrade() >= cutLine) {
        print(target.getName() + "  ");
      }
      println("");
    }
    println("___________________________");
    input.close();
  }

  static void print(String txt) {
    System.out.print(txt);
  }

  static void println(String txt) {
    System.out.println(txt);
  }
}
