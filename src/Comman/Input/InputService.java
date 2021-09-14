package Comman.Input;

import Admission.AdmissionModel;
import Payment.PaymentMethod;
import Payment.PaymentModel;
import Comman.Enum.Message;
import Registration.RegisterService;
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

  public float getFloat() {
    return scanner.nextFloat();
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


  public AdmissionModel getAdmissionInput() {
    AdmissionModel admissionModel = new AdmissionModel();
    StudentModel student = findStudentInput();
    if (student == null) {
      System.out.println(Message.STUDENT_NOT_FOUND.value);
      findStudentInput();
    }
    admissionModel.setStudent(student);
    System.out.print("Enter Class : ");
    admissionModel.setStandard(getInt());
    scanner = new Scanner(System.in);
    System.out.print("Enter Stream : ");
    admissionModel.setStream(getString());
    return admissionModel;
  }

  public StudentModel findStudentInput() {
    RegisterService registerService = new RegisterService();
    System.out.print("Enter student id : ");
    return registerService.getStudent(getInt());
  }

  public PaymentModel getPaymentInput() {
    scanner = new Scanner(System.in);
    System.out.println("Enter payment details");
    PaymentModel paymentModel = new PaymentModel();
    System.out.print("Enter Amount : ");
    paymentModel.setAmount(getFloat());
    scanner = new Scanner(System.in);
    System.out.print(
        "Select Payment Method (" + PaymentMethod.CASH + ", " + PaymentMethod.CARD + ", "
            + PaymentMethod.CHEQUE + ", " + PaymentMethod.ONLINE + "): ");
    paymentModel.setPaymentMethod(PaymentMethod.valueOf(getString()));
    return paymentModel;
  }

}
