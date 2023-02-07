public class App {

  public static void main(String[] args) throws Exception {
    //upcasting test

    Person person;
    Student student = new Student("아스화리탈 마케로우");
    person = student;

    System.out.println(person.name);
    System.out.println(person.id);

    Person person02 = new Student("그리미 마케로우");
    Student student02 = (Student) person02;
  }
}
