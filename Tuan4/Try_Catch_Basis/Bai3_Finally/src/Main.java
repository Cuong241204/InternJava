public class Main {
    public static void main(String[] args) {
        try{
            System.out.println("Mở file thành công.");
            System.out.println("Đang trích xuất dữ liệu... ");

            int a = 10/0;
            System.out.println("Đã đọc xong dữ liệu: " + a);
        } catch(ArithmeticException e){
            System.out.println("Lỗi dữ liệu trong file" + e.getMessage());
        } finally{
            System.out.println("Đang đóng file...");
            System.out.println("Đóng tài nguyên");
        }

    }
}