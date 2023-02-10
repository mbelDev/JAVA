import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

public class Practice343p {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Vector<Integer> numVec = new Vector<Integer>();
    // println("정수를 입력하시오..끝내시려거든 -1을 입력하시오...");
    // while (true) {
    //   int yourNum = input.nextInt();
    //   if (yourNum == -1) {
    //     break;
    //   } else {
    //     numVec.add(yourNum);
    //   }
    // }
    // int numBig = 0;
    // for (int i = 0; i < numVec.size(); i++) {
    //   if (numBig == 0) {
    //     numBig = numVec.get(i);
    //   } else if (numBig < numVec.get(i)) {
    //     numBig = numVec.get(i);
    //   }
    // }
    // System.out.println("가장 큰 수는 " + numBig + "이라오...");

    //     ArrayList<String> grade = new ArrayList<>();
    //     println(
    //       "당신의 학점 6개를 /로 구분하여 입력하시오...예를들자면..A/B/C/D/E/F 처럼 말이오..."
    //     );
    //     String strTarget = input.next();
    //     String[] strSplit = strTarget.split("/");
    //     for (String item : strSplit) {
    //       grade.add(item);
    //     }
    //     double average;
    //     double total = 0;
    //     for (String item : grade) {
    //       switch (item) {
    //         case "A":
    //           total += 4.0;
    //           break;
    //         case "B":
    //           total += 3.0;
    //           break;
    //         case "C":
    //           total += 2.0;
    //           break;
    //         case "D":
    //           total += 1.0;
    //           break;
    //         case "F":
    //           total += 0.0;
    //           break;
    //         default:
    //           break;
    //       }
    //     }
    //     average = total / grade.size();
    //     println("당신 학점의 평균은" + average + "점 이라오...");
    //   }

    //   HashMap<String, Integer> nations = new HashMap<String, Integer>();
    //   println(
    //     "나라 이름과 인구를 입력하시오...예를 들어... Korea 5000 처럼 말이오...."
    //   );
    //   while (true) {
    //     print("나라 이름, 인구 >>");
    //     String name = input.next();
    //     if (name.equals("그만")) {
    //       break;
    //     }
    //     int popul = input.nextInt();
    //     nations.put(name, popul);
    //   }
    //   println("인구 검색의 시간이오.... 나라 이름을 입력하시오... ");
    //   while (true) {
    //     String search = input.next();
    //     if (search.equals("그만")) {
    //       break;
    //     }
    //     if (nations.get(search) == null) {
    //       println(search + "... 그런 나라는 없다오...");
    //     } else {
    //       println(search + "의 인구는... " + nations.get(search) + "이라오..");
    //     }
    //   }
    // }

    Vector<Integer> riverAvg = new Vector<Integer>();
    int yourInput;
    println("강수량을 입력하시오...0을 입력하면..종료한다오..");
    while (true) {
      yourInput = input.nextInt();
      int total = 0;
      int average;
      if (yourInput == 0) {
        break;
      }
      riverAvg.add(yourInput);
      for (int i = 0; i < riverAvg.size(); i++) {
        total += riverAvg.get(i);
        print(riverAvg.get(i) + " ");
      }
      println("");
      println("현재 평균 " + (total / riverAvg.size()));
    }
    println("종료.. 수고하셨소...");
  }

  static void print(String txt) {
    System.out.print(txt);
  }

  static void println(String txt) {
    System.out.println(txt);
  }
}
