import java.util.Scanner;

public class Test {

  static void run() {
    Scanner input = new Scanner(System.in);
    int intArray[] = new int[5];
    System.out.println("당신이 입력한 다섯개의 값의 평균을 내어 드리겠소..");
    int avg = 0;
    int max = 0;
    int min = 0;
    for (int i = 0; i < intArray.length; i++) {
      intArray[i] = input.nextInt();
      avg += intArray[i];
      max = intArray[i] > max ? intArray[i] : max;
      min = min == 0 ? intArray[i] : intArray[i] < min ? intArray[i] : min;
    }
    System.out.println(
      "당신이 입력한 " +
      intArray.length +
      "개 값의 평균은" +
      avg /
      intArray.length +
      "이구려"
    );
    System.out.println("최댓값은" + max + ", 최솟값은 " + min + "이라오.");
    for (int item : intArray) {
      System.out.println(item + "\t");
    }
    input.close();
  }

  static void doubleArray() {
    Test mtTest = new Test();
    double[][] testArray = {
      { 2.75, 3.5 },
      { 3.8, 3.86 },
      { 3.16, 4.17 },
      { 4.27, 4.37 },
    };
    double sum = 0;
    double max = 0;
    double min = 0;
    double avg = 0;

    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 2; j++) {
        System.out.print(testArray[i][j] + "\t");
      }
      System.out.println();
    }
    for (double[] item01 : testArray) {
      for (double item02 : item01) {
        sum += item02;
        max = item02 > max ? item02 : max;
        min = min == 0 ? item02 : min < item02 ? min : item02;
      }
    }
    System.out.println(
      "Sum : " + sum + " Avg : " + sum / 8 + " max : " + max + " min : " + min
    );
  }

  static void divideZeroHandling() {
    Scanner input = new Scanner(System.in);
    while (true) {
      System.out.println("첫 번째 수를 입력하시오");
      int num01 = input.nextInt();
      System.out.println("두 번째 수를 입력하시오");
      int num02 = input.nextInt();
      try {
        double result = (double) num01 / (double) num02;
        System.out.println(
          num01 + "을 " + num02 + "로 나누면 " + result + "입니다."
        );
      } catch (Exception e) {
        System.out.println("에러, 예외가 발생하였습니다.");
      } finally {}
    }
  }
}
