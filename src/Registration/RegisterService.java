package Registration;

import Comman.Enum.Message;
import Comman.Input.InputService;
import Storage.StorageService;
import Student.StudentModel;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RegisterService {

  private static int studentId = 0;
  private static Map<Integer, StudentModel> studentMap;
  private final InputService inputService;
  private final StorageService storageService;

  public RegisterService() {
    this.inputService = new InputService();
    this.storageService = new StorageService();

    if (studentMap == null) {
      studentMap = new HashMap<>();
    }
  }

  public void registerStudent() {
    StudentModel student = inputService.getStudentInput();
    boolean status = saveStudent(student);
    if (status) {
      System.out.println(Message.STUDENT_SAVED.value);
    } else {
      System.out.println(Message.STUDENT_NOT_SAVED.value);
    }
  }

  private boolean saveStudent(StudentModel studentModel) {
    studentModel.setId(studentId);
    boolean status = storageService.saveRegistrationDetails(studentModel);
    if (status) {
      studentMap.put(studentId, studentModel);
      studentId++;
      return true;
    }
    return false;
  }

  public void sync() {
    studentMap = storageService.getAllRegistrationDetails();
    for (int key : studentMap.keySet()) {
      studentId = Math.max(key, studentId);
    }
    studentId++;
  }

  public StudentModel getStudent(int studentId) {
    return studentMap.get(studentId);
  }

  public void getAllStudents() {
    Set<Integer> keySet = studentMap.keySet();
    for (Integer key : keySet) {
      System.out.println(studentMap.get(key));
    }
  }
}
