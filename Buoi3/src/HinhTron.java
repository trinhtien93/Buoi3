public class HinhTron extends HinhHoc {
    int Bankinh;
    double pi = 3.14;


    public HinhTron(int bankinh) {
        this.Bankinh = bankinh;
    }

    @Override
    void inThongTin() {
        System.out.println("Bankinh:" + Bankinh);
    }

    @Override
    void dienTich() {
        System.out.println("Dien tich hinh tron : " + Bankinh * Bankinh * pi);

    }

    @Override
    void chuVi() {
        System.out.println("Chu vi hinh tron : " + 2 * Bankinh * pi);
    }

    public void dienTichTamGiacVuong(){
        System.out.println("Dien tich tam giac vuong can noi tiep hinh tron:  "  + 2 * Bankinh * Bankinh);

    }
}




