import java.io.File;

public class FileEx {

  public static void main(String[] args) {
    File file = new File("C:\\Wwindows\\System.ini");
    System.out.println(file.getPath());
    System.out.println(file.getParent());
    System.out.println(file.getName());

    if (file.isFile()) {
      System.out.println("파일입니다.");
    } else {
      System.out.println("디렉토리 입니다.");
    }

    File file02 = new File("c:\\Kwon\\java");
    if (!file02.exists()) {
      file02.mkdir();
    }

    File file03 = new File("c:\\Kwon");
    File subFiles[] = file03.listFiles();
    for (int i = 0; i < subFiles.length; i++) {
      File f = subFiles[i];
      System.out.print(f.getName());
      System.out.println(f.isFile() ? " 파일" : " 폴더");
    }
  }
}
