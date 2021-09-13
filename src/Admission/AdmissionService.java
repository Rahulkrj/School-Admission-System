package Admission;

import Admission.Payment.PaymentFor;
import Admission.Payment.PaymentModel;
import Admission.Payment.PaymentService;
import Admission.Payment.PaymentStatus;
import Comman.Input.InputService;
import Registration.RegisterService;
import Student.StudentModel;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Rahul
 * @version 0.0.1-SNAPSHOT
 */
public class AdmissionService {

  private static int admissionId = 1;
  private static Map<Integer, AdmissionModel> admissionMap = new HashMap<>();
  private InputService inputService = new InputService();
  private PaymentService paymentService = new PaymentService();

  public void makeAdmission() {
    AdmissionModel admissionModel = inputService.getAdmissionInput();
    PaymentModel paymentModel = paymentService.makePayment(PaymentFor.ADMISSION);
    boolean payStatus = paymentService.pay(paymentModel);
    if (payStatus) {
      admissionModel.setPayment(paymentModel);
      boolean admissionStatus = saveAdmission(admissionModel);
      if (admissionStatus) {
        paymentModel.setRefId(admissionModel.getAdmissionId());
      }
    }
  }

  private boolean saveAdmission(AdmissionModel admissionModel) {
    admissionModel.setAdmissionId(admissionId);
    admissionMap.put(admissionId, admissionModel);
    admissionId++;
    return true;
  }

  public void getAllAdmissions() {
    Set<Integer> keySet = admissionMap.keySet();
    for (Integer key : keySet) {
      System.out.println(admissionMap.get(key));
    }
  }

}
