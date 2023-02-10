import java.util.HashMap;
import java.util.Scanner;

class City {

  private String name;
  private int lat, lon;

  public City(String _name, int _lat, int _lon) {
    name = _name;
    lat = _lat;
    lon = _lon;
  }

  public String getName() {
    return name;
  }

  public int getlat() {
    return lat;
  }

  public int getlon() {
    return lon;
  }
}

public class Practice06 {

  public static void main(String[] args) {
    HashMap<String, City> cityMap = new HashMap<>();
    Scanner input = new Scanner(System.in);
    println("도시,경도,위도를 입력하시오...");
    for (int i = 0; i < 4; i++) {
      String str = input.nextLine();
      String[] strSplit = str.split(",");
      if (strSplit.length == 3) {
        String name = strSplit[0];
        int lat = Integer.parseInt(strSplit[1]);
        int lon = Integer.parseInt(strSplit[2]);
        cityMap.put(name, new City(name, lat, lon));
      } else {
        println("잘못된 형식이오..다시 입력하시오..");
      }
    }
    println("____________________________________");
    for (City item : cityMap.values()) {
      City city = item;
      println(city.getName() + "\t" + city.getlat() + "\t" + city.getlon());
    }
    println("____________________________________");
    while (true) {
      println("도시 이름을 입력하시오.. >>");
      String cityName = input.next();
      if (cityName.equals("그만")) {
        break;
      }
      City city = cityMap.get(cityName);
      println(city.getName() + "\t" + city.getlat() + "\t" + city.getlon());
    }
  }

  static void print(String txt) {
    System.out.print(txt);
  }

  static void println(String txt) {
    System.out.println(txt);
  }
}
