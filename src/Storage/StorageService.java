package Storage;

import Student.StudentModel;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class StorageService {

  final static String BASE_PATH = "src/Storage/dump/";
  final static String REGIS_FILE_NAME = BASE_PATH + "registration.txt";

  public boolean saveRegistrationDetails(StudentModel studentModel) {

    //creat file
    boolean isExist = createFile(REGIS_FILE_NAME);

    //read studentModelMap data
    if (isExist) {
      String data = studentModel.toString();
      //write in created file
      boolean isWritten = writeInFile(REGIS_FILE_NAME, data);
      if (isWritten) {
        return true;
      }
    }
    return false;
  }

  public Map<Integer, StudentModel> getAllRegistrationDetails() {
    Map<Integer, StudentModel> studentModelMap = new HashMap<>();
    boolean isExist = createFile(REGIS_FILE_NAME);
    if (isExist) {
      BufferedReader bufferedReader = getFileData(REGIS_FILE_NAME);
      try {
        String line;
        StudentModel studentModel = new StudentModel();
        while ((line = bufferedReader.readLine()) != null) {
          if (line.startsWith("id")) {
            studentModel.setId(Integer.valueOf(getValueFromLine(line)));
          } else if (line.startsWith("name")) {
            studentModel.setName(getValueFromLine(line));
          } else if (line.startsWith("dob")) {
            studentModel.setDob(getValueFromLine(line));
          } else if (line.startsWith("contactNo")) {
            studentModel.setContactNo(getValueFromLine(line));
          } else if (line.startsWith("fatherName")) {
            studentModel.setFatherName(getValueFromLine(line));
          } else if (line.startsWith("address")) {
            studentModel.setAddress(getValueFromLine(line));
          } else if (line.length() == 0 && studentModel.getId() > 0) {
            studentModelMap.put(studentModel.getId(), studentModel);
            studentModel = new StudentModel();
          }
        }
        if (studentModel.getId() > 0) {
          studentModelMap.put(studentModel.getId(), studentModel);
        }
      } catch (IOException e) {

      }
    }
    return studentModelMap;
  }

  private String getValueFromLine(String line) {
    if (line.length() > 0) {
      return line.substring(line.indexOf("='") + 2, line.length() - 1);
    }
    return null;
  }

  private BufferedReader getFileData(String fileName) {
    try {
      return new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
    } catch (Exception e) {
      System.out.println(e.getMessage());
      return null;
    }
  }

  private boolean writeInFile(String fileName, String data) {
    try {
      BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
      writer.write(data);
      writer.close();
    } catch (IOException e) {
      System.out.println(e.getMessage());
      return false;
    }
    return true;
  }


  private boolean createFile(String filename) {
    File file = new File(filename);
    try {
      file.createNewFile();
    } catch (IOException e) {
      System.out.println(e.getMessage());
      return false;
    }
    return true;
  }
}
