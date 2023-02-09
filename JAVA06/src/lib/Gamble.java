package lib;

import java.util.Scanner;

public class Gamble {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    println("숫자 맞추기 대결! 몇 분이서 하시겠어요?");
    Player[] player = new Player[input.nextInt()];
    print(player.length + "명의 대결! ");
    for (int i = 0; i < player.length; i++) {
      println((i + 1) + "번 선수의 이름은?");
      player[i] = new Player(input.next());
    }
    int turn = 0;
    while (true) {
      if (turn < player.length) {
        if (player[turn].run()) {
          println("이겼습니다.");
          println(" ");
          println("이번 경기의 승자는 " + player[turn].getName() + "!!!!!!");
          break;
        } else {
          println("아쉽군요!");
          turn++;
        }
      } else {
        turn = 0;
      }
    }
  }

  static class Player {

    private int[] arrayResult = new int[3];
    private String name;
    Scanner enter = new Scanner(System.in);

    public Player(String _name) {
      name = _name;
    }

    public String getName() {
      return name;
    }

    public boolean run() {
      boolean result = true;
      print("[" + name + "] : >>Enter ");
      enter.nextLine();
      print("\t");
      for (int i = 0; i < arrayResult.length; i++) {
        arrayResult[i] = (int) (Math.random() * 3 + 1);
        print(arrayResult[i] + "  ");
        if (i > 0) {
          if (result == true) {
            result = (arrayResult[i] == arrayResult[i - 1]);
          }
        }
      }
      return result;
    }
  }

  static void print(String txt) {
    System.out.print(txt);
  }

  static void println(String txt) {
    System.out.println(txt);
  }
}
// private String choice(int input) {
//   switch (input) {
//     case 1:
//       return "가위";
//     case 2:
//       return "바위";
//     case 3:
//       return "보";
//     default:
//       return "무언가";
//   }
// }
