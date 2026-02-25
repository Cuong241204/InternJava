public class MomoPayment implements PaymMethod{
    @Override
    public void pay(double amount){
        System.out.println("Thanh toán ví điện tử: " +amount);
    }
}
