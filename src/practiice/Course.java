package practiice;

public enum Course {
  FIRST(1),
  SECOND(2),
  THIRD(3),
  FOURTH(4),
  FIVE(5);

  private final int number;

  Course(int number) {
    this.number = number;
  }

  public int getNumber() {
    return number;
  }
}