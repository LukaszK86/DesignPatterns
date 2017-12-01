import DataTransferObject.Example2.StudentBusinessObject;
import DataTransferObject.Example2.StudentTransferObject;
import org.testng.annotations.Test;

public class DTOTest {

    @Test
    public void testDTO(){
        StudentBusinessObject studentBusinessObject = new StudentBusinessObject();

        //print all students
        for (StudentTransferObject student : studentBusinessObject.getAllStudents()) {
            System.out.println("Student: [RollNo : " + student.getRollNumber() + ", Name : " + student.getName() + " ]");
        }

        //update student
        StudentTransferObject student = studentBusinessObject.getAllStudents().get(0);
        student.setName("Michael");
        studentBusinessObject.updateStudent(student);

        //get the student
        student = studentBusinessObject.getStudent(0);
        System.out.println("Student: [RollNo : " + student.getRollNumber() + ", Name : " + student.getName() + " ]");
    }
    }

