import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Practice07 {

  public static void main(String[] args) {
    File fileOrigin = new File("c:\\Kwon\\copy_copy.jpg");
    int count = 0;
    File fileCopy = new File("c:\\Kwon\\copy_copy_copy.jpg");
    System.out.println("copy.jpg를 copy_copy.jpg로 복사합니다.");
    try {
      FileReader fr = new FileReader(fileOrigin);
      FileWriter fw = new FileWriter(fileCopy);
      int c;
      while ((c = fr.read()) != -1) {
        fw.write(c);
        if (
          count <
          Math.round((double) fileCopy.length() * 10 / fileOrigin.length())
        ) {
          count++;
          System.out.print("*");
        }
      }
      fr.close();
      fw.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
