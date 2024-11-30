import java.util.Scanner;

public class MENU_DSKH{
    Scanner inp = new Scanner(System.in);
    public DSKH menu(DSKH dskh){
        while (true) {
            int luachon;
            IN_MENU inmenu1 = new IN_MENU();
            luachon=inmenu1.menu("Khach Hang", true);
            switch (luachon) {
                case 0 -> {
                    System.out.println("Thoat chuong trinh.");
                    return dskh;
                }
                case 1 -> dskh.them();
                case 2 ->{
                    System.out.printf("Nhap ID khach hang: ");
                    String tempIDkh = inp.nextLine();
                    dskh.capNhat(tempIDkh);
                }
                case 3 ->{
                    System.out.printf("Nhap ID khach hang: ");
                    String tempIDkh = inp.nextLine();
                    dskh.xoa(tempIDkh);
                }
                case 4 ->{
                    System.out.printf("Nhap ID khach hang: ");
                    String tempIDkh = inp.nextLine();
                    dskh.timKiem(tempIDkh);
                }
                case 5 -> dskh.hienThi();
                case 6 -> dskh.docFile();
                case 7 -> {
                    dskh.luuFile();
                    return dskh;
                }
                case 11->dskh.hienThi();
                default -> System.out.println("Nhap sai, vui long nhap lai.");
            }
        }
    } 
}
