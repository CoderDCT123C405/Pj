import java.util.Scanner;
public class NHANVIEN extends NGUOI {
    private String idnv;
    private int SL_Ban,luong;
    Scanner inp = new Scanner(System.in);
    public NHANVIEN(){
        super();
        idnv="";
        SL_Ban=0;
        luong=0;
    }
    public NHANVIEN(String CCCD, String TEN, String SDT, String DIACHI, int NAMSINH, int tienThuong, String idnv, int SL_Ban,int luong){
        super( CCCD, TEN, SDT, DIACHI, NAMSINH,tienThuong);
        this.idnv=idnv;
        this.SL_Ban=SL_Ban;
        this.luong=luong;
    }
    void setIdnv(String idnv){
        this.idnv=idnv;
    }
    String getIdnv(){
        return idnv;
    }
    public void setSL_Ban(int SL_Ban) {
        this.SL_Ban = SL_Ban;
    }
    public int getSL_Ban() {
        return SL_Ban;
    }
    public void nhap(boolean coIdnv){
        super.nhap();
        if (!coIdnv){
            System.out.printf("Id nhan vien: ");
            idnv=inp.nextLine();
        }
    }
    public int getLuong() {
        return luong;
    }
    public void setLuong(int luong) {
        this.luong = luong;
    }
    @Override public void xuat(){
        super.xuat();
        System.out.printf("\nidnv: %5s\n",idnv);
    }
    // @Override public int tinhThuong(){
    //     int temp=0,soluong=20,tempSlban=SL_Ban;
    //     while (tempSlban>0){
    //         if (tempSlban>soluong){
    //             temp+=luong/10;
    //         }
    //         tempSlban-=soluong;
    //     }
    //     return temp;
    // }
}
