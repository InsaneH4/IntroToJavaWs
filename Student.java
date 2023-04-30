package IntroToJavaWs;

//Imports are like #include in C
//Here we import a class that lets us do stuff with arrays
import java.util.Arrays;

//Example of a simple class
//Classes are like blueprints for objects
//Specify the fields and methods that an object will have
//Objects are instances of a class

// This is the parent class
public class Student {

  // Fields (variables for object)
  String name;
  int age;
  double gpa;
  String[] classes;
  int[] grades;

  // Constructor (method that initializes object)
  public Student(
    String name,
    int age,
    double gpa,
    String[] classes,
    int[] grades
  ) {
    //Assign the fields to the parameters of the constructor
    this.name = name;
    this.age = age;
    this.gpa = gpa;
    this.classes = classes;
    this.grades = grades;
  }

  // Methods (functions for object)
  public void iAm() {
    System.out.println("I am a student");
  }

  // Getters and Setters (methods to access and change fields)
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

  //Returns a string representation of the object
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
