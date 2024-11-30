import java.util.Scanner;

public abstract class NGUOI {
    private String cccd,ten,sdt,diaChi;
    private int namSinh, thuong;
    Scanner inp = new Scanner(System.in);
    
    public NGUOI(){
        cccd="";
        ten="";
        sdt="";
        diaChi="";
        namSinh=0;
        thuong=0;
    }
    
    public NGUOI(String cccd, String ten, String sdt, String diaChi, int namSinh,int thuong){
        this.cccd=cccd;
        this.ten=ten;
        this.sdt=sdt;
        this.diaChi=diaChi;
        this.namSinh=namSinh;
        this.thuong=thuong;
    }

    void setCccd(String cccd){
        this.cccd=cccd;
    }
    
    String getCccd(){
        return cccd;
    }
    
    void setTen(String ten){
        this.ten=ten;
    }
    
    String getTen(){
        return ten;
    }
    
    void setSdt(String sdt){
        this.sdt=sdt;
    }
    
    String getSdt(){
        return sdt;
    }
    
    void setDiaChi(String diaChi){
        this.diaChi=diaChi;
    }
    
    String getDiaChi(){
        return diaChi;
    }
    
    void setNamSinh(int namSinh){
        this.namSinh=namSinh;
    }
    
    int getNamSinh(){
        return namSinh;
    }
    
    public int getThuong() {
        return thuong;
    }
    
    public void setThuong(int thuong) {
        this.thuong = thuong;
    }
    
    public void nhap(){
        System.out.printf("\nNhap cccd: ");
        cccd=inp.nextLine();
        System.out.printf("ten: ");
        ten=inp.nextLine();
        System.out.printf("So dien thoai: ");
        sdt=inp.nextLine();
        System.out.printf("Dia chi: ");
        diaChi=inp.nextLine();
        System.out.printf("Nam sinh: ");
        namSinh=inp.nextInt();
    }
    
    public void xuat(){
        System.out.printf("\nCccd: %10s",cccd);
        System.out.printf("\nTen: %s",ten);
        System.out.printf("\nSdt: %10s",sdt);
        System.out.printf("\nDia chi: %s",diaChi);
        System.out.printf("\nNam sinh: %d",namSinh);
    }
    
    abstract public int tinhThuong();
}
