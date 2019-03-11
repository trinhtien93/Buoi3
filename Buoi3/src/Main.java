


//        ConNguoi c1 = new HocSinh();
//        ConNguoi c2 = new NhanVien();
//        updateInfo(c1);
//        updateInfo(c2);
//        c1.inThongTin();
//        System.out.println("===============");
//        c2.inThongTin();
//
//        int a = 4;
//        pow(a);
//        System.out.println("========: " + a);
//    }
//
//    static void pow(int a) {
//        a *= a;
//    }
//
//    static void updateInfo(ConNguoi c) {
//        Random rd = new Random();
//        String name = "";
//        for (int i = 0; i < 5; i++) {
//            int v = rd.nextInt(26) + 65;
//            name += (char) v;
//        }
//        c.nhap(name, rd.nextInt(100),
//                rd.nextInt(2) / 2 == 0, "Ha Noi");
//        boolean check = c instanceof HocSinh;
//        if (check) {
//            HocSinh hs = (HocSinh) c;
//            hs.diem = rd.nextInt(10);
//            hs.lop = "Android";
//        } else {
//            NhanVien nv = (NhanVien) c;
//            nv.luong = rd.nextInt(10000000) + 5000000;
//            nv.chucVu = "Truong phong";
//        }
//
//    }
//}
