package lib;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarEx {

  public static void main(String[] args) {
    Calendar now = Calendar.getInstance();
    int hour = now.get(Calendar.HOUR);
    int min = now.get(Calendar.MINUTE);
    print("현재시간은 " + hour + "시 " + min + "분 입니다.");
    if (hour >= 4 && hour < 12) {
      print("GoodMorning");
    } else if (hour >= 12 && hour < 18) {
      print("GoodAfternoon");
    } else if (hour >= 18 && hour < 22) {
      print("GoodEvening");
    } else {
      print("GoodNight");
    }

    Scanner input = new Scanner(System.in);
    print("10초에 가까운 사람이 이기는 경기라오...");
    print("Enter키를 눌러 시간을 재 보시겠소...?");
    print("기태군...시작... <Enter>키 >> ");
    String next = input.nextLine();
    int secNow = now.get(Calendar.SECOND);
    print(
      "지금은 " +
      secNow +
      "초 라오... 10초가 되었다 싶으면 다시 <Enter>키를... >>"
    );
    next = input.nextLine();
    now = Calendar.getInstance();
    int sec10Sec = now.get(Calendar.SECOND);
    print(
      "지금은 " +
      sec10Sec +
      "초 라오..." +
      (sec10Sec - secNow) +
      "초가 경과하였구료.."
    );
    int giTae = sec10Sec - secNow;
    print("재문군...시작... <Enter>키 >> ");
    next = input.nextLine();
    secNow = now.get(Calendar.SECOND);
    print(
      "지금은 " +
      secNow +
      "초 라오... 10초가 되었다 싶으면 다시 <Enter>키를... >>"
    );
    next = input.nextLine();
    now = Calendar.getInstance();
    sec10Sec = now.get(Calendar.SECOND);
    print(
      "지금은 " +
      sec10Sec +
      "초 라오..." +
      (sec10Sec - secNow) +
      "초가 경과하였구료.."
    );
    int jaeMoon = sec10Sec - secNow;

    if (Math.abs(10 - giTae) < Math.abs(10 - jaeMoon)) {
      print("승자는...황 기태군...");
    } else {
      print("승자는...이 재문군...");
    }
  }

  static void print(String txt) {
    System.out.println(txt);
  }
}
