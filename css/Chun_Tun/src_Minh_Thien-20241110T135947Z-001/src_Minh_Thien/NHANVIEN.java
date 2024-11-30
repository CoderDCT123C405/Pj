import java.util.Scanner;
public class NHANVIEN extends NGUOI {
    private String idnv;
    private int SL_Ban;
    Scanner inp = new Scanner(System.in);
    public NHANVIEN(){
        super();
        idnv="";
        SL_Ban=0;
    }
    public NHANVIEN(String CCCD, String TEN, String SDT, String DIACHI, int NAMSINH, String idnv, int SL_Ban){
        super( CCCD, TEN, SDT, DIACHI, NAMSINH);
        this.idnv=idnv;
        this.SL_Ban=SL_Ban;
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
    @Override public void xuat(){
        super.xuat();
        System.out.printf("\nidnv: %5s\n",idnv);
    }
}
