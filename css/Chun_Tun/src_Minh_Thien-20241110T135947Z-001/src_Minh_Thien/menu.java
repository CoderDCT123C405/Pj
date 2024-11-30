import java.util.Scanner;

public class menu {
    Scanner sc = new Scanner(System.in);
    public void TaoHD(DSHD dshd,DSKH dskh,DSNV dsnv,DSSP dssp){
        HOADON HD = new HOADON();
        System.out.print("Nhap Ma Khach Hang: ");
        String temp = sc.nextLine();
        for(KHACHHANG kh:dskh.getDs()){
            if(kh.getIDKH().equals(temp)){
                dshd.Them(temp, HD);
                while (true){
                    System.out.println("1.Thêm sản phẩm\n2.Thoát.");
                    int choice = sc.nextInt();
                    sc.nextLine();
                    if(choice == 1){
                        System.out.printf("Nhap ID san pham: ");
                        String IDsptemp = sc.nextLine();
                        for(SANPHAM sp:dssp.getDs()){
                            if(sp.getIdSanPham().equals(IDsptemp)){
                                dshd.ThemChiTiet(IDsptemp,sp.getGia(), HD);
                            }
                            else{
                                System.out.println("Không có sản phẩm trong danh sách!!!");
                            }
                        }
                    }
                    else if(choice == 2){
                        dshd.LuuHD(HD);
                        System.out.println("Thoát chương trình.");
                        return;
                    }
                }
            }
        }
    }
    public void menuchinh(DSHD dshd,DSKH dskh,DSNV dsnv,DSSP dssp){
        while (true) {
            System.out.println("1. Quan Ly San Pham.\n2. Quan Ly Khach Hang.\n3. Quan Ly Nhan Vien.\n4. Quan Ly Hoa Don.\nNhap lua chon: ");
            int choice  = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1->{
                    MENU_DSSP menu_DSSP = new MENU_DSSP();
                    dssp=menu_DSSP.menu(dssp);
                }
                case 2->{
                    MENU_DSKH menu_DSKH = new MENU_DSKH();
                    dskh=menu_DSKH.menu(dskh);
                }
                case 3->{
                    MENU_DSNV menu_DSNV = new MENU_DSNV();
                    dsnv=menu_DSNV.menu(dsnv);
                }
                case 4->{
                    TaoHD(dshd,dskh,dsnv,dssp);
                }
                default->{
                    System.out.println("Lua chon khong hop le!!");
                    return;
                }
            }
        }
    }
}
