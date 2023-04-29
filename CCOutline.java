package IntroToJavaWs;
public class CCOutline { // Showcase the outline of a class | Class: fields/constans, methods // Classes: Capitalized

  public static void addTwo(int a, int b) {
    int c = a + b;
    System.out.println(a + " + " + b + " = " + c);
  }

  public static void main(String[] args) { // Special methods: main
    // The simple print statement(s)

    System.out.println("====== Prints ======");
    System.out.println("Howdy Partner!");
    System.out.print("Guten ");
    System.out.print("Tag\n");
    System.out.println();

    // Variables
    System.out.println("====== Variables ======");
    String name = "Daniel";
    int age = 22;
    double deci = 12.9;
    char a = 'a';
    System.out.println(
      "Hello! Your name is " + name + " and you are " + age + " years old"
    );
    System.out.println();

    // If Statements
    if (age % 2 == 0) {
      System.out.println("Your age is even.");
    } else {
      System.out.println("Your age is odd.");
    }

    // Arrays
    System.out.println("====== Array & Loops ======");
    String[] coolKids = { "Alex", "Bob", "Cidny", "Daisy" };
    int[] ages = { 13, 17, 24, 31 };
    System.out.println();

    // Loops
    // For loops run a block of code and predetermined amount of times
    for (int kid = 0; kid < coolKids.length; kid++) {
      System.out.println(
        "Cool kid " +
        kid +
        " is " +
        coolKids[kid] +
        " and is " +
        ages[kid] +
        " years old"
      );
    }
    System.out.println();

    // While loops run a block of code until a condition is met.
    int num = 1;
    int mult = 1;
    boolean test = true;
    while (test) {
      num *= mult;

      if (num % 7 == 0) {
        System.out.println(num + " is divisible by 7");
        test = false;
      } else {
        System.out.println(num + " is not divisible by 7");
      }
      System.out.println();

      mult++;
    }

    // Methods
    System.out.println("====== Methods ======");
    addTwo(5, 7);

    System.out.println();
  }
}
