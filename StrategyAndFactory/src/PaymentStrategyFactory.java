public class PaymentStrategyFactory {

    public PaymentStrategy getPaymentStrategy(String type){
            if(type.equalsIgnoreCase("NetBanking")){
                return new NetBanking();
            } else if (type.equalsIgnoreCase("UPI")) {
                return new UPI();
            } else{
                return null;
            }

    }
}
