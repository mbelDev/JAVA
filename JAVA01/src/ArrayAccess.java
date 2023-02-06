import java.util.Scanner;

public class ArrayAccess {

  public static void main(String[] array) {
    Scanner input = new Scanner(System.in);
    // Test.divideZeroHandling();
    // WhileTest.run();
    // ForTest.run();
    // DoWhileTest.run();
    // nArrayOut.run(); //2번 문제
    // System.out.println("정수를 입력하시오.. 역삼각형을 드리겠소..");
    // int num = input.nextInt();
    // nArrayOut.outAsterisk(num); //3번 문제
    // System.out.println(
    //   "소문자 알파벳을 입력하시오... a부터 제공해 드리리다..."
    // );
    // String alpha = input.next();
    // nArrayOut.outAlphabet(alpha); //4번 문제
    // nArrayOut.outMultipleThreeNew(); //5번 문제
    // nArrayOut.changeMoney(); //6번 문제
    // nArrayOut.randomTen(); //7번 문제
    // nArrayOut.randomCustom(); //8번 문제
    // nArrayOut.random44();//9번 문제
    // nArrayOut.random44andZero(); //10번 문제
    nArrayOut.clabFor369(); //13번 문제
  }
}

class WhileTest {

  public static void run() {
    int sum = 0, i = 0;
    while (i < 100) {
      sum = sum + i;
      i += 2;
    }
    System.out.println("합계 :" + sum);
  }
}

class ForTest {

  public static void run() {
    int sum = 0;
    for (int i = 0; i < 100; i += 2) {
      sum += i;
    }
    System.out.println("합계 :" + sum);
  }
}

class DoWhileTest {

  public static void run() {
    int sum = 0, i = 0;
    do {
      sum += i;
      i += 2;
    } while (i < 100);
    System.out.println("합계 :" + sum);
  }
}

class nArrayOut {

  public static void run() {
    int n[][] = { { 1 }, { 1, 2, 3 }, { 1 }, { 1, 2, 3, 4 }, { 1, 2 } };
    for (int item01[] : n) {
      for (int item02 : item01) {
        System.out.print(item02 + " ");
      }
      System.out.println();
    }
  }

