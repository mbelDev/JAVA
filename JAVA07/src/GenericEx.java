class GenericClass<E> {

  private E element;

  public E getElement() {
    return this.element;
  }

  public void setElement(E _element) {
    this.element = _element;
  }
}

public class GenericEx {

  public static void main(String[] args) {
    GenericClass<String> a = new GenericClass<String>();
    GenericClass<Integer> b = new GenericClass<Integer>();
    a.setElement("나는 스트링");
    b.setElement(14);
  }

  static void print(String txt) {
    System.out.print(txt);
  }

  static void println(String txt) {
    System.out.println(txt);
  }
}
