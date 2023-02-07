public class Grade {

  private int math, science, english;

  public Grade() {
    math = 0;
    science = 0;
    english = 0;
  }

  public Grade(int _math, int _science, int _english) {
    math = _math;
    science = _science;
    english = _english;
  }

  public double average() {
    return (double) (math + science + english) / 3;
  }
}
