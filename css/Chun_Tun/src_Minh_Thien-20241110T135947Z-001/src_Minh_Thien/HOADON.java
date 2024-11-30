import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Scanner;

public class HOADON {
    Scanner sc = new Scanner(System.in);
    private LocalDate ThoiGian;
    private int MAHOADON;
    private double TONGTIEN;
    private int TONGSL;
    private String MAKH;
    private ArrayList<ChiTietHoaDon> dscthd = new ArrayList<>();
    public HOADON(){
        TONGSL = 0;
    }
    //Getter
    public int getMAHOADON() {
        return MAHOADON;
    }
    public void nhapchitiet(String ID,float Gia){
        ChiTietHoaDon cthd = new ChiTietHoaDon();
        cthd.nhap(ID, Gia);
        this.TONGSL +=  cthd.getSOLUONG();
        dscthd.add(cthd);
    }
    public String getMAKH() {
        return MAKH;
    }
    public int getTONGSL() {
        return TONGSL;
    }
    //Phương Thức
    public void nhapMAKH(String MaKH) {
        ThoiGian = LocalDate.now();
        this.MAKH = MaKH;
        System.out.print("Nhập mã hoá đơn: ");
        MAHOADON = sc.nextInt();
    }

    public void xuat() {
        System.out.println("======================================================");
        System.out.printf("|%10s|%10s|%10s|%10s|\n","San Pham","So Luong","Don gia","Thanh Tien");
        for (ChiTietHoaDon cthd : dscthd) {
            System.out.printf("|%10s|%10d|%10.2f|%10.2f|\n",cthd.getID(),cthd.getSOLUONG(),cthd.getGia(),cthd.getGia()*cthd.getSOLUONG());
        }
        System.out.println("Thoi Gian: " + ThoiGian);
        System.out.println("Ma hoa don: " + MAHOADON);
        System.out.println("Tong Tien: " + TONGTIEN);
    }
}

