package IntroToJavaWs;
import java.util.LinkedList;

public class School {

  public static void main(String[] args) {
    LinkedList<Student> students = new LinkedList<Student>();
    students.add(
      new Student(
        "Sam",
        18,
        -4.0,
        new String[] {
          "Calculus 2",
          "Computer Science I",
          "Appreciation of Music",
          "Intro to Communication",
        },
        new int[] { 100, 100, 100, 100 }
      )
    );

    students.add(
      new BandKid(
        "Sean",
        16,
        3.5,
        new String[] { "Jazz", "Physics", "Calculus" },
        new int[] { 90, 88, 92 },
        "Saxophone",
        "Woodwind"
      )
    );

    students.add(
      new BandKid(
        "Alex",
        17,
        3.9,
        new String[] { "English", "Goegraphy", "Linear Algebra" },
        new int[] { 90, 88, 92 },
        "Trumpet",
        "Brass"
      )
    );

    students.add(
      new Student(
        "John",
        17,
        3.9,
        new String[] { "Art", "Chemistry", "Algebra" },
        new int[] { 90, 88, 92 }
      )
    );

    for (Student stu : students) {
      stu.iAm();
      System.out.println(stu);
      System.out.println();
    }
  }
}
