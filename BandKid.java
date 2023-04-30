package IntroToJavaWs;

public class BandKid extends Student {

  // Band kid inherits from Student
  // Every Band kid has an instrument
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

  // Get the Band Kid's Instrument
  public String getInstrument() {
    return instrument;
  }

  // Changes the Band Kid's Instrument
  public void setInstrument(String instrument) {
    this.instrument = instrument;
  }

// Get the Band Kid's Section
  public String getSection() {
    return section;
  }

  // Change the Band Kid's Section
  public void setSection(String section) {
    this.section = section;
  }

  @Override
  public String toString() {
    return (
      super.toString() + "\nInstrument: " + instrument + "\nSection: " + section
    );
  }
}
