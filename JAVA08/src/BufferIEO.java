import java.io.BufferedOutputStream;
import java.io.FileReader;

public class BufferIEO {

  public static void main(String[] args) {
    FileReader fin = null;
    int c;
    try {
      fin = new FileReader("C:\\Kwon\\Output.txt");
      BufferedOutputStream out = new BufferedOutputStream(System.out, 6);
      while ((c = fin.read()) != -1) {
        out.write(c);
      }
      out.flush();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