  public static void outAsterisk(int num) {
    for (int i = num; i > 0; i--) {
      for (int j = i; j > 0; j--) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void outAlphabet(String input) {
    char checker = input.charAt(0);
    int b = (int) checker + 1;
    System.out.println(b);

    for (int i = b; i > 97; i--) {
      for (int j = 97; j < i; j++) {
        System.out.print((char) (j) + " ");
      }
      System.out.println();
    }
  }

  public static void outMultipleThree() {
    Scanner inputNum = new Scanner(System.in);
    System.out.println(
      "정수를 열 개 입력해 준다면 그 중 3의 배수를 돌려드리겠소..."
    );
    int inputArray[] = new int[10];
    int lengthThree = 0;
    int lengthCount = 0;
    for (int i = 0; i < inputArray.length; i++) {
      inputArray[i] = inputNum.nextInt();
      lengthThree += inputArray[i] % 3 == 0 ? 1 : 0;
    }
    int outputArray[] = new int[lengthThree];
    for (int item : inputArray) {
      if (item % 3 == 0) {
        outputArray[lengthCount] = item;
        lengthCount++;
      }
    }
    System.out.print("당신이 준 숫자 중 3의 배수는..");
    for (int item : outputArray) {
      System.out.print(item + "...");
    }
    if (outputArray.length > 0) {
      System.out.print("이라오...");
    } else {
      System.out.println("....");
      System.out.print("없구려...없어...3의배수가 없어...");
    }
  }

  public static void outMultipleThreeNew() {
    Scanner inputNum = new Scanner(System.in);
    System.out.println(
      "정수를 열 개 입력해 준다면 그 중 3의 배수를 돌려드리겠소..."
    );
    int inputArray[] = new int[10];
    for (int i = 0; i < inputArray.length; i++) {
      inputArray[i] = inputNum.nextInt();
    }

    System.out.println("당신이 준 숫자 중 3의 배수는..");
    if (inputArray.length > 0) {
      for (int item : inputArray) {
        if (item % 3 == 0) {
          System.out.print(item + "...");
        }
      }
      System.out.print("이라오...");
    } else {
      System.out.println("....");
      System.out.print("없구려...없어...3의배수가 없어...");
    }
  }

  public static void changeMoney() {
    Scanner inputMoney = new Scanner(System.in);
    System.out.println(
      "그대...얼마를 가지고 있소...? 각 화폐로 몇 개씩 되는지 알아봐 드리리다..."
    );
    int[] money = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 1 };
    int total = inputMoney.nextInt();
    if (total > 0) {
      for (int i = 0; i < money.length; i++) {
        if (total / money[i] > 0) {
          System.out.print(money[i] + "원 권이 " + total / money[i] + "개..");
          total = total % money[i];
        }
      }

      System.out.print("구려...");
    } else {
      System.out.print("돈이...없소...?");
    }
  }

  public static void randomTen() {
    int[] arrayTen = new int[10];
    for (int i = 0; i < arrayTen.length; i++) {
      arrayTen[i] = (int) (Math.random() * 10 + 1);
    }
    System.out.print("랜덤한 정수들...");
    for (int item : arrayTen) {
      System.out.print(item + "...");
    }
    System.out.println();
    int sum = 0;
    System.out.print("그리고 그 평균...");
    for (int item : arrayTen) {
      sum += item;
    }
    System.out.print(sum / arrayTen.length + "...");
  }

  public static void randomCustom() {
    Scanner inputCustom = new Scanner(System.in);
    System.out.println(
      "몇 개의 정수를 만드시겠소...? 100개 이하로 부탁드리오..."
    );
    int[] arrayTen = new int[inputCustom.nextInt()];
    if (arrayTen.length > 100) {
      System.out.println("100개 이하로 부탁드리오...");
    } else {
      for (int i = 0; i < arrayTen.length; i++) {
        arrayTen[i] = (int) (Math.random() * 100 + 1);
      }
      System.out.print(arrayTen.length + "개의 랜덤한 정수들...");
      boolean checker = false;
      do {
        int count = 0;
        for (int i = 0; i < arrayTen.length; i++) {
          for (int j = 0; j < arrayTen.length; j++) {
            if (i != j) {
              if (arrayTen[i] == arrayTen[j]) {
                arrayTen[i] = (int) (Math.random() * 100 + 1);
                count++;
              } else {
                continue;
              }
            } else {
              continue;
            }
          }
        }
        System.out.println(count);
        if (count == 0) {
          checker = true;
        }
      } while (checker == false);
      for (int item : arrayTen) {
        System.out.print(item + "...");
      }
      System.out.println();
      int sum = 0;
      System.out.print("그리고 그 평균...");
      for (int item : arrayTen) {
        sum += item;
      }
      System.out.print((double) (sum) / arrayTen.length + "...");
    }
  }

  public static void random44() {
    int[][] array44 = new int[4][4];
    for (int i = 0; i < array44.length; i++) {
      for (int j = 0; j < array44[i].length; j++) {
        array44[i][j] = (int) (Math.random() * 10 + 1);
      }
    }
    for (int item01[] : array44) {
      for (int item02 : item01) {
        System.out.print(item02 + " ");
      }
      System.out.println();
    }
  }

  public static void random44andZero() {
    int[][] array44 = new int[4][4];
    int zeroMust = 0;
    for (int i = 0; i < array44.length; i++) {
      for (int j = 0; j < array44[i].length; j++) {
        array44[i][j] = zeroMust < 10 ? (int) (Math.random() * 11 - 1) : 0;
        zeroMust += array44[i][j] != 0 ? 1 : 0;
      }
    }
    for (int item01[] : array44) {
      for (int item02 : item01) {
        System.out.print(item02 + " ");
      }
      System.out.println();
    }
  }

  public static void clabFor369() {
    for (int i = 3; i < 100; i++) {
      int ten = i > 10 ? i / 10 : 1;
      int one = i % 10 == 0 ? 1 : i % 10;
      if (ten % 3 == 0 && one % 3 == 0) {
        System.out.println(i + "박수 짝짝");
      } else if (ten % 3 == 0 || one % 3 == 0) {
        System.out.println(i + "박수 짝");
        // System.out.println(one % 10 + "" + one % 3);
      }
    }
  }
}
