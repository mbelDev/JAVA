import java.io.File;
import java.io.FileReader;

public class Practice03 {

  public static void main(String[] args) {
    File file = new File("c:\\windows\\system.ini");
    FileReader fr;

    try {
      fr = new FileReader(file);
      int c;
      while ((c = fr.read()) != -1) {
        char d = (char) c;
        System.out.print(Character.toUpperCase(d));
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
