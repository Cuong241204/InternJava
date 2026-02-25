public class CashPayment implements PaymMethod{
    @Override
    public void pay(double amount){
        System.out.println("Thanh toán tiền mặt: " + amount);
    }
}
