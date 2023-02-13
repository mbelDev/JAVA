import java.io.FileWriter;
import java.util.Scanner;

public class FileWriterEx {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    FileWriter filewriter = null;
    try {
      filewriter = new FileWriter("C:\\Kwon\\korean.txt");
      while (true) {
        String line = input.nextLine();
        if (line.length() == 0) {
          break;
        }
        filewriter.write(line, 0, line.length());
        filewriter.write("\r\n", 0, 2);
      }
      filewriter.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
