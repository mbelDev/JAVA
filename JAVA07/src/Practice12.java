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

  public WordQuiz(Vector<Word> vec) {
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
}

public class Practice12 {

  public static void main(String[] args) {
    println("*** 영어단어 테스트 프로그램 \"명품 영어\" 입니다. ***");
    Vector<Word> word = new Vector<>();
    WordQuiz quiz = new WordQuiz(word);
    int win = 0;
    int lose = 0;
    double rate;
    Scanner input = new Scanner(System.in);
    while (true) {
      print("단어 테스트:1, 단어 삽입:2, 종료:3 >>");
      int choise = input.nextInt();
      if (choise == 3) {
        println("\"명품 영어\"를 종료합니다.");
        input.close();
        break;
      }
      if (choise == 1) {
        println(
          "현재 " +
          word.size() +
          "개의 영어단어가 들어 있습니다. -1을 입력하면 테스트를 종료합니다."
        );
        while (true) {
//          int[] answerList = setTest(answer, word.size());
          int[] answerList = setRand(word.size());
          int answer = answerList[(int) (Math.random()*3 + 1)];
          Word thisWord = word.get(answer);
          println(thisWord.getEng() + "?");
          for (int i = 0; i < 4; i++) {
            print("(" + (i + 1) + ")");
            Word fakeWord = word.get(answerList[i]);
            print(fakeWord.getKor() + "  ");
          }
          while (!input.hasNextInt()) {
            //Integer 가 입력되지 않으면 이하 반복.
            input.next();
            println("숫자를 입력해 주세요");
          }
          int choiseTest = input.nextInt();
          if (choiseTest == -1) {
            break;
          }
          if (choiseTest > 0 && choiseTest < 5) {
            //숫자가 1~4의 정수를 벗어나지 않을경우
            Word chooseWord = word.get(answerList[choiseTest - 1]);
            println(chooseWord.getKor() + "" + thisWord.getKor());
            if (chooseWord.getKor().equals(thisWord.getKor())) {
              println("정답입니다!");
              win++;
              rating(win, lose);
            } else {
              println("안타깝습니다.");
              lose++;
              rating(win, lose);
            }
          } else {
            println(
              "보기의 숫자중에서 선택해 주세요. 새로운 문제를 제출합니다."
            );
          }
        }
      }
      if (choise == 2) {
        println("영어 단어에 \"그만\"을 입력하시면 종료합니다.");
        while (true) {
          print("영어 한글 입력>>");
          String eng = input.next();
          if (eng.equals("그만")) {
            break;
          }
          if (checkEngKor(eng) != "eng") {
            println("영어 단어를 입력해 주세요.");
            continue;
          }
          String kor = input.next();
          if (checkEngKor(kor) != "kor") {
            println("한글 뜻을 입력해 주세요.");
            continue;
          }
          if (checkEngKor(eng) == "eng" && checkEngKor(kor) == "kor") {
            println(eng + " " + kor + " 단어를 추가했습니다.");
            word.add(new Word(eng, kor));
          }
        }
      }
    }
  }
  
  //랜덤한 숫자 네 개를 넣어주는 함수
  static int[] setRand(int _max) {
	  int[] newArray = new int[4];
	  for(int item : newArray) {
		  item = (int)(Math.random()*_max);
	  }
	  while(true) {
		  int count=0;
	  for(int i=0; i<4 ; i++) {
		  for(int j=0 ; j<4 ; j++) {
			  if (newArray[i] == newArray[j] && i != j) {
				  newArray[j] = (int)(Math.random()*_max);
				  count++
			  }
		  }
		  }
	  if (count == 0) {break;}
	  }
  }

  //문제풀이중 보기를 랜덤하게 배치해주는 함수
  static int[] setTest(int _answer, int _max) {
    int[] arrayReturn = new int[4];
    for (int item : arrayReturn) {
      item = (int) (Math.random() * _max);
    } //4개 숫자를 랜덤하게 배치

    while (true) {
      int count = 0;
      for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
          if (arrayReturn[j] == arrayReturn[i] && j != i) {
            arrayReturn[j] = (int) (Math.random() * _max);
            count++;
          }
        }
      }
      if (count == 0) {
        break;
      }
    } //중복된 숫자가 없게 섞어줌
    boolean checker = false;
    for (int item : arrayReturn) {
      if (checker == false) {
        checker = (item == _answer); //만들어진 숫자중 정답이 있는지 체크
      }
    }
    if (!checker) {
      int answer = (int) (Math.random() * 3 + 1);
      arrayReturn[answer] = _answer;
      //보기중 정답이 없으면 넷중 아무거나 하나를 정답으로 변경
    }
    return arrayReturn;
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

  //정답률을 표시해주는 함수
  static double rating(int _win, int _lose) {
    double rate = (double) _win / (_win + _lose);
    println("정답률 : " + rate);
    println("");
    return rate;
  }

  //print랑 println을 짧게 쓰려고 만든것
  static void print(String txt) {
    System.out.print(txt);
  }

  static void println(String txt) {
    System.out.println(txt);
  }
}
