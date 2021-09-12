package Comman.Input;

import Comman.Enum.Message;
import Student.StudentModel;
import java.util.Scanner;

public class InputService {

  public Scanner scanner;

  public InputService() {
    scanner = new Scanner(System.in);
  }

  public int getInt() {
    return scanner.nextInt();
  }

  public String getString() {
    return scanner.nextLine();
  }

  public StudentModel getStudentInput() {
    StudentModel studentModel = new StudentModel();
    System.out.print("Enter Name : ");
    studentModel.setName(getString());
    System.out.print("Enter DOB : ");
    studentModel.setDob(getString());
    System.out.print("Enter contact number : ");
    studentModel.setContactNo(getString());
    System.out.print("Enter Father name : ");
    studentModel.setFatherName(getString());
    System.out.print("Enter Address : ");
    studentModel.setAddress(getString());
    return studentModel;
  }

}
