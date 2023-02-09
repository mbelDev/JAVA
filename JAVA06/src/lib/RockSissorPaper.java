package lib;

import java.util.Scanner;

public class RockSissorPaper {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // print("가위 바위 보를 하겠소... 그 전에 당신의 존함을 알고싶다오...");
    // print("이름을 입력 >>");
    // String name = input.next();
    // Player player = new Player("철수");
    // Computer computer = new Computer("콤퓨타");
    // println(
    //   player.getName() + "과" + computer.getName() + "의 가위 바위 보 승부!!"
    // );
    // boolean exit = false;
    // while (exit == false) {
    //   print(
    //     player.getName() + "의 차례입니다. 가위(1) 바위(2) 보(3) 그만두기(4) >>"
    //   );
    //   int yourAct = input.nextInt();
    //   if (yourAct == 4) {
    //     break;
    //   } else {
    //     player.act(yourAct);
    //     computer.turn();
    //   }
    //   println("");
    // }
    println("가위 바위 보 시합을 개최하겠소... 몇 분이서 하시겠소...?");
    int memNum = input.nextInt();
    Player[] player = new Player[memNum];
    for (int i = 0; i < memNum; i++) {
      print(i + "번 선수의 이름을 입력하시오.... >>");
      player[i] = new Player(input.next());
    }
    print("모든 선수가 정해졌소..");
    for (int i = 0; i < memNum; i++) {
      print(player[i] + "...");
    }
    println("");
    println("이상 " + memNum + "명의 선수가 시합을 시작하오...");
  }

  static void print(String txt) {
    System.out.print(txt);
  }

  static void println(String txt) {
    System.out.println(txt);
  }

  static class Pattern {

    public String name;
    Scanner inputAct = new Scanner(System.in);

    public void act(int input) {
      switch (input) {
        case 1:
          print("[" + name + "] 가위");
          break;
        case 2:
          print("[" + name + "] 바위");
          break;
        case 3:
          print("[" + name + "] 보");
          break;
        case 4:
          break;
        default:
          println("올바른 행동을 하시오..하시오..");
      }
    }
  }

  static class Player extends Pattern {

    public String name;
    private Object opponent;

    public Player(String _name) {
      name = _name;
      println("나는" + name + "!!");
    }

    public String getName() {
      return name;
    }

    public void turn() {
      print(name + "의 차례라오... 가위(1) 바위(2) 보(3) 그만두기(4) >>");
      int yourAct = inputAct.nextInt();
      act(yourAct);
    }

    public void setOppo(Computer _opponent) {
      opponent = _opponent;
    }
  }

  static class Computer extends Pattern {

    private String name;

    public Computer(String _name) {
      name = _name;
    }

    public String getName() {
      return name;
    }

    public void turn() {
      int comAct = (int) (Math.random() * 3 + 1);
      act(comAct);
    }
  }
}
