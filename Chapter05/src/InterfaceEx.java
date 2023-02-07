interface PhoneInterface {
  public abstract void sendCall();

  public abstract void receiveCall();

  public default void printLogo() {
    System.out.println("====x====");
  }
}

interface MobileInterface extends PhoneInterface {
  public abstract void sendSMS();

  public abstract void receiveSMS();
}

interface MP3Interface {
  public abstract void musicPlay();

  public abstract void musicStop();
}

class PDA {

  public int calc(int _x, int _y) {
    return _x + _y;
  }
}

class Samsung extends PDA implements MobileInterface, MP3Interface {

  public void sendCall() {
    System.out.println("전화, 전화를 건다.");
  }

  public void receiveCall() {
    System.out.println("전화, 전화가 왔다.");
  }

  public void sendSMS() {}

  public void receiveSMS() {}

  public void musicPlay() {}

  public void musicStop() {}

  public void special() {
    System.out.println("샘숭만의 특별한 기능");
  }
}

class LG implements PhoneInterface {

  public void sendCall() {
    System.out.println("전화, 전화를 건다.");
  }

  public void receiveCall() {
    System.out.println("전화, 전화가 왔다.");
  }

  public void special() {
    System.out.println(
      "굿 . 모 . 닝 . 빠빠빠 빠 빠 빠빠빠 빠 빠 굿 . 모 . 닝 ."
    );
  }
}

public class InterfaceEx {

  public static void main(String[] args) {
    Samsung samsung = new Samsung();
    samsung.sendCall();
    LG lg = new LG();
    lg.receiveCall();
  }
}
