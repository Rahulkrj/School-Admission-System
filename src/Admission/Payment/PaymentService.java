package Admission.Payment;

import Comman.Input.InputService;
import Student.StudentModel;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Rahul
 * @version 0.0.1-SNAPSHOT
 */
public class PaymentService {
  private static int paymentId = 1;
  private static final Map<Integer, PaymentModel> paymentMap = new HashMap<>();
  private final InputService inputService = new InputService();

  public PaymentModel makePayment(PaymentFor paymentFor){
    PaymentModel paymentModel = inputService.getPaymentInput();
    paymentModel.setPaymentFor(paymentFor);
    paymentModel.setPaymentStatus(PaymentStatus.AWAITED);
    return paymentModel;
  }

  public boolean pay(PaymentModel paymentModel){
    paymentModel.setPaymentId(paymentId);
    paymentMap.put(paymentId,paymentModel);
    paymentModel.setPaymentStatus(PaymentStatus.SUCCESS);
    paymentId++;
    return true;
  }

  public void getAllPayments() {
    Set<Integer> keySet = paymentMap.keySet();
    for (Integer key : keySet) {
      System.out.println(paymentMap.get(key));
    }
  }
}
