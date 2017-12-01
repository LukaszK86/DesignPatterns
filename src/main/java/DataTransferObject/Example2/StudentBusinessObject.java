package DataTransferObject.Example2;

import java.util.ArrayList;
import java.util.List;

public class StudentBusinessObject {

    //database
    List<StudentTransferObject> students;

    public StudentBusinessObject(){
        students = new ArrayList<StudentTransferObject>();
        StudentTransferObject student1 = new StudentTransferObject("Robert",0);
        StudentTransferObject student2 = new StudentTransferObject("John",1);
        students.add(student1);
        students.add(student2);
    }

    public void deleteStudent(StudentTransferObject student) {
        students.remove(student.getRollNumber());
        System.out.println("Student: Roll Number " + student.getRollNumber() + ", deleted from database");
    }

    //retrive list of students from the database
    public List<StudentTransferObject> getAllStudents() {
        return students;
    }

    public StudentTransferObject getStudent(int rollNumber) {
        return students.get(rollNumber);
    }

    public void updateStudent(StudentTransferObject student) {
        students.get(student.getRollNumber()).setName(student.getName());
        System.out.println("Student: Roll No " + student.getRollNumber() +", updated in the database");
    }
}
