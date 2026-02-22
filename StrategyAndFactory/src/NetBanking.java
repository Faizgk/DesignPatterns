public class NetBanking implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("paid using NetBanking");
    }
}
