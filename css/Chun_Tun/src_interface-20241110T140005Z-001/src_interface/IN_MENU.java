import java.util.Scanner;
public class IN_MENU {
    Scanner inp = new Scanner(System.in);
    int left=30;
    int luachon;
    int widthString=-50;
    public IN_MENU(){
        luachon=0;
    }
    public int menu(String string, boolean isDssp_Dskh_Dsnv) {
        do{
            System.out.printf("\n%"+left+"s%" + Math.abs(widthString) + "s|\n","|","=".repeat(Math.abs(widthString)));
            System.out.printf("%"+left+"s%" + widthString + "s|\n","|","1. Them " + string + ".");
            System.out.printf("%"+left+"s%" + widthString + "s|\n","|","2. Cap nhat " + string + ".");
            System.out.printf("%"+left+"s%" + widthString + "s|\n","|","3. Xoa " + string + ".");
            System.out.printf("%"+left+"s%" + widthString + "s|\n","|","4. Tim kiem " + string + ".");
            System.out.printf("%"+left+"s%" + widthString + "s|\n","|","5. Hien thi " + string + ".");
            System.out.printf("%"+left+"s%" + widthString + "s|\n","|","6. Doc danh sach " + string + ".");
            System.out.printf("%"+left+"s%" + widthString + "s|\n","|","7. Luu danh sach " + string + ".");
            System.out.printf("%"+left+"s%" + widthString + "s|\n","|","8. Sap xep danh sach "+ string +  " theo so luong.");
            System.out.printf("%"+left+"s%" + widthString + "s|\n","|","9. Sap xep danh sach " + string +" theo ten." );
            if (isDssp_Dskh_Dsnv)
            System.out.printf("%"+left+"s%" + widthString + "s|\n","|","10. Xuat "+ string +  " tiem nang.");
            System.out.printf("%"+left+"s%" + widthString + "s|\n","|","0. Thoat.");
            System.out.printf("%"+left+"s%30s|\n","|","=".repeat(Math.abs(widthString)));
            System.out.printf("Lua chon: ");
            luachon = Integer.parseInt(inp.nextLine());
        }while(luachon<0 || luachon >10 || (luachon==10 && !isDssp_Dskh_Dsnv));
        return luachon;
    }
}
