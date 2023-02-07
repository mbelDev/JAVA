public class Song {

  private String title, artist, country, year;

  public Song() {
    title = "제목 미상";
    artist = "작자 미상";
    year = "년도 미상";
    country = "국적 미상";
  }

  public Song(String _title, String _artist, String _year, String _country) {
    title = _title;
    artist = _artist;
    year = _year;
    country = _country;
  }

  public void show() {
    System.out.println(
      year + "년 " + country + "국적의 " + artist + "가 부른 " + title
    );
  }
}
