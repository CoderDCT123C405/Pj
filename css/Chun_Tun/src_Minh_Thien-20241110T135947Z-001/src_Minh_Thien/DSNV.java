import java.io.*;
import java.util.*;
public class DSNV implements iQUANLY{
    private ArrayList<NHANVIEN> ds;
    Scanner inp = new Scanner(System.in);
    public DSNV(){
        ds = new ArrayList<>();
    }
    public DSNV(ArrayList<NHANVIEN> ds){
        this.ds=ds;
    }
    @Override public void them(){
        NHANVIEN newNhanvien = new NHANVIEN();
        int flag;
        String tempIdnv;
        do{ 
            flag=0;
            System.out.printf("\nNhap Id nhan vien: ");
            tempIdnv = inp.nextLine();
            for (NHANVIEN nhanvien:ds){
                if(nhanvien.getIdnv().equals(tempIdnv)){
                    flag=1;
                    System.out.println("Da co Id nhan vien trong danh sach.");
                    break;
                }
            }
        } while(flag==1);
        newNhanvien.setIdnv(tempIdnv);
        newNhanvien.nhap(true);
        ds.add(newNhanvien);
    }
    @Override public void capNhat(String tempIdnv){
        int flag=0;
        for (NHANVIEN nhanvien:ds){
            if (nhanvien.getIdnv().equals(tempIdnv)){
                int luachon;
                do{
                    System.out.printf("\n1. Can cuoc cong dan.\n2. Ten\n3. So dien thoai.\n4. Dia chi.\n5. Nam sinh.\nLua chon: ");
                    luachon = Integer.parseInt(inp.nextLine());
                } while(luachon<1 || luachon>5);
                switch(luachon){
                    case 1 ->{
                        System.out.printf("\nNhap CCCD: ");
                        String temp = inp.nextLine();
                        nhanvien.setCccd(temp);
                    }
                    case 2 ->{
                        System.out.printf("\nNhap ten: ");
                        String temp = inp.nextLine();
                        nhanvien.setTen(temp);
                    }
                    case 3 ->{
                        System.out.printf("\nNhap so dien thoai: ");
                        String temp = inp.nextLine();
                        nhanvien.setSdt(temp);
                    }
                    case 4 ->{
                        System.out.printf("\nNhap dia chi: ");
                        String temp = inp.nextLine();
                        nhanvien.setDiaChi(temp);
                    }
                    case 5 ->{
                        System.out.printf("\nNhap nam sinh: ");
                        int temp = Integer.parseInt(inp.nextLine());
                        nhanvien.setNamSinh(temp);
                    }
                }
                flag=1;
                break;
            }
        }
        if (flag==0) System.out.println("\nKhong co nhan vien can tim!!!");
    }

    @Override public void xoa(String Idnv){
        int flag=0;
        for (NHANVIEN nhanvien:ds){
            if (nhanvien.getIdnv().equals(Idnv)){
                ds.remove(nhanvien);
                flag=1;
                break;
            }
        }
        if (flag==0) System.out.println("\nKhong tim thay nhan vien!!");
    }

    @Override public void timKiem(String Idnv){
        int flag=0;
        for (NHANVIEN nhanvien:ds){
            if (nhanvien.getIdnv().equals(Idnv)){
                nhanvien.xuat();
                flag=1;
                break;
            }
        }
        if (flag==0) System.out.println("\nKhong tim thay nhan vien!!");
    }

    @Override public void hienThi(){
        for (NHANVIEN nhanvien:ds){
            System.out.println("Nhan vien:");
            nhanvien.xuat();
        }   
    }
    public void docFile(){
        try {
            BufferedReader input = new BufferedReader(new FileReader("File//dsnv.txt"));
            String line;
            while((line = input.readLine()) != null){
                String arr[] = line.split(",");
                String tempCccd = arr[0];
                String tempTen = arr[1];
                String tempSdt = arr[2];
                String tempDiaChi = arr[3];
                int tempNamSinh = Integer.parseInt(arr[4]);
                String tempIdnv = arr[5];
                int tempSoLuong = Integer.parseInt(arr[6]);
                NHANVIEN newNhanVien = new NHANVIEN(tempCccd,tempTen,tempSdt,tempDiaChi,tempNamSinh,tempIdnv,tempSoLuong);
                ds.add(newNhanVien);
            }
            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void luuFile(){
        try {
            FileWriter fw = new FileWriter("File//dsnv.txt");
            for (NHANVIEN nhanvien:ds){
                fw.write(nhanvien.getCccd() + "," + nhanvien.getTen() + "," + nhanvien.getSdt() + "," + nhanvien.getDiaChi() + "," + nhanvien.getNamSinh() + "," + nhanvien.getIdnv() + "," + nhanvien.getSL_Ban());
            }
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
