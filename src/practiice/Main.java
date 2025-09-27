package practiice;

import java.time.LocalDate;

public class Main {

  public static void main(String[] args) {
    StudentUI studentUI = new StudentUI();
    studentUI.printStudentsByFaculty(Faculty.PHYSICS);
    studentUI.printStudentsByCourseAndFaculty();

  }
}

