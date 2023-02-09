package lib;

import java.util.Calendar;

public class MathEx {

  public static void main(String[] args) {
    printMath(Math.PI);
    printMath(Math.ceil(3.14));
    printMath(Math.floor(3.14));
    printMath(Math.sqrt(9));
    printMath(Math.exp(2));
    printMath(Math.round(3.14));

    Calendar now = Calendar.getInstance(); // singleton 패턴.
    int year = now.get(Calendar.YEAR);
    int month = now.get(Calendar.MONTH) + 1;
    int day = now.get(Calendar.DAY_OF_WEEK);

    printInt(year + "." + month + "." + day);
  }

  public static void printMath(double txt) {
    System.out.println(txt);
  }

  public static void printInt(String txt) {
    System.out.println(txt);
  }
}
