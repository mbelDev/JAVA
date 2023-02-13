import java.io.FileOutputStream;

public class FileOutputIndexStreamEx {

  public static void main(String[] args) {
    byte b[] = { 4, 7, 3, 4, 2, -1 };
    try {
      FileOutputStream fout = new FileOutputStream("C:\\Kwon\\Output.txt");
      for (int i = 0; i < b.length; i++) {
        fout.write(b[i]);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
