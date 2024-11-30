import java.util.Scanner;
public class MENU_DSNV{
    Scanner inp = new Scanner(System.in);
    public DSNV menu(DSNV dsnv){
        while (true) {
            int luachon;
            IN_MENU inmenu1 = new IN_MENU();
            luachon=inmenu1.menu("Nhan Vien", false);
            switch (luachon) {
                case 0 -> {
                    System.out.println("Thoat chuong trinh.");
                    return dsnv;
                }
                case 1 -> dsnv.them();
                case 2 ->{
                    System.out.printf("Nhap ID Nhan Vien: ");
                    String tempIdnv = inp.nextLine();
                    dsnv.capNhat( tempIdnv);
                }
                case 3 ->{
                    System.out.printf("Nhap ID Nhan Vien: ");
                    String tempIdnv = inp.nextLine();
                    dsnv.xoa(tempIdnv);
                }
                case 4 ->{
                    System.out.printf("Nhap ID Nhan Vien: ");
                    String tempIdnv = inp.nextLine();
                    dsnv.timKiem(tempIdnv);
                }
                case 5 -> dsnv.hienThi();
                case 6 -> dsnv.docFile();
                case 7 -> {
                    dsnv.luuFile();
                    return dsnv;
                }
                default -> System.out.println("Nhap sai, vui long nhap lai.");
            }
        }
    }
}
