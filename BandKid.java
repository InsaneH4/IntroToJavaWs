package IntroToJavaWs;
public class BandKid extends Student {

  String instrument;
  String section;

  public BandKid(
    String name,
    int age,
    double gpa,
    String[] classes,
    int[] grades,
    String instrument,
    String section
  ) {
    super(name, age, gpa, classes, grades);
    this.instrument = instrument;
    this.section = section;
  }

  @Override
  public void iAm() {
    super.iAm();    
    System.out.println("I am also a band kid");
  }

  public void play() {
    System.out.println(
      "The band kid is playing their " +
      instrument +
      " out of is tune but trying very hard"
    );
  }

  public String getInstrument() {
    return instrument;
  }

  public void setInstrument(String instrument) {
    this.instrument = instrument;
  }

  public String getSection() {
    return section;
  }

  public void setSection(String section) {
    this.section = section;
  }

  @Override
  public String toString() {
    return super.toString() +
      "\nInstrument: " +
      instrument +
      "\nSection: " +
      section;
  }
}
