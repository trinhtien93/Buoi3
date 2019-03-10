public class SoNguyenTo {
    int n;

    public void nhapN(int soN){
        this.n = soN;
    }

    public boolean kiemTraSoNguyenTo(int soN){
        int dem = 0;
        for (int i = 1; i <= soN; i++){
            if (soN%i==0){
                dem = dem + 1;
            }
        }
        if (dem == 2){
            return true;
        } else {
            return false;
        }
    }

    public void timKiemSoNguyenTo(){
        for (int i = 0; i <= n; i++) {
            if (kiemTraSoNguyenTo(i) == true){
                System.out.print(", " + i);
            }
        }
    }

}
