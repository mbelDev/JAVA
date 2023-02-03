import java.util.Scanner;

public class Arithmethic {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // int time = sc.nextInt();
    // int sec = time%60;
    // int min = (time/60)%60;
    // int hour = (time/60)/60;

    // System.out.println(time+"초는 "+hour+"시 "+min+" 분"+sec+"초 입니다.");

    // System.out.println("당신의 나이는?");
    // int age = sc.nextInt();
    // String adult = age > 18 ? "성인" : "미성년";
    // System.out.println("당신은"+adult+"입니다.");

    System.out.println("등급 구하기. 성적을 입력하시오.");
    // int inp = abs(sc.nextInt());
    int score = sc.nextInt();
    char grade = (score >= 90)
      ? 'A'
      : (score >= 80)
        ? 'B'
        : (score >= 70) ? 'C' : (score >= 60) ? 'D' : (score >= 50) ? 'E' : 'F';
    System.out.println(grade);
    sc.close();
  }

  public static int abs(int num) {
    int result = num < 0 ? num * -1 : num;
    return result;
  }
}
