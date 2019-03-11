public class Main1 {
    public static void main(String[] args) {
        HinhTron ht = new HinhTron(4);
        ht.dienTich();
        ht.chuVi();
        ht.dienTichTamGiacVuong();


        System.out.println("==================");
        HinhVuong hv = new HinhVuong(4, 2);
        hv.chuVi();
        hv.dienTich();
        hv.duongCheo();
        hv.inThongTin();
        hv.chieuDai();
    }
}

