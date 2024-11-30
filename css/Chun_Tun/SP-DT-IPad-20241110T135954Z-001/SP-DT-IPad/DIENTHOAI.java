public class DIENTHOAI extends SANPHAM {
    private boolean camUng;
    private int soLuong=0;
    public DIENTHOAI(){
        super();
        camUng=false;
        soLuong=0;
        loai="DienThoai";
    }
    public DIENTHOAI(String idSanPham,String hang, String model, float kichThuoc, float gia, float khoiLuong, int dungLuong, int ram, String chip, boolean camUng, int soLuong){
        super(idSanPham,hang, model, kichThuoc, gia, khoiLuong, dungLuong, ram, chip);
        this.camUng=camUng;
        this.soLuong=soLuong;
        loai="DienThoai";
    }
    public int SOLUONGDIENTHOAI(){
        return soLuong;
    }

    @Override public void nhap(String idSanPham){
        super.nhap(idSanPham);
        int luachon;
        do{
            System.out.printf("Cam ung (1. Co, 2. Khong): ");
            luachon = inp.nextInt();
        } while(luachon!=1 && luachon!= 2);
        if (luachon==1) camUng=true;
        else camUng=false; 
    }

    @Override public void xuat(){
        super.xuat();
        System.out.printf("\nCam ung: %s",(camUng ? "Co" : "Khong"));
        System.out.printf("\nSo luong: %d", soLuong);
    }

    void setcamUng(boolean camUng){
        this.camUng=camUng;
    }
    boolean getcamUng(){
        return camUng;
    }

    int getSoLuong(){
        return soLuong;
    }
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

}
