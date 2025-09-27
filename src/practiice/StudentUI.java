package practiice;

import java.time.LocalDate;


public class StudentUI {


  Student[] students = {
      new Student("��������", "����", "��������",
          LocalDate.of(2000, 5, 12), "Kyiv", "+380501234567",
          Faculty.PHYSICS, Course.SECOND),
      new Student("��������", "�����", "���㳿���",
          LocalDate.of(2001, 8, 23), "Lviv", "+380671234567",
          Faculty.CHEMISTRY, Course.THIRD),
      new Student("���������", "�������", "��������",
          LocalDate.of(1999, 11, 30), "Odessa", "+380931234567",
          Faculty.PHYSICS, Course.THIRD),

      new Student("���������", "�����", "�����������",
          LocalDate.of(2002, 2, 15), "Kyiv", "+380501234568",
          Faculty.COMPUTER_SCIENCE, Course.FIRST),
      new Student("��������", "����", "�������",
          LocalDate.of(2000, 9, 1), "Lviv", "+380671234569",
          Faculty.MATHEMATICS, Course.SECOND),
      new Student("����������", "���������", "��������",
          LocalDate.of(1998, 12, 20), "Odessa", "+380931234570",
          Faculty.CHEMISTRY, Course.FIVE),
      new Student("������", "����", "���������",
          LocalDate.of(2001, 7, 12), "Kyiv", "+380501234571",
          Faculty.PHYSICS, Course.FIRST),
      new Student("�������", "����", "³�������",
          LocalDate.of(2003, 4, 30), "Lviv", "+380671234572",
          Faculty.COMPUTER_SCIENCE, Course.FIRST),
      new Student("�������", "�����", "�������������",
          LocalDate.of(2000, 11, 5), "Odessa", "+380931234573",
          Faculty.MATHEMATICS, Course.THIRD),
      new Student("�����", "������", "�������",
          LocalDate.of(2002, 6, 18), "Kyiv", "+380501234574",
          Faculty.CHEMISTRY, Course.SECOND),
      new Student("�������", "���������", "��������",
          LocalDate.of(2001, 3, 9), "Lviv", "+380671234575",
          Faculty.PHYSICS, Course.FOURTH),
      new Student("��������", "�����", "���������",
          LocalDate.of(1999, 10, 25), "Odessa", "+380931234576",
          Faculty.COMPUTER_SCIENCE, Course.THIRD),
      new Student("��������", "���", "��������",
          LocalDate.of(2000, 1, 12), "Kyiv", "+380501234577",
          Faculty.MATHEMATICS, Course.FIRST),
      new Student("���������", "�����", "���㳿���",
          LocalDate.of(2003, 5, 20), "Lviv", "+380671234578",
          Faculty.CHEMISTRY, Course.FIRST),
      new Student("�������", "³����", "�������������",
          LocalDate.of(1998, 7, 15), "Odessa", "+380931234579",
          Faculty.PHYSICS, Course.FIVE),
      new Student("������", "�������", "�������",
          LocalDate.of(2001, 8, 7), "Kyiv", "+380501234580",
          Faculty.MATHEMATICS, Course.THIRD),
      new Student("������", "������", "��������",
          LocalDate.of(2002, 12, 11), "Lviv", "+380671234581",
          Faculty.COMPUTER_SCIENCE, Course.SECOND),
      new Student("��������", "��������", "���㳿���",
          LocalDate.of(2000, 2, 28), "Odessa", "+380931234582",
          Faculty.CHEMISTRY, Course.THIRD),
      new Student("������", "�����", "�����������",
          LocalDate.of(2003, 9, 14), "Kyiv", "+380501234583",
          Faculty.PHYSICS, Course.FIRST),
      new Student("���������", "������", "��������",
          LocalDate.of(1999, 6, 3), "Lviv", "+380671234584",
          Faculty.MATHEMATICS, Course.FOURTH),
      new Student("���������", "�����", "��������",
          LocalDate.of(2001, 11, 19), "Odessa", "+380931234585",
          Faculty.COMPUTER_SCIENCE, Course.FOURTH),
      new Student("�����", "�����", "��������",
          LocalDate.of(2000, 8, 6), "Kyiv", "+380501234586",
          Faculty.CHEMISTRY, Course.FIVE),
      new Student("��������", "����", "���㳿���",
          LocalDate.of(2002, 3, 22), "Lviv", "+380671234587",
          Faculty.PHYSICS, Course.SECOND)
  };
  StudentManager studentManager = new StudentManager(students);
  public void printStudentsByFaculty(Faculty faculty) {
    Student[] students1 =studentManager.getStudentsByFaculty(faculty);
    for (Student student : students1) {
      System.out.println(student);
    }
  }
  public void printStudentsByCourseAndFaculty() {
    Student[][] students1 = studentManager.getStudentsByFacultyAndCourse();
    for (Student[] students2 : students1) {
      for (Student student : students2) {
        System.out.println(student);
      }
    }
  }
}
