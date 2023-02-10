import java.util.HashMap;
// import java.util.Iterator;
import java.util.Scanner;

class Student {

  private String name;
  private String special;
  private int num;
  private double grade;

  public Student(String _name, String _special, int _num, double _grade) {
    name = _name;
    special = _special;
    num = _num;
    grade = _grade;
  }

  public String getName() {
    return name;
  }

  public String getSpecial() {
    return special;
  }

  public int getNum() {
    return num;
  }

  public double getGrade() {
    return grade;
  }
}

public class HashMapStudentEx {

  public static void main(String[] args) {
    HashMap<String, Student> studentMap = new HashMap<>();
    Scanner input = new Scanner(System.in);
    for (int i = 0; i < 4; i++) {
      println("학생 이름,학과,학번,학점평균을 입력하시오...");
      String name = input.next();
      String special = input.next();
      int num = input.nextInt();
      double grade = input.nextDouble();
      studentMap.put(name, new Student(name, special, num, grade));
    }
    // Iterator<String> keys = studentMap.keySet().iterator();
    for (Student value : studentMap.values()) {
      Student student = value;
      println("이름 : " + student.getName());
      println("학과 : " + student.getSpecial());
      println("학번 : " + student.getNum());
      println("학점평균 : " + student.getGrade());
      println("___________________________");
    }
    while (true) {
      println("검색할 학생의 이름을 입력하시오...");
      String name = input.next();
      Student student = studentMap.get(name);
      if (name.equals("그만")) {
        println("그러하시구료...");
        break;
      }
      if (student == null) {
        println("존재하지 않는 학생이구료...");
      } else {
        print(
          student.getName() +
          ", " +
          student.getSpecial() +
          ", " +
          student.getNum() +
          ", " +
          student.getGrade()
        );
        println("");
      }
    }
  }

  static void print(String txt) {
    System.out.print(txt);
  }

  static void println(String txt) {
    System.out.println(txt);
  }
}
