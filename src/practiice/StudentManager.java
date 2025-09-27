package practiice;

import java.util.Arrays;

public class StudentManager {

  private Student[] students;
  private int count;

  public StudentManager(int capacity) {
    students = new Student[capacity];
    count = 0;
  }
  public StudentManager(Student[] students) {
    this.students = students;
  }

  public void addStudent(Student student) {
    if (count < students.length) {
      students[count++] = student;
    } else {
      System.out.println("Array is full");
    }
  }

    public Student [] getStudentsByFaculty(Faculty faculty) {
    Student [] studentsByFaculty = new Student [students.length];
  int index  = 0;
    for(Student student : students) {
      if (faculty.equals(student.getFaculty())) {
        studentsByFaculty[index] = student;
        index++;
      }
    }
    return Arrays.copyOf(studentsByFaculty, index);
  }

 public Student[][] getStudentsByFacultyAndCourse(){
    Faculty[] faculties = Faculty.values();
    Course[] courses = Course.values();
    Student[][] studentsByFacultyAndCourse = new Student[faculties.length*courses.length][];

 int index  = 0;
for(Faculty faculty : faculties) {
  for(Course course : courses) {
    Student [] temp = new Student[students.length];
    int index1  = 0;
    for(Student student : students) {
      if (faculty.equals(student.getFaculty()) && course.equals(student.getCourse())) {
        temp[index1] = student;

        index1++;
      }
    }
    studentsByFacultyAndCourse[index] = temp;
    index++;
  }
}
return Arrays.copyOf(studentsByFacultyAndCourse, studentsByFacultyAndCourse.length);
 }
 public Student [] getStudentsByCourse(Course course) {
   Student [] studentsByFaculty = new Student [students.length];
   int index  = 0;
   for(Student student : students) {
     if (course.equals(student.getFaculty())) {
       studentsByFaculty[index] = student;
       index++;
     }
   }
   return Arrays.copyOf(studentsByFaculty, index);
 }
  // 3. ��������, �� ���������� ���� �������� ����
  public void printStudentsBornAfter(int year) {
    System.out.println("Faculty students born after " + year + ":");
    for (int i = 0; i < count; i++) {
      if (students[i].getDateOfBirth().getYear() > year) {
        System.out.println(students[i]);
      }
    }
    System.out.println();
  }
}
