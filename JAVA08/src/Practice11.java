import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Vector;

class Words {

  private Vector<String> wordVec = new Vector<>();
  private File wordFile = new File("c:\\kwon\\words.txt");
  private FileReader fr;
  private Scanner reader;
  private Scanner input;

  public void readFile(Vector<String> wordVec, File wordFile) {
    wordVec = this.wordVec;
    try {
      fr = new FileReader(wordFile);
      reader = new Scanner(fr);
      int c = 0;
      while (reader.hasNextLine()) {
        String line = reader.nextLine();
        wordVec.add(line);
      }
      System.out.println("파일 읽기 완료..");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void searchFile(Vector<String> wordVec, String txt) {
    wordVec = this.wordVec;
    input = new Scanner(System.in);
    for (String item : wordVec) {
      if (item.equals("WORD")) {
        break;
      }
    }
  }
}

public class Practice11 {

  public static void main(String[] args) {
    Vector<String> wordlst = new Vector<String>();

    try {
      File file = new File("c:\\Kwon\\words.txt");
      Scanner readWord = new Scanner(new FileReader(file));
      while (readWord.hasNext()) {
        String line = readWord.nextLine();
        wordlst.add(line);
      }
      System.out.println(
        "프로젝트 폴더 밑의 " + file.getName() + " 파일을 읽었습니다...."
      );
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    Scanner scanner = new Scanner(System.in);
    int cnt = 0;
    while (true) {
      System.out.print("단어>> ");
      String Input = scanner.nextLine();
      if (Input.equals("그만")) {
        System.out.println("종료합니다....");

        break;
      }
      for (int i = 0; i < wordlst.size(); i++) {
        if (wordlst.get(i).startsWith(Input)) {
          System.out.println(wordlst.get(i));
          cnt += 1;
        }
      }
      if (cnt == 0) {
        System.out.println("발견할 수 없음");
      }
    }
    scanner.close();
  }
}
