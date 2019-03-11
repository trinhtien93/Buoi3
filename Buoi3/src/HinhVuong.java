public class HinhVuong extends HinhHoc {
    int Socanh;
    int Chieudaicanh;

    public HinhVuong(int Socanh, int Chieudaicanh) {
        this.Socanh = Socanh;
        this.Chieudaicanh = Chieudaicanh;
    }

    //    public HinhVuong(int socanh, int chieudaicanh) {
//        super();
//        this.Socanh = socanh;
//        this.Chieudaicanh = chieudaicanh;
//    }
    void inThongTin() {
        System.out.println("Socanh: " + Socanh);
        System.out.println("Chieudaicanh: " + Chieudaicanh);

    }

    @Override
    void chuVi() {
        System.out.println("Chu vi hinh vuong: " + Chieudaicanh * 4);
    }

    @Override
    void dienTich() {
        System.out.println("Dien tich hinh vuong: " + Chieudaicanh * Chieudaicanh);
    }

    void duongCheo() {
        System.out.println("Chieu dai duong cheo: " + Math.sqrt((Chieudaicanh * Chieudaicanh) + (Chieudaicanh * Chieudaicanh)));
    }

    void chieuDai() {
        double x = Math.sqrt((Chieudaicanh * Chieudaicanh) + (Chieudaicanh * Chieudaicanh));
        int y = Chieudaicanh * 4;
        double tong = (2 * x) + y;
        System.out.println("Tong chieu dai cac canh: " + tong);

    }


}



