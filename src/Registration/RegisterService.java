package Registration;

import Comman.Enum.Message;
import Comman.Input.InputService;
import Student.StudentModel;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RegisterService {

  private static int studentId = 1;
  private static Map<Integer, StudentModel> studentMap;
  private final InputService inputService;

  public RegisterService() {
    this.inputService = new InputService();

    if (studentMap == null) {
      studentMap = new HashMap<>();
    }
  }

  public void registerStudent() {
    StudentModel student = inputService.getStudentInput();
    boolean status = saveStudent(student);
    if (status) {
      System.out.println(Message.STUDENT_SAVED.value);
    }
  }

  private boolean saveStudent(StudentModel studentModel) {
    studentModel.setId(studentId);
    studentMap.put(studentId, studentModel);
    studentId++;
    return true;
  }

  public void getAllStudents() {
    Set<Integer> keySet = studentMap.keySet();
    for (Integer key : keySet) {
      System.out.println(studentMap.get(key));
    }
  }
}
