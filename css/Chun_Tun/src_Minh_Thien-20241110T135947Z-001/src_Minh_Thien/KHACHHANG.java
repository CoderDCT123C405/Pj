import java.util.Scanner;

public class KHACHHANG extends NGUOI {
    private String IDKH;
    private int SL_Mua;
    Scanner sc = new Scanner(System.in);

    public KHACHHANG() {
        IDKH = "";
        SL_Mua = 0;
    }

    public KHACHHANG(String CCCD, String TEN, String SDT, String DIACHI, int NAMSINH, String IDKH, int SL_Mua) {
        super(CCCD, TEN, SDT, DIACHI, NAMSINH);
        this.IDKH = IDKH;
        this.SL_Mua = SL_Mua;
    }
    
    public String getIDKH() {
        return IDKH;
    }
    
    public int getSLMua() {
        return SL_Mua;
    }

    public void setSLMua(int SL_Mua) {
        this.SL_Mua += SL_Mua;
    }
    
    @Override
    public void nhap() {
        System.out.print("Nhap Id: ");
        IDKH = sc.nextLine().trim();
        super.nhap();
    }
    
    @Override
    public void xuat() {
        System.out.printf("|%13s|%14s|%17d|\n",IDKH,this.getTen(),SL_Mua);
    }
}
