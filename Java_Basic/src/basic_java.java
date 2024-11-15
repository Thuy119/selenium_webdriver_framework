import java.sql.SQLOutput;
import java.util.Scanner;

public class basic_java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập tên của bạn: ");
        String name = sc.nextLine();

        System.out.println("Nhập tuổi của bạn: ");
        String old = sc.nextLine();

        System.out.println("Nhập đia chỉ của bạn: ");
        String address = sc.nextLine();

        System.out.println("Nhập điểm Toan của bạn: ");
        int math = 5;
        String space = " ";

        System.out.println("Thong tin cua ban la " + name + space + old +space+ address + space +math);

        if (math>5) {
            System.out.println("GOOD");
        } else {
            System.out.println("BAD");

        }
    }

    }

