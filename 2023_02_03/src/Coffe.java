import java.util.Scanner;

public class Coffe {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // System.out.println("당신의 금액 얼마인가?");
    // int money = input.nextInt();
    // System.out.println(
    //   "당신의 현찰, 5만원권 " +
    //   money /
    //   50000 +
    //   "장, 만원권 " +
    //   money %
    //   50000 /
    //   10000 +
    //   "장, 5천원권 " +
    //   money %
    //   10000 /
    //   5000 +
    //   "장 천원권 " +
    //   money %
    //   5000 /
    //   1000 +
    //   "장 오백원 동전 " +
    //   money %
    //   1000 /
    //   500 +
    //   "개 백원 동전 " +
    //   money %
    //   500 /
    //   100 +
    //   "개 5십원 동전 " +
    //   money %
    //   100 /
    //   50 +
    //   "개 그리고 십원 동전 " +
    //   money %
    //   50 /
    //   10 +
    //   "개로군."
    // );

    //     System.out.println(
    //       "세 개의 값을 입력하시면 제가 그 중간값을 찾아드리지요..."
    //     );
    //     int a, b, c;
    //     System.out.println("첫 번째 값을 입력하시지요....");
    //     a = input.nextInt();
    //     System.out.println("두 번째 값을 입력하시지요....");
    //     b = input.nextInt();
    //     System.out.println("세 번째 값을 입력하시지요....");
    //     c = input.nextInt();
    //     System.out.println(
    //       (a > c && a < b) | (a > b && a < c)
    //         ? "중간 값은 " + a + " 입니다..."
    //         : (b > a && b < c) | (b > c && b < a)
    //           ? "중간 값은 " + b + " 입니다..."
    //           : (c < a && c > b) | (c < b && c > a)
    //             ? "중간 값은 " + c + " 입니다..."
    //             : "안타깝게도 중간값은 없습니다..."
    //     );

    //     System.out.println("당신의 세 값이 삼각형이 되는가... 알려 드리지요...");
    //     int a, b, c;
    //     System.out.println("첫 번째 값을 입력하시지요....");
    //     a = input.nextInt();
    //     System.out.println("두 번째 값을 입력하시지요....");
    //     b = input.nextInt();
    //     System.out.println("세 번째 값을 입력하시지요....");
    //     c = input.nextInt();
    //     System.out.println(
    //       (a > b && a > c) && a < b + c
    //         ? "예 가능합니다..."
    //         : (b > a && b > c) && b < a + c
    //           ? "예 가능합니다..."
    //           : (c > a && c > b) && c < a + b
    //             ? "예 가능합니다..."
    //             : "아쉽게도...안됩니다..."
    //     );

    //     System.out.println(
    //       "삼육구 삼육구...삼육구 삼육구...당신의 숫자는...? 두 자릿수 이내로 답하시오..."
    //     );
    //     int a = input.nextInt();
    //     String c = threesixnine(a);
    //     System.out.println(
    //       (String.valueOf(a).length() > 2)
    //         ? "두 자릿수로 이내로 답하시오..."
    //         : c.length() != 0 ? "박수" + c + "..." : a + "..."
    //     );
    //   }

    //   public static String threesixnine(int num) {
    //     int a = num / 10;
    //     int b = num % 10;
    //     String c = "";
    //     if (a == 3 || a == 6 || a == 9) {
    //       c += "짝";
    //     }
    //     if (b == 3 || b == 6 || b == 9) {
    //       c += "짝";
    //     }
    //     return c;

    // System.out.println(
    //   "지금이 몇월이오...? 날짜감각이 없으니...이게 어떻게 된 일이오...?"
    // );
    // int a = input.nextInt();
    // System.out.println(
    //   a > 12 || a < 1
    //     ? "그런 달은 없소...지금이 몇 월이오..?"
    //     : a > 2 && a < 6
    //       ? a + "월... 지금은... 봄이군..."
    //       : a > 5 && a < 9
    //         ? a + "월... 지금은... 여름이군..."
    //         : a > 8 && a < 12
    //           ? a + "월... 지금은... 가을이군..."
    //           : a + "월... 지금은... 겨울이군..."
    // );
    // System.out.println(
    //   a > 12 || a < 1 ? "지금..지금이 몇 월이오...?" : "가르쳐 주어 고맙소...."
    // );

