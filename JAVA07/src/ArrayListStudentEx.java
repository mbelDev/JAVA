import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

class Student02 {

  private String name;
  private String special;
  private int num;
  private double grade;

  public Student02(String _name, String _special, int _num, double _grade) {
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

public class ArrayListStudentEx {

  public static void main(String[] args) {
    ArrayList<Student02> studentList = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    for (int i = 0; i < 4; i++) {
      println("학생 이름,학과,학번,학점평균을 입력하시오...");
      String str = input.nextLine();
      StringTokenizer strToken = new StringTokenizer(str, ",");
      String name = strToken.nextToken().trim();
      String special = strToken.nextToken().trim();
      int num = Integer.parseInt(strToken.nextToken().trim());
      double grade = Double.parseDouble(strToken.nextToken().trim());
      studentList.add(new Student02(name, special, num, grade));
    }
    println(studentList + "");
    for (Student02 item : studentList) {
      println("이름 : " + item.getName());
      println("학과 : " + item.getSpecial());
      println("학번 : " + item.getNum());
      println("학점평균 : " + item.getGrade());
      println("___________________________");
    }
    while (true) {
      println("찾으시는 학생의 이름을 입력하시오...");
      String name = input.next();
      boolean find = false;
      if (name.equals("그만")) {
        println("그러하시구료...");
        break;
      }
      for (Student02 item : studentList) {
        if (name.equals(item.getName())) {
          print(
            item.getName() +
            ", " +
            item.getSpecial() +
            ", " +
            item.getNum() +
            ", " +
            item.getGrade()
          );
          find = true;
        }
      }
      if (!find) {
        println("찾으시는 학생이 없구료...");
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
