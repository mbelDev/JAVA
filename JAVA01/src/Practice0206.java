import java.util.Scanner;

public class Practice0206 {

  public static void main(String[] args) {
    TV myTV = new TV("LG", 2017, 32);
    myTV.show();

    Scanner scanner = new Scanner(System.in);

    System.out.print("수학 과학 영어 순으로 3개의 점수 입력>>");
    int math = scanner.nextInt();
    int science = scanner.nextInt();
    int english = scanner.nextInt();
    Grade me = new Grade(math, science, english);
    System.out.println("평균은 " + me.average());
    scanner.close();

    Song abba = new Song("Dancing Queen", "ABBA", "1978", "스웨덴");
    abba.show();

    Rectangle r = new Rectangle(2, 2, 8, 7);
    Rectangle s = new Rectangle(5, 5, 6, 6);
    Rectangle t = new Rectangle(1, 1, 10, 10);

    r.show();
    System.out.println("s의 면적은 " + s.square());
    if (t.contains(r)) System.out.println("t는 r을 포함합니다.");
    if (t.contains(s)) System.out.println("t는 s를 포함합니다.");
    Circle piz = new Circle();
  }
}
