abstract class PairMap {

  protected String keyArray[];
  protected String ValueArray[];

  abstract String get(String key);

  abstract void put(String key, String value);

  abstract String delete(String key);

  abstract int length();
}

class Dictionary extends PairMap {

  int maxLength, length = 0;
  String[] keyArray;
  String[] valueArray;

  public Dictionary(int _maxLength) {
    super();
    keyArray = new String[_maxLength];
    valueArray = new String[_maxLength];
  }

  public String get(String key) {
    String result = "null";
    for (int i = 0; i < keyArray.length; i++) {
      if (keyArray[i] == key) {
        result = valueArray[i];
      }
    }
    return result;
  }

  public void put(String key, String value) {
    boolean empty = true;
    if (length < maxLength) {
      for (int i = 0; i < keyArray.length; i++) {
        if (keyArray[i] == key) {
          valueArray[i] = value;
          empty = false;
        }
      }
      if (empty == true) {
        keyArray[length] = key;
        valueArray[length] = value;
        length++;
      }
    } else {
      System.out.println("스택 오버");
    }
  }

  public String delete(String key) {
    String result = "null";
    for (int i = 0; i < keyArray.length; i++) {
      if (keyArray[i] == key) {
        result = valueArray[i];
        keyArray[i] = null;
        valueArray[i] = null;
      }
    }
    return result;
  }

  public int length() {
    return length;
  }
}

public class DictionaryApp {

  public static void main(String[] args) {
    {
      Dictionary dic = new Dictionary(10);
      dic.put("황기태", "자바");
      dic.put("이재문", "파이썬");
      dic.put("이재문", "C++");
      System.out.println("이재문의 값은" + dic.get("이재문"));
      System.out.println("황기태의 값은" + dic.get("황기태"));
      dic.delete("황기태");
      System.out.println("황기태의 값은" + dic.get("황기태"));
    }
  }
}
