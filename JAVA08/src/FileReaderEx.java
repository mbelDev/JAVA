import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderEx {

  public static void main(String[] args) {
    FileReader fio = null;
    try {
      fio = new FileReader("C:\\Windows\\system.ini");
      int c;
      c = fio.read();
      while ((c = fio.read()) != -1) {
        System.out.print((char) c);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
