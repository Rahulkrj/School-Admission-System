package Comman.Menu;

import Admission.AdmissionService;
import ClassAllotment.ClassAllotmentService;
import Payment.PaymentService;
import Comman.Enum.Message;
import Comman.Input.InputService;
import Registration.RegisterService;

public class Menu {

  private RegisterService registerService = new RegisterService();
  private AdmissionService admissionService = new AdmissionService();
  private PaymentService paymentService = new PaymentService();
  private ClassAllotmentService classAllotmentService = new ClassAllotmentService();

  public Menu() {
    registerService.sync();
  }

  public void displayMenu() {
    String menu = "1.Register\n2.Admission\n3.Payment Detail\n4.Class Allot"
        + "\n5.View All Register Students\n6.View All Admissions\n7.View All Payments\n8.View Allotted Class\n0. Exit";
    System.out.println(menu);
    System.out.print("Choose One option  : ");
    menuHandel();
  }

  private void menuHandel() {
    InputService inputService = new InputService();
    switch (inputService.getInt()) {
      case 1:
        System.out.println("🤡🤡🤡🤡🤡🤡 Register 🤡🤡🤡🤡🤡🤡");
        registerService.registerStudent();
        displayMenu();
        break;

      case 2:
        System.out.println("🤡🤡🤡🤡🤡🤡 Admission 🤡🤡🤡🤡🤡🤡");
        admissionService.makeAdmission();
        displayMenu();
        break;

      case 3:
        System.out.println("Payment Detail");
        break;

      case 4:
        System.out.println("Class Allot");
        classAllotmentService.classAllot();
        displayMenu();
        break;
      case 5:
        System.out.println("All Register Students");
        registerService.getAllStudents();
        displayMenu();
        break;
      case 6:
        System.out.println("All Admissions");
        admissionService.getAllAdmissions();
        displayMenu();
        break;
      case 7:
        System.out.println("All Payments");
        paymentService.getAllPayments();
        displayMenu();
        break;
      case 8:
        System.out.println("All Allotted Class");
        classAllotmentService.getAllottedClass();
        displayMenu();
        break;
      case 0:
        System.exit(0);
        break;

      default:
        System.out.println(Message.INVALID_OPTION.value);
        displayMenu();
    }

  }

}
