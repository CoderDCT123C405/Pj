import java.util.ArrayList;
import java.util.Scanner;

public class DSHD{
    Scanner sc = new Scanner(System.in);
    ArrayList<HOADON> dshd;
    public DSHD(){
        dshd = new ArrayList<>();
    }
    public void Them(String MaKH,HOADON newHD){
        newHD.nhap(MaKH);
        dshd.add(newHD);
    }
    public void ThemChiTiet(String MODEL,float Gia,HOADON newHD){
        newHD.nhapchitiet(MODEL, Gia);
    }    
    public void HienThi(){
        for(HOADON hd:dshd){
            System.out.println(hd);
        }
    }
    public void Tim(){
        int MAHOADON;
        System.out.print("Nhập Mã Hoá đơn muốn kiếm: ");
        MAHOADON = sc.nextInt();
        sc.nextLine();
        boolean found = false;
        for(HOADON hd:dshd){
            if(hd.getMAHOADON() == MAHOADON){
                System.out.println("Đã tìm thấy hoá đơn:");
                System.out.println(hd);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy hoá đơn với mã " + MAHOADON);
        }
    }
}
