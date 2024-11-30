/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
import java.util.Scanner;

public class KHACHHANG extends NGUOI {
    private String idkh;
    private int SL_Mua, giamGia;
    Scanner sc = new Scanner(System.in);
    
    public KHACHHANG() {
        idkh = "";
        SL_Mua = giamGia = 0;
    }
    
    public KHACHHANG(String cccd, String ten, String sdt, String diaChi, int namSinh, int thuong, String idkh, int SL_Mua, int giamGia) {
        super(cccd, ten, sdt, diaChi, namSinh, thuong);
        this.idkh = idkh;
        this.SL_Mua = SL_Mua;
        this.giamGia = giamGia;
    }
    
    public String getIdkh() {
        return idkh;
    }
    
    public int getSL_Mua() {
        return SL_Mua;
    }
    
    public void setSL_Mua(int SL_Mua) {
        this.SL_Mua +=  SL_Mua;
    }
    
    public int getGiamGia() {
        return giamGia;
    }
    
    public void setGiamGia(int giamGia) {
        this.giamGia = giamGia;
    }
    
    @Override
    public void nhap() {
        super.nhap();
        System.out.print("Nhap Id: ");
        idkh = sc.nextLine().trim();
    }
    
    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Id: " + idkh);
        System.out.println("So luong da mua: " + SL_Mua);
    }
    
    @Override
    public int tinhThuong() {
        int thuong = 0, tempMua = SL_Mua;
        while(tempMua > 0) {
            if(tempMua >= 10) {
                thuong += giamGia*10;
                tempMua -= 10;
            }
            else {
                thuong += giamGia * tempMua;
                tempMua = 0;
            }
        }
        return thuong;
    }
}
