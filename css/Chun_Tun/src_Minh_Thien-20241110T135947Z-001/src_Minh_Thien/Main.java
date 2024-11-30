public class Main {
    public static void main(String[] args) {  
        DSHD dshd = new DSHD();
        DSSP dssp = new DSSP();
        DSKH dskh = new DSKH();
        DSNV dsnv = new DSNV();
        menu mn = new menu();
        mn.menuchinh(dshd,dskh,dsnv,dssp);
    }
}
