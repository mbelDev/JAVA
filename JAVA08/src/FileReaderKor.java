import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class FileReaderKor {

  public static void main(String[] args) {
    InputStreamReader in = null;
    FileInputStream fin = null;
    try {
      fin = new FileInputStream("C:\\Kwon\\korean.txt");
      in = new InputStreamReader(fin, "MS949");
      int c;
      System.out.print(in.getEncoding());
      while ((c = in.read()) != -1) {
        System.out.print((char) c);
      }
    } catch (UnsupportedEncodingException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
