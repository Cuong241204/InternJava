import service.StudentService;

public class Main {

    public static void main(String[] args) {

        StudentService dichVuSinhVien = new StudentService();
        System.out.println("TÌM SINH VIÊN THEO TÊN: ");
        dichVuSinhVien.findByName("An")
                .ifPresent(System.out::println);

        System.out.println("DANH SÁCH SINH VIÊN ĐIỂM CAO (>=8): ");
        dichVuSinhVien.getExcellentStudents()
                .forEach(System.out::println);

        System.out.println("DANH SÁCH TẤT CẢ TÊN SINH VIÊN: ");
        dichVuSinhVien.getAllNames()
                .forEach(System.out::println);

        System.out.println("SẮP XẾP THEO ĐIỂM GIẢM DẦN: ");
        dichVuSinhVien.sortByScoreDesc()
                .forEach(System.out::println);

        System.out.println("ĐIỂM TRUNG BÌNH:");
        System.out.println(dichVuSinhVien.averageScore());

        System.out.println("CÓ SINH VIÊN ĐIỂM 10 KHÔNG?");
        System.out.println(dichVuSinhVien.hasPerfectScore());

        System.out.println("NHÓM SINH VIÊN THEO TUỔI: ");

        dichVuSinhVien.groupByAge()
                .forEach((tuoi, danhSach) -> {
                    System.out.println("Tuổi: " + tuoi);
                    danhSach.forEach(System.out::println);
                });
    }
}