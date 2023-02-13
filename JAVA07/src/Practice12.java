import java.util.Scanner;
import java.util.Vector;

class Word {

  private String eng;
  private String kor;

  public Word(String _eng, String _kor) {
    eng = _eng;
    kor = _kor;
  }

  public String getEng() {
    return eng;
  }

  public String getKor() {
    return kor;
  }
}

class WordQuiz {

  private Vector<Word> vec = new Vector<>();

  public WordQuiz() {
    vec.add(new Word("love", "사랑"));
    vec.add(new Word("animal", "동물"));
    vec.add(new Word("emotion", "감정"));
    vec.add(new Word("human", "인간"));
    vec.add(new Word("stock", "주식"));
    vec.add(new Word("trade", "거래"));
    vec.add(new Word("society", "사회"));
    vec.add(new Word("baby", "아기"));
    vec.add(new Word("honey", "꿀"));
    vec.add(new Word("dall", "인형"));
    vec.add(new Word("bear", "곰"));
    vec.add(new Word("picture", "사진"));
    vec.add(new Word("painting", "그림"));
    vec.add(new Word("fault", "오류"));
    vec.add(new Word("example", "보기"));
    vec.add(new Word("eye", "눈"));
    vec.add(new Word("statue", "조각상"));
  }

  public String run() {
    //          int[] answerList = setTest(answer, word.size());
    Scanner inputQuiz = new Scanner(System.in);
    String result = "";
    int[] answerList = setRand(vec.size());
    int answer = answerList[(int) (Math.random() * 4)];
    Word thisWord = vec.get(answer);
    println(thisWord.getEng() + "?");
    for (int i = 0; i < 4; i++) {
      print("(" + (i + 1) + ")");
      Word fakeWord = vec.get(answerList[i]);
      print(fakeWord.getKor() + "  ");
    }
    while (!inputQuiz.hasNextInt()) {
      //Integer 가 입력되지 않으면 이하 반복.
      inputQuiz.next();
      System.out.println("숫자를 입력해 주세요");
    }
    int choiseTest = inputQuiz.nextInt();
    if (choiseTest == -1) {
      result = "break";
    } else if (choiseTest > 0 && choiseTest < 5) {
      //숫자가 1~4의 정수를 벗어나지 않을경우
      Word chooseWord = vec.get(answerList[choiseTest - 1]);
      if (chooseWord.getKor().equals(thisWord.getKor())) {
        result = "정답입니다!";
      } else {
        result = "안타깝습니다.";
      }
    } else {
      result = "보기의 숫자중에서 선택해 주세요. 새로운 문제를 제출합니다.";
    }
    return result;
  }

  //랜덤한 숫자 네 개를 넣어주는 함수
  static int[] setRand(int _max) {
    int[] newArray = new int[4];
    for (int item : newArray) {
      item = (int) (Math.random() * _max);
    }
    while (true) {
      int count = 0;
      for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
          if (newArray[i] == newArray[j] && i != j) {
            newArray[j] = (int) (Math.random() * _max);
            count++;
          }
        }
      }
      if (count == 0) {
        break;
      }
    }
    return newArray;
  }

  String addWord() {
    Scanner inputAdd = new Scanner(System.in);
    print("영어 한글 입력>>");
    String eng = inputAdd.next();
    if (eng.equals("그만")) {
      eng = "break";
      return eng;
    }
    if (eng.equals("보기")) {
      for (Word item : vec) {
        println(item.getEng() + " " + item.getKor());
      }
    }
    if (checkEngKor(eng) != "eng") {
      eng = "영어 단어를 입력해 주세요.";
      return eng;
    }
    String kor = inputAdd.next();
    if (checkEngKor(kor) != "kor") {
      eng = "한글 뜻을 입력해 주세요.";
      return eng;
    }
    for (Word item : vec) {
      if (eng.equals(item.getEng())) {
        eng =
          (eng + "는 이미 " + item.getKor() + "라는 뜻으로 등록되어 있습니다.");
        return eng;
      }
      if (kor.equals(item.getKor())) {
        eng =
          (
            item.getEng() +
            "라는 단어에 이미 " +
            kor +
            "라는 뜻이 등록되어 있습니다."
          );
        return eng;
      }
    }
    if (checkEngKor(eng) == "eng" && checkEngKor(kor) == "kor") {
      vec.add(new Word(eng, kor));
      eng = (eng + " " + kor + " 단어를 추가했습니다.");
    }
    return eng;
  }

  //입력한 단어가 영어인지 한글인지 판별하는 함수
  static String checkEngKor(String strTest) {
    String result = "error";
    for (int i = 0; i < strTest.length(); i++) {
      int index = strTest.charAt(i);
      if (index >= 65 && index <= 122) {
        result = "eng";
      } else if (index >= 122) {
        result = "kor";
      }
    }
    return result;
  }

  public int getSize() {
    return vec.size();
  }

  //print랑 println을 짧게 쓰려고 만든것
  public static void print(String txt) {
    System.out.print(txt);
  }

  public static void println(String txt) {
    System.out.println(txt);
  }
}

public class Practice12 {

  public static void main(String[] args) {
    println("*** 영어단어 테스트 프로그램 \"명품 영어\" 입니다. ***");
    WordQuiz quiz = new WordQuiz();
    int win = 0;
    int lose = 0;
    String play = "";
    Scanner input = new Scanner(System.in);
    while (true) {
      print("단어 테스트:1, 단어 삽입:2, 종료:3 >>");
      while (!input.hasNextInt()) {
        //Integer 가 입력되지 않으면 이하 반복.
        input.next();
        System.out.println("숫자를 입력해 주세요");
      }
      int choise = input.nextInt();

      if (choise == 3) {
        println("\"명품 영어\"를 종료합니다.");
        input.close();
        break;
      }

      if (choise == 1) {
        println(
          "현재 " +
          quiz.getSize() +
          "개의 영어단어가 들어 있습니다. -1을 입력하면 테스트를 종료합니다."
        );
        while (play != "break") {
          play = quiz.run();
          println(play);
        }
        play = "ready";
      }

      if (choise == 2) {
        println("영어 단어에 \"그만\"을 입력하시면 종료합니다.");
        while (play != "break") {
          play = quiz.addWord();
          println(play);
        }
        play = "ready";
      }
    }
  }

  //정답률을 표시해주는 함수
  static double rating(int _win, int _lose) {
    double rate = (double) _win / (_win + _lose);
    println("정답률 : " + rate);
    println("");
    return rate;
  }

  //print랑 println을 짧게 쓰려고 만든것
  public static void print(String txt) {
    System.out.print(txt);
  }

  public static void println(String txt) {
    System.out.println(txt);
  }
}
