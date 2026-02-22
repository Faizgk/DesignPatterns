public class UPI implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("Paid using UPI");
    }
}
