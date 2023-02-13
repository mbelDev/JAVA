import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileTextCopyEx {

  public static void main(String[] args) {
    File src = new File("C:\\Windows\\Web\\Wallpaper\\Windows\\img0.jpg");
    File destination = new File("c:\\Kwon\\copy.jpg");
    int c;
    try {
      FileInputStream fi = new FileInputStream(src);
      FileOutputStream fo = new FileOutputStream(destination);
      byte buffer[] = new byte[1024 * 10];
      while ((c = fi.read()) != -1) {
        int n = fi.read(buffer);
        fo.write(buffer, 0, n);
      }
      fi.close();
      fo.close();
      System.out.println("image copy complate.");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
