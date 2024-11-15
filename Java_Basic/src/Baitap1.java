import java.util.Scanner;

public class Baitap1 {
    public static void main(String[] args) {

        int giaTienTro = 1000000;
        int giaTienDien = 3500;
        int giaTienNuoc = 30000;

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số tháng trọ:");
        int soThangTro = sc.nextInt();

        System.out.println("Nhập số điện sử dụng:");
        int soDienSuDung = sc.nextInt();

        System.out.println("Nhập số người dùng nước:");
        int soNguoiDungNuoc = sc.nextInt();


        //Tính tiền trọ:

        int tientro = soThangTro * giaTienTro;
        System.out.println("Tiền trọ la: " + tientro + "vnd");

        //Tính tien điện:

        int tienDien = 0;
        if (soDienSuDung > 0) {
            tienDien = soDienSuDung * giaTienDien;
        } else {
            System.out.println("Không sử dụng điện nên ko tốn phí");

        }

        System.out.println("Tiền điện la: " + tienDien + "vnd");


        //Tính tien nuoc:
        int tienNuoc = 0;
        if (soNguoiDungNuoc > 0) {
            tienNuoc = soNguoiDungNuoc * giaTienNuoc;
        } else {
            System.out.println("Khong dung nuoc nen ko ton phi");
        }

        System.out.println("Tiền nuoc la: " + tienNuoc + "vnd");


        int tongTienPhaiTra = tientro + tienDien + tienNuoc;

        System.out.println("Tong tien phai tra la: " + tongTienPhaiTra + "vnd");


    }


    }




