import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class Practice10 {

  public static void main(String[] args) {
    File file = new File("c:\\Kwon\\phone.txt");
    try {
      Scanner phoneSc = new Scanner(new FileReader(file));
      Scanner input = new Scanner(System.in);
      int phoneCount = 0;
      HashMap<String, String> phoneMap = new HashMap<>();
      while (phoneSc.hasNextLine()) {
        String index = phoneSc.nextLine();
        String[] phonePutMap = index.split(" ");
        phoneMap.put(phonePutMap[0], phonePutMap[1]);
        phoneCount++;
      }
      System.out.println("총 " + phoneCount + "개의 전화번호를 찾았습니다.");
      while (true) {
        System.out.print("이름 >> ");
        String name = input.next();
        if (name.equals("그만")) {
          break;
        }
        if (name.equals("보기")) {
          phoneCount = 0;
          for (String key : phoneMap.keySet()) {
            phoneCount++;
            System.out.println(key + " " + phoneMap.get(key));
          }
        }
        if (phoneMap.get(name) == null) {
          System.out.println("찾으시는 이름이 없습니다.");
        } else {
          System.out.println(phoneMap.get(name));
        }
      }
      phoneSc.close();
      input.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
