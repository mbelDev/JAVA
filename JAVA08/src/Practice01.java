import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Practice01 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    File file = new File("c:\\Kwon\\phone.txt");
    FileWriter fw = null;
    System.out.println("전화번호 입력 프로그램 입니다.");

    try {
      fw = new FileWriter(file);
      while (true) {
        System.out.print("이름 전화번호 >>");
        String line = input.nextLine();
        if (line.equals("그만")) {
          break;
        }
        fw.write(line + "\n");
      }
      fw.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
