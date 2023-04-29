package IntroToJavaWs;
import java.util.Arrays;

public class Student {

  String name;
  int age;
  double gpa;
  String[] classes;
  int[] grades;

  public Student(
    String name,
    int age,
    double gpa,
    String[] classes,
    int[] grades
  ) {
    this.name = name;
    this.age = age;
    this.gpa = gpa;
    this.classes = classes;
    this.grades = grades;
  }

  public void iAm() {
    System.out.println("I am a student");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public double getGpa() {
    return gpa;
  }

  public void setGpa(double gpa) {
    this.gpa = gpa;
  }

  public String[] getClasses() {
    return classes;
  }

  public void setClasses(String[] classes) {
    this.classes = classes;
  }

  public int[] getGrades() {
    return grades;
  }

  public void setGrades(int[] grades) {
    this.grades = grades;
  }

  @Override
  public String toString() {
    return (
      "StudentObj [name=" +
      name +
      ", age=" +
      age +
      ", gpa=" +
      gpa +
      ", classes=" +
      Arrays.toString(classes) +
      ", grades=" +
      Arrays.toString(grades) +
      "]"
    );
  }
}
