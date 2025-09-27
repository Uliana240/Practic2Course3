package practiice;

import java.time.LocalDate;

public class Student {

  private final String firstName;
  private final String lastName;
  private final String middleName;
  private final LocalDate dateOfBirth;
  private final String address;
  private final String phoneNumber;
  private final Faculty faculty;
  private final Course course;


  public Student(String firstName, String lastName, String middleName, LocalDate dateOfBirth,
      String address, String phoneNumber, Faculty faculty, Course course) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.middleName = middleName;
    this.dateOfBirth = dateOfBirth;
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.faculty = faculty;
    this.course = course;
  }


  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getMiddleName() {
    return middleName;
  }



  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public String getAddress() {
    return address;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public Faculty getFaculty() {
    return faculty;
  }

  public Course getCourse() {
    return course;
  }

  @Override
  public String toString() {
    return lastName + " " + firstName + " " + middleName +
        ", " + faculty + " course " + course.getNumber() +
        ", Birthday: " + dateOfBirth;
  }
}
