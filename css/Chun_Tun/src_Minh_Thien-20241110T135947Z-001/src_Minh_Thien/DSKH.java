import java.util.*;
import java.io.*;

public class DSKH implements iQUANLY {
    private ArrayList<KHACHHANG> ds;
    Scanner sc = new Scanner(System.in);
    
    public DSKH() {
        this.ds = new ArrayList<>();
    }
    
    public DSKH(ArrayList<KHACHHANG> ds) {
        this.ds = ds;
    }
    
    @Override
    public void them() {
        KHACHHANG kh = new KHACHHANG();
        kh.nhap();
        boolean flag = false;
        for(KHACHHANG x : ds) {
            if(x.getIDKH().equals(kh.getIDKH())) {
                flag = true;
                break;
            }
        }
        if(flag) {
            System.out.println("Khach hang da ton tai trong danh sach");
        }
        else {
            ds.add(kh);
            System.out.println("Da them khach hang");
        }
    }
    
    @Override
    public void capNhat(String id) {
        if(ds.isEmpty()) {
            System.out.println("Khong co khach hang nao trong danh sach");
        }
        else {
            boolean found = false;
            for(KHACHHANG x : ds) {
                if(x.getIDKH().equals(id)) {
                    found = true;
                    System.out.println("Chon thuoc tinh de sua:");
                    System.out.println("1. Ten");
                    System.out.println("2. Sdt");
                    System.out.println("3. Dia chi");
                    System.out.println("4. Nam sinh");
                    System.out.println("5. So luong san pham da mua");
                    System.out.print("Nhap lua chon: ");
                    int chon = sc.nextInt();
                    sc.nextLine();
                    switch(chon) {
                        case 1:
                            System.out.print("Nhap ten moi: ");
                            String ten = sc.nextLine().trim();
                            x.setTen(ten);
                            break;
                        case 2:
                            System.out.println("Nhap so dien thoai moi: ");
                            String sdt = sc.nextLine().trim();
                            x.setSdt(sdt);
                            break;
                        case 3:
                            System.out.print("Nhap dia chi moi: ");
                            String diachi = sc.nextLine().trim();
                            x.setDiaChi(diachi);
                            break;
                        case 4:
                            System.out.print("Nhap nam sinh moi: ");
                            int sn = sc.nextInt();
                            sc.nextLine();
                            x.setNamSinh(sn);
                            break;
                        default:
                            System.out.println("Lua chon khong hop le");
                            break;
                    }
                    break;
                }
            }
            if(!found) {
                System.out.println("Khong tim thay khach hang");
            }
        }    
    }
    
    @Override
    public void xoa(String id) {
        if(ds.isEmpty()) {
            System.out.println("Khong co khach hang nao trong danh sach");
        }
        else {
            boolean found = false;
            for(KHACHHANG x : ds) {
                if(x.getIDKH().equals(id)) {
                    found = true;
                    ds.remove(x);
                    System.out.println("Da xoa thanh cong");
                    break;
                }
            }
            if(!found) {
                System.out.println("Khong tim thay khach hang");
            }
        }       
    }
    
    @Override
    public void timKiem(String id) {
        if(ds.isEmpty()) {
            System.out.println("Khong co khach hang nao trong danh sach");
        }
        else {
               for(KHACHHANG x : ds) {
                if(x.getIDKH().equals(id)) {
                    x.xuat();
                }
            }
            System.out.println("Khong tim thay khach hang");            
        }
    }
    
    @Override
    public void hienThi() {
        if(ds.isEmpty()) {
            System.out.println(ds.isEmpty());
            System.out.println("Khong co khach hang nao trong danh sach");
        }
        else {
            System.out.println("======================================================");
            System.out.printf("|%10s|%10s|%10s|\n","ID Khach Hang","Ten Khach Hang","So luong mua hang");
            for(KHACHHANG kh : ds) {
                kh.xuat();
            }
        }
    }
    
    public void docFile() {
        try {
            BufferedReader input = new BufferedReader(new FileReader("c:/Users/thien/Desktop/Code/Huong_doi_tuong/QLCHDT/DanhSachKhachHang.txt"));
            String line;
            while((line = input.readLine()) != null){
                String arr[] = line.split(",");
                if(arr.length == 7) {
                    String cccd =  arr[0];
                    String ten = arr[1];                    
                    String sdt = arr[2];
                    String diaChi = arr[3];
                    int namSinh = Integer.parseInt(arr[4]);          
                    String idKH = arr[5];
                    int slMua = Integer.parseInt(arr[6]);        
                    KHACHHANG kh = new KHACHHANG(cccd, ten, sdt, diaChi, namSinh, idKH, slMua);
                    ds.add(kh);
                }
            }
            input.close();
        }
        catch(IOException e) {
            System.out.println("Loi: " + e.getMessage());
        }
    }
    
    public void luuFile() {
        try {
            BufferedWriter output = new BufferedWriter(new FileWriter("DanhSachKhachHang.txt"));
            for(KHACHHANG kh : ds) {
                output.write(kh.getCccd() + "," + kh.getTen() + "," + kh.getSdt() + "," + kh.getDiaChi() + "," + kh.getNamSinh() + "," + kh.getIDKH() + "," + kh.getSLMua());
                output.newLine();
            }
            output.close();
        }
        catch(IOException e) {
            System.out.println("Loi: " + e.getMessage());
        }
    }
    public ArrayList<KHACHHANG> getDs() {
        return ds;
    }
}
