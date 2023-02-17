public class Ball {

  public int x, y;
  public int width, height, speedX, speedY, direction;
  public boolean moving = false;

  public Ball() {
    x = 0;
    y = 0;
    width = 10;
    height = 10;
    speedX = 0;
    speedY = 0;
  }

  public void shoot() {
    if (!moving) {
      speedY = 8;
      speedX = (int) Math.random() * 20 - 10;
      moving = true;
    }
  }

  public void move(Paddle _paddle) {
    if (moving) {
      x += speedX;
      y += speedY;

      if (x < 0 || x > 618) {
        speedX = -speedX;
      }
      if (y < 0 || y > 900) {
        speedY = -speedY;
      }

      if (
        (x + width > _paddle.x) &&
        (x < _paddle.x + _paddle.width) &&
        (y + height > _paddle.y) &&
        (y < _paddle.y + _paddle.height)
      ) {
        //충돌했다
        speedY = -speedY;
        speedX = (int) -(((_paddle.x + (_paddle.width / 2)) - x) * 10 / 45);
        System.out.println((_paddle.x + (_paddle.width / 2)) - x);
        System.out.println(((_paddle.x + (_paddle.width / 2)) - x) * 10 / 45);
        System.out.println(speedX);
      }
    }
  }

  public void checkCollision(Block _block[][]) {
    for (Block itemList[] : _block) {
      for (Block item : itemList) {
        if (
          (x < item.x + item.width) &&
          (x + width > item.x) &&
          (y < item.y + item.height) &&
          (y + height > item.y) &&
          !item.isHide
        ) {
          item.isHide = true;
          if (Math.abs(((item.x + (item.width / 2)) - x)) < 15) {
            speedX = -speedX;
            System.out.println(
              "측면 히트!" + Math.abs(((item.x + (item.width / 2)) - x))
            );
          }
          if (Math.abs(((item.y + (item.height / 2)) - y)) < 15) {
            speedY = -speedY;
            System.out.println(
              "상하면 히트!" + Math.abs(((item.y + (item.height / 2)) - y))
            );
          }
        }
      }
    }
  }
  // 차라리 for [i][j]를 써서 인접 블록이 살아있는지 체크하는건??
  // 모서리 맞았을 때 측면 판정이 뜬다. 근데 옆 블록이 살아있으면???

}
