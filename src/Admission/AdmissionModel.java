package Admission;

import Admission.Payment.PaymentModel;
import Student.StudentModel;

/**
 * @author Rahul
 * @version 0.0.1-SNAPSHOT
 */
public class AdmissionModel {

  int admissionId;
  int standard;
  String stream;
  StudentModel student;
  PaymentModel payment;

  public AdmissionModel() {
  }

  public int getAdmissionId() {
    return admissionId;
  }

  public void setAdmissionId(int admissionId) {
    this.admissionId = admissionId;
  }

  public int getStandard() {
    return standard;
  }

  public void setStandard(int standard) {
    this.standard = standard;
  }

  public String getStream() {
    return stream;
  }

  public void setStream(String stream) {
    this.stream = stream;
  }

  public StudentModel getStudent() {
    return student;
  }

  public void setStudent(StudentModel student) {
    this.student = student;
  }

  public PaymentModel getPayment() {
    return payment;
  }

  public void setPayment(PaymentModel payment) {
    this.payment = payment;
  }

  @Override
  public String toString() {
    return "admissionId=" + admissionId +
        "\nstandard=" + standard +
        "\nstream='" + stream + '\'' +
        "\nstudent=" + student +
        "\npayment=" + payment;
  }
}
