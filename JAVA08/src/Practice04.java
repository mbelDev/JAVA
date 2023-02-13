import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Practice04 {

  public static void main(String[] args) {
    File file = new File("c:\\windows\\system.ini");
    try {
      Scanner scanner = new Scanner(new FileReader(file));
      int lineNum = 1;
      while (scanner.hasNextLine()) {
        System.out.printf("%4d", lineNum);
        System.out.println(": " + scanner.nextLine());
        lineNum++;
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
