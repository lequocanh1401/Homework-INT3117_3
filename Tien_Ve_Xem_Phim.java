import java.util.InputMismatchException;
import java.util.Scanner;
public class Tien_Ve_Xem_Phim {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int gia_ve=100000;
        System.out.print("Vui lòng nhập tuổi của bạn: ");
        int tuoi = scanner.nextInt();
        if (tuoi < 0) {
            System.out.println("Input không hợp lệ");
            return; // kết thúc chương trình
        }

        System.out.print("Bạn có phải học sinh/sinh viên? true/false: ");
        boolean isStudent;

        try {
            isStudent = scanner.nextBoolean();
        } catch (InputMismatchException e) {
            System.out.println("Input không hợp lệ");
            return;
        }
        if(isStudent) gia_ve=90000;
        if(tuoi<12 || tuoi>=60) gia_ve=80000;
        System.out.println("Giá vé bạn phải trả là: "+gia_ve);
    }
}
