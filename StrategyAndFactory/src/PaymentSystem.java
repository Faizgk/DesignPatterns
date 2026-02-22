public class PaymentSystem {


    PaymentStrategy paymentStrategy;

    PaymentSystem(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    void pay(){
        paymentStrategy.pay();
    }

}