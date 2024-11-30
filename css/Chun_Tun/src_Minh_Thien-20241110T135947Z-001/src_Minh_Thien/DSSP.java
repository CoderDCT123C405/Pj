import java.io.*;
import java.util.*;
public class DSSP implements iQUANLY{
    private ArrayList<SANPHAM> ds;
    Scanner inp = new Scanner(System.in);
    public DSSP(){
        ds = new ArrayList<>();
    }
    public DSSP(ArrayList<SANPHAM> ds){
        this.ds=ds;
    }
    public ArrayList<SANPHAM> getDs() {
        return ds;
    }
    @Override public void them(){
        SANPHAM newSanPham = new SANPHAM();
        int flag;
        String tempIdSanPham;
        do{ 
            flag=0;
            System.out.printf("\nNhap ID san pham: ");
            tempIdSanPham = inp.nextLine();
            for (SANPHAM sanpham:ds){
                if(sanpham.getIdSanPham().equals(tempIdSanPham)){
                    flag=1;
                    System.out.println("Da co ID san pham trong danh sach.");
                    break;
                }
            }
        } while(flag==1);
        newSanPham.nhap(tempIdSanPham);
        ds.add(newSanPham);
    }
    @Override public void capNhat(String tempIdSanPham){
        int flag=0;
        for (SANPHAM sanpham:ds){
            if (sanpham.getIdSanPham().equals(tempIdSanPham)){
                int luachon;
                do{
                    System.out.printf("\n1. Model.\n2. Kich thuoc\n3. Gia.\n4. Khoi luong.\n5. Dung luong.\n6. Ram.\n7. Chip\nLua chon: ");
                    luachon = Integer.parseInt(inp.nextLine());
                } while(luachon<1 || luachon>7);
                switch(luachon){
                    case 1 ->{
                        System.out.printf("\nNhap model: ");
                        String temp = inp.nextLine();
                        sanpham.setModel(temp);
                    }
                    case 2 ->{
                        System.out.printf("\nNhap kich thuoc: ");
                        float temp = inp.nextFloat();
                        sanpham.setKichThuoc(temp);
                    }
                    case 3 ->{
                        System.out.printf("\nNhap gia: ");
                        float temp = inp.nextFloat();
                        sanpham.setGia(temp);
                    }
                    case 4 ->{
                        System.out.printf("\nNhap khoi luong: ");
                        float temp = inp.nextFloat();
                        sanpham.setKhoiLuong(temp);
                    }
                    case 5 ->{
                        System.out.printf("\nNhap dung luong: ");
                        int temp = Integer.parseInt(inp.nextLine());
                        sanpham.setDungLuong(temp);
                    }
                    case 6 ->{
                        System.out.printf("\nNhap ram: ");
                        int temp = Integer.parseInt(inp.nextLine());
                        sanpham.setDungLuong(temp);
                    }
                    case 7 ->{
                        System.out.printf("\nNhap chip: ");
                        int temp = Integer.parseInt(inp.nextLine());
                        sanpham.setDungLuong(temp);
                    }
                }
                flag=1;
                break;
            }
        }
        if (flag==0) System.out.println("\nKhong co san pham can tim!!!");
    }

    @Override public void xoa(String idSanPham){
        int flag=0;
        for (SANPHAM sanpham:ds){
            if (sanpham.getIdSanPham().equals(idSanPham)){
                ds.remove(sanpham);
                flag=1;
                break;
            }
        }
        if (flag==0) System.out.println("\nKhong tim thay san pham!!");
    }

    @Override public void timKiem(String idSanPham){
        int flag=0;
        for (SANPHAM sanpham:ds){
            if (sanpham.getIdSanPham().equals(idSanPham)){
                sanpham.xuat();
                flag=1;
                break;
            }
        }
        if (flag==0) System.out.println("\nKhong tim thay san pham!!");
    }

    @Override public void hienThi(){
        for (SANPHAM sanpham:ds){
            System.out.println("San pham:");
            sanpham.xuat();
        }   
    }
    public void docFile(){
        try {
            BufferedReader input = new BufferedReader(new FileReader("File//DSSP.txt"));
            String line;
            while((line = input.readLine()) != null){
                String arr[] = line.split(",");
                String tempLoai = arr[0];
                String tempIdSanPham = arr[1];
                String tempHang = arr[2];
                String tempModel = arr[3];
                float tempKichThuoc = Float.parseFloat(arr[4]);
                float tempGia = Float.parseFloat(arr[5]);
                float tempKhoiLuong = Float.parseFloat(arr[6]);
                int tempDungLuong = Integer.parseInt(arr[7]);
                int tempRam = Integer.parseInt(arr[8]);
                String tempChip = arr[9];
                boolean tempCamUng = Boolean.parseBoolean(arr[10]);
                int tempSoLuong= Integer.parseInt(arr[11]);
                if(tempLoai.equals("DienThoai")){
                    DIENTHOAI newSanPham = new DIENTHOAI(tempIdSanPham,tempHang,tempModel,tempKichThuoc,tempGia,tempKhoiLuong,tempDungLuong,tempRam,tempChip, tempCamUng, tempSoLuong);
                    ds.add(newSanPham);
                }
                else{
                    TABLET newSanPham = new TABLET(tempIdSanPham,tempHang,tempModel,tempKichThuoc,tempGia,tempKhoiLuong,tempDungLuong,tempRam,tempChip, tempCamUng, tempSoLuong);
                    ds.add(newSanPham);
                }
            }
            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void luuFile(){
        try {
            FileWriter fw = new FileWriter("File//DSSP.txt");
            for (SANPHAM sanpham:ds){
                if(sanpham.getLoai().equals("DienThoai")){
                    DIENTHOAI obj = (DIENTHOAI)sanpham;
                    fw.write("DienThoai"+ "," + obj.getIdSanPham()  + "," + obj.getHang() + "," + obj.getModel() + "," + obj.getKichThuoc()
                 + "," + obj.getGia() + "," + obj.getKhoiLuong() + "," + obj.getDungLuong()
                  + "," + obj.getRam() + "," + obj.getChip()+ "," + obj.getcamUng());
                }
                else{
                    TABLET obj = (TABLET)sanpham;
                    fw.write("Tablet"+ "," + obj.getIdSanPham()  + "," + obj.getHang() + "," + obj.getModel() + "," + obj.getKichThuoc()
                 + "," + obj.getGia() + "," + obj.getKhoiLuong() + "," + obj.getDungLuong()
                  + "," + obj.getRam() + "," + obj.getChip()+ "," + obj.getBanPhim());
                }
            }
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