    //     System.out.println(
    //       "지금이 몇월이오...? 날짜감각이 없으니...이게 어떻게 된 일이오...?"
    //     );
    //     int a = input.nextInt();
    //     if (a < 1 || a > 12) {
    //       System.out.println(a + "월...? 그런 달은 없소...");
    //     } else {
    //       switch (a / 3) {
    //         case 1:
    //           System.out.println(a + "월... 지금은... 봄이군...");
    //           break;
    //         case 2:
    //           System.out.println(a + "월... 지금은... 여름이군...");
    //           break;
    //         case 3:
    //           System.out.println(a + "월... 지금은... 가울이군...");
    //           break;
    //         default:
    //           System.out.println(a + "월... 지금은... 겨울이군...");
    //           break;
    //       }
    //       System.out.println("알려주어...고맙소...");
    //     }

    // System.out.println(
    //   "그대가 알고 싶어하는 사칙연산...더하기 뺴기 곱하기와 나누기...내가 해 드리리다..."
    // );
    // System.out.println(
    //   "숫자와 기호.. 그리고 숫자를 빈칸과 함께 입력하시오.. 예를들면... 2 + 4 와 같이.."
    // );
    // int a = input.nextInt();
    // String c = input.next();
    // int b = input.nextInt();
    // if (c.equals("+")) {
    //   System.out.println(a + "더하기" + b + "는..." + (a + b) + "라오...");
    // } else if (c.equals("-")) {
    //   System.out.println(a + "빼기" + b + "는..." + (a - b) + "라오...");
    // } else if (c.equals("*")) {
    //   System.out.println(a + "곱하기" + b + "는..." + (a * b) + "라오...");
    // } else if (c.equals("/")) {
    //   if (a != 0 && b != 0) {
    //     System.out.println(
    //       a +
    //       "나누기" +
    //       b +
    //       "는..." +
    //       (a / b) +
    //       "라오...그리고 그 나머지는 " +
    //       (a % b) +
    //       "라오..."
    //     );
    //   } else {
    //     System.out.println("0은 나누거나 나누어질수 없소...");
    //   }
    // } else {
    //   System.out.println(
    //     "나는 더하기 빼기 곱하기 나누기 연산만 할 수 있소...."
    //   );
    // }

    // System.out.println("그대와 나... 가위바위보로 승부를 짓겠소...");
    // System.out.println("그대는 무엇을 내시겠소..?");
    // String selMine = input.next();
    // if (
    //   selMine.equals("가위") || selMine.equals("바위") || selMine.equals("보")
    // ) {
    //   System.out.println("그렇다면 나는 무엇을 내야하겠소...?");
    //   String selYour = input.next();
    //   if (selMine.equals(selYour)) {
    //     System.out.println(selMine + "... 비겼구려...");
    //   } else if (
    //     (selMine.equals("가위") && selYour.equals("바위")) ||
    //     (selMine.equals("바위") && selYour.equals("보")) ||
    //     (selMine.equals("보") && selYour.equals("가위"))
    //   ) {
    //     System.out.println(
    //       selMine + "...? 나는" + selYour + "이니... 내가 이겼구려..."
    //     );
    //   } else if (
    //     (selMine.equals("가위") && selYour.equals("보")) ||
    //     (selMine.equals("바위") && selYour.equals("가위")) ||
    //     (selMine.equals("보") && selYour.equals("바위"))
    //   ) {
    //     System.out.println(
    //       selMine + "...? 나는" + selYour + "이니... 내가 졌구려..."
    //     );
    //   } else {
    //     System.out.println(
    //       selYour + "...? 그것은 무엇이오...? 정체도 모르는것을 낼 수 없소..."
    //     );
    //   }
    // } else {
    //   System.out.println(
    //     selMine + "...? 그것은 무엇이오...? 다시 기회를 드리겠소..."
    //   );
    // }

    // for (int i = 2; i <= 9; i++) {
    //   if (i == 3) continue;
    //   System.out.print(i + "단~! ");
    //   for (int j = 2; j <= 9; j++) {
    //     System.out.print(i + "*" + j + "=" + i * j);
    //     System.out.print("\t");
    //   }
    //   System.out.println();
    // }

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 9 - i; j++) {
        if (j < i) {
          System.out.print(" ");
        } else {
          System.out.print(j);
        }
      }
      System.out.println();
    }
  }
}
