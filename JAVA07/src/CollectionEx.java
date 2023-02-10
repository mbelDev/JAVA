import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionEx {

  public static void main(String[] args) {
    LinkedList<String> myList = new LinkedList<>();
    myList.add("김길환");
    myList.add("김남진");
    myList.add("김승효");

    int id = Collections.binarySearch(myList, "김길환");
    println(id + "");

    Iterator<String> iterator = myList.iterator();
    while (iterator.hasNext()) {
      String seperator;
      String element = iterator.next();
      if (iterator.hasNext()) {
        seperator = "=>";
      } else {
        seperator = "/n";
      }
      print(element + seperator);
    }
  }

  static void print(String txt) {
    System.out.print(txt);
  }

  static void println(String txt) {
    System.out.println(txt);
  }
}
