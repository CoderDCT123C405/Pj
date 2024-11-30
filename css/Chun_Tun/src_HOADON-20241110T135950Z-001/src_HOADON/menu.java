//import java.util.ArrayList;
import java.util.Scanner;

public class menu {
    Scanner sc = new Scanner(System.in);
    //private ArrayList<DSHD> dshd = new ArrayList<>();
    public void TaoHD(){
        DSHD newHD = new DSHD();
        HOADON HD = new HOADON();
        newHD.Them("MAKH", HD);
        while (true){
            System.out.println("1.Thêm sản phẩm\n2.Thoát.");
            int choice = sc.nextInt();
            sc.nextLine();
            if(choice == 1){
                System.out.printf("Nhap MODEL: ");
                //String MODELtemp = sc.nextLine();
                if(choice == 1?true:false/*TIMKIEM*/){
                    newHD.ThemChiTiet("MODEL", 0,HD);
                }
                else{
                    System.out.println("Không có sản phẩm trong danh sách!!!");
                }
            }
            else if(choice == 2){
                System.out.println("Thoát chương trình.");
                return;
            }
        }
        //dshd.add(newHD);
    }
}
