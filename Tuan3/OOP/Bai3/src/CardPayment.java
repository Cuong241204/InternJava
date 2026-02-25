public class CardPayment implements PaymMethod{
    @Override
    public void pay(double amount){
        System.out.println("Thanh toán thẻ: " + amount);
    }
}
