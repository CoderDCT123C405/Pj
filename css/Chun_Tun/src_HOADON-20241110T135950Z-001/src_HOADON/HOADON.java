//import java.util.ArrayList;
//import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class HOADON {
    Scanner sc = new Scanner(System.in);
    private String ThoiGian;
    private int MAHOADON;
    private double TONGTIEN;
    private String MAKH;
    private ArrayList<ChiTietHoaDon> dscthd = new ArrayList<>();
    //Getter
    public int getMAHOADON() {
        return MAHOADON;
    }
    public void nhapchitiet(String MODEL,float Gia){
        ChiTietHoaDon cthd = new ChiTietHoaDon();
        cthd.nhap(MODEL, Gia);
        dscthd.add(cthd);
    }
    public String getMAKH() {
        return MAKH;
    }
    //Phương Thức
    public void nhap(String MaKH) {
        //LocalDate ThoiGian = LocalDate.now();
        this.MAKH = MaKH;
        System.out.print("Nhập mã hoá đơn: ");
        MAHOADON = sc.nextInt();
    }

    public void xuat() {
        System.out.println("======================================================");
        System.out.printf("|%10s|%10s|%10s|%10s|\n","Sản Phẩm","Số Lượng","Đơn Giá","Thành Tiền");
        /*for (ChiTietHoaDon cthd : dscthd) {
            System.out.printf("|%10s|%10d|%10.2f|%10.2f|\n,cthd.getMODEL,cthd.getSOLUONG,cthd.getGia,cthd.cthd.getGia()*cthd.getSOLUONG()");
        }*/
        System.out.println("Thời gian: " + ThoiGian);
        System.out.println("Mã hóa đơn: " + MAHOADON);
        System.out.println("Tổng tiền: " + TONGTIEN);
    }
}

