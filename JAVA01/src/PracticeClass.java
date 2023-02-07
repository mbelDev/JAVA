public class PracticeClass {

  public static void main(String[] args) {
    System.out.println("뭐 어떡하라고");
    // Circle pizza = new Circle();
    // System.out.print(pizza.getArea());

    // Rectangle ddakZ = new Rectangle();
    // ddakZ.height = 30;
    // ddakZ.width = 30;
    // Rectangle book = new Rectangle(88, 32);
    // System.out.println(ddakZ.getRound() + " " + ddakZ.getArea());
    // System.out.println(book.getRound() + " " + book.getArea());
    Book note = new Book();
    Book magicBook = new Book("월드 이터");
    Book rapthody = new Book("폴라리스랩소디", "김영도");
    note.print();
    magicBook.print();
    rapthody.print();
    System.out.print(note.getTitle());
    note.setTitle("무적 캡틴 사우르스");
    System.out.print(note.getTitle());
  }
}

//생성자에는 타입을 붙이지 않는다.
//생성자는 여러개를 만들 수 있다. 메소드 오버로딩.
class Circle {

  public int radius = 5;
  public String name = "";

  public Circle() {
    System.out.print("나는Circle ");
  }

  public double getArea() {
    return radius * radius * 3.14;
  }
}

// class Rectangle {

//   int width = 0;
//   int height = 0;

//   public Rectangle() {
//     width = 10;
//     height = 10;
//   }

//   public Rectangle(int _width, int _height) {
//     width = _width;
//     height = _height;
//   }

//   double getArea() {
//     return width * height;
//   }

//   double getRound() {
//     return (width + height) * 2;
//   }
// }

class Book {

  private String title = "제목 미상의 마호가니 스태프";
  private String author = "작자 미상의 마호가니 스태프";

  public Book() {}

  public Book(String _title) {
    title = _title;
  }

  public Book(String _title, String _author) {
    title = _title;
    author = _author;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String _title) {
    title = _title;
  }

  void print() {
    System.out.println("title : " + title + " Author : " + author);
  }
}
