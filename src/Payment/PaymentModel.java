package Payment;

/**
 * @author Rahul
 * @version 0.0.1-SNAPSHOT
 */
public class PaymentModel {

  int paymentId;
  float amount;
  PaymentFor paymentFor;
  int refId;
  PaymentMethod paymentMethod;
  PaymentStatus paymentStatus;

  public PaymentModel() {
  }

  public int getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(int paymentId) {
    this.paymentId = paymentId;
  }

  public float getAmount() {
    return amount;
  }

  public void setAmount(float amount) {
    this.amount = amount;
  }

  public PaymentFor getPaymentFor() {
    return paymentFor;
  }

  public void setPaymentFor(PaymentFor paymentFor) {
    this.paymentFor = paymentFor;
  }

  public int getRefId() {
    return refId;
  }

  public void setRefId(int refId) {
    this.refId = refId;
  }

  public PaymentMethod getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public PaymentStatus getPaymentStatus() {
    return paymentStatus;
  }

  public void setPaymentStatus(PaymentStatus paymentStatus) {
    this.paymentStatus = paymentStatus;
  }

  @Override
  public String toString() {
    return "paymentId=" + paymentId +
        "\namount=" + amount +
        "\npaymentFor=" + paymentFor +
        "\nrefId=" + refId +
        "\npaymentMethod=" + paymentMethod +
        "\npaymentStatus=" + paymentStatus;
  }
}
