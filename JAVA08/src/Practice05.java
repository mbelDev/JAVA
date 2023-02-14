import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Practice05 {

  public static void main(String[] args) {
    FileInputStream fileOrigin = null;
    FileInputStream fileCopy = null;
    FileOutputStream fout;
    Scanner input = new Scanner(System.in);

    System.out.println(
      "전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더 안에 있어야 합니다."
    );
    try {
      System.out.print("첫 번째 파일명을 입력하세요 >> ");
      String stringOrigin = input.next();
      fileOrigin = new FileInputStream(stringOrigin);
      System.out.print("두 번째 파일명을 입력하세요 >> ");
      String stringCopy = input.next();
      fileCopy = new FileInputStream(stringCopy);
      System.out.println(
        stringOrigin + "파일과 " + stringCopy + "파일의 비교를 실시합니다."
      );
      System.out.println();
      int read1 = 0;
      int read2 = 0;
      while (true) {
        read1 = fileOrigin.read();
        read2 = fileCopy.read();
        System.out.print("[" + read1 + " / " + read2 + "] ");
        if (read1 != read2) {
          System.out.println("불일치함당!!");
          break;
        }
        if (read1 == -1) {
          System.out.println("일치함당!!");
          break;
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    // finally {
    //   try {
    //     fout.close();
    //   } catch (IOException e) {
    //     e.printStackTrace();
    //   }
    //   try {
    //     fileOrigin.close();
    //     fileCopy.close();
    //   } catch (IOException e) {
    //     e.printStackTrace();
    //   }
    //   System.out.println("Cat done");
    // }
  }
}
