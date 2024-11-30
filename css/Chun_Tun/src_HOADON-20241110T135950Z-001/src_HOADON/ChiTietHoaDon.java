import java.util.Scanner;

public class ChiTietHoaDon {
    Scanner sc = new Scanner(System.in);
    private int SOLUONG;
    private String MODEL;
    private float Gia;
    //Constructor
    public ChiTietHoaDon(){
        SOLUONG = 0;
        Gia = 0;
        MODEL ="";
    }
    public ChiTietHoaDon(int SOLUONG,String MODEL,float Gia){
        this.SOLUONG = SOLUONG;
        this.MODEL = MODEL;
        this.Gia = Gia;
    }

    //Getter
    public int getSOLUONG() {
        return SOLUONG;
    }
    public String getMODEL() {
        return MODEL;
    }
    public float getGia() {
        return Gia;
    }
    //setter
    public void setSOLUONG(int sOLUONG) {
        SOLUONG = sOLUONG;
    }
    public void setMODEL(String mODEL) {
        MODEL = mODEL;
    }
    public void setGia(float gia) {
        Gia = gia;
    }
    //Phương thức
    public void nhap(String MODEL,float Gia){
        this.MODEL = MODEL;
        this.Gia = Gia;
        System.out.print("Nhập số lượng: ");
        SOLUONG = sc.nextInt();
    }
}
