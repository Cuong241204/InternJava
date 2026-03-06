
public class Main {
    interface Sum{
        int sum(int a, int b);
    }
    public static void main(String[] args) {
        Sum tong = (a, b) -> a + b;
        System.out.println(tong.sum(3, 6));

    }
}