import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
    static Scanner sc = new Scanner(System.in);
    public static int n;
    public static boolean check = false;

    public static void main(String[] args) {
        ArrayList<NhanVien> NV = new ArrayList<NhanVien>();
        ArrayList<CongNhan> CN = new ArrayList<CongNhan>();
        ArrayList<KySu> KS = new ArrayList<KySu>();
        int so;
        do {
            System.out.println("\t\t\t  MENU");
            System.out.println("--------------------------------");
            System.out.println("1. Nhập thông tin cán bộ");
            System.out.println("2. Hiển thị danh sách các cán bộ");
            System.out.println("3. Xoá 1 cán bộ theo id");
            System.out.println("4. Tìm kiếm 1 cán bộ theo id");
            System.out.println("5. Dừng chương trình");
            System.out.print("   Nhập lựa chọn: ");
            so = sc.nextInt();
            System.out.println();
            switch (so)
            {
                case 1: {
                    input(NV, CN, KS);
                    break;
                }
                case 2: {
                    display(NV, CN, KS);
                    break;
                }
                case 3: {
                    delete(NV, CN, KS);
                    break;
                }
                case 4: {
                    find(NV, CN, KS);
                    break;
                }
                case 5: {
                    System.out.println("      XIN CẢM ƠN!");
                    return;
                }
                default: {
                    System.out.println("Chức năng không sẵn có!!");
                    break;
                }
            }
        } while (1>0);
    }

    public static void input(ArrayList<NhanVien> NV, ArrayList<CongNhan> CN, ArrayList<KySu> KS)
    {
        int so;
        boolean check = false;
        System.out.println("NHẬP THÔNG TIN CÁN BỘ");
        System.out.println("---------------------");
        do {
            System.out.println("1. Nhập nhân viên");
            System.out.println("2. Nhập công nhân");
            System.out.println("3. Nhập kỹ sư");
            System.out.print("   Lựa chọn: ");
            so = sc.nextInt();
            switch (so)
            {
                case 1: {
                    System.out.println("  Thông tin nhân viên");
                    NhanVien nv = new NhanVien();
                    nv.inputnv();
                    NV.add(nv);
                    check = true;
                    break;
                }
                case 2: {
                    System.out.println("  Thông tin công nhân");
                    CongNhan cn = new CongNhan();
                    cn.inputcn();
                    CN.add(cn);
                    check = true;
                    break;
                }
                case 3: {
                    System.out.println("  Thông tin kỹ sư");
                    KySu ks = new KySu();
                    ks.inputks();
                    KS.add(ks);
                    check = true;
                    break;
                }
                default: {
                    System.out.println("Chức năng không sẵn có!!");
                    break;
                }
            }
            if (check) {
                System.out.println();
                break;
            }
        }
        while (1>0);
    }

    public static void display(ArrayList<NhanVien> NV, ArrayList<CongNhan> CN, ArrayList<KySu> KS)
    {
        System.out.println("----- THÔNG TIN CÁN BỘ -----");
        NhanVien nv = new NhanVien();
        CongNhan cn = new CongNhan();
        KySu ks = new KySu();
        int j = 1;
        for (int i = 0 ; i < NV.size() ; i++) {
            System.out.println("  Cán bộ thứ " + j);
            nv = NV.get(i);
            nv.outputnv();
            j++;
        }
        for (int i = 0 ; i < CN.size() ; i++) {
            System.out.println("  Cán bộ thứ " + j);
            cn = CN.get(i);
            cn.outputcn();
            j++;
        }
        for (int i = 0 ; i < KS.size() ; i++) {
            System.out.println("  Cán bộ thứ " + j);
            ks = KS.get(i);
            ks.outputks();
            j++;
        }
        System.out.println();
    }

    public static void delete(ArrayList<NhanVien> NV, ArrayList<CongNhan> CN, ArrayList<KySu> KS)
    {
        System.out.println("----- XOÁ CÁN BỘ -----");
        System.out.print("  Nhập ID cần xoá: ");
        int id = sc.nextInt();
        for(int i = 0; i < NV.size(); i++){
            if(NV.get(i).getId() == id){
                NV.remove(i);
                System.out.println("  Đã cho cán bộ có id " + id + " bay màu!!");
                return;
            }
        }
        for(int i = 0; i < CN.size(); i++){
            if(CN.get(i).getId() == id){
                CN.remove(i);
                System.out.println("  Đã cho cán bộ có id " + id + " bay màu!!");
                return;
            }
        }
        for(int i = 0; i < KS.size(); i++){
            if(KS.get(i).getId() == id){
                KS.remove(i);
                System.out.println("  Đã cho cán bộ có id " + id + " bay màu!!");
                return;
            }
        }
    }

    public static void find(ArrayList<NhanVien> NV, ArrayList<CongNhan> CN, ArrayList<KySu> KS)
    {
        NhanVien nv = new NhanVien();
        CongNhan cn = new CongNhan();
        KySu ks = new KySu();
        System.out.println("----- TÌM CÁN BỘ -----");
        System.out.print("  Nhập ID cần tìm: ");
        int id = sc.nextInt();
        for(int i = 0; i < NV.size(); i++){
            if(NV.get(i).getId() == id){
                System.out.println("  Thông tin cán bộ có id " + id + ":");
                nv = NV.get(i);
                nv.outputnv();
                return;
            }
        }
        for(int i = 0; i < CN.size(); i++){
            if(CN.get(i).getId() == id){
                System.out.println("  Thông tin cán bộ có id " + id + ":");
                cn = CN.get(i);
                cn.outputcn();
                return;
            }
        }
        for(int i = 0; i < KS.size(); i++){
            if(KS.get(i).getId() == id){
                System.out.println("  Thông tin cán bộ có id " + id + ":");
                ks = KS.get(i);
                ks.outputks();
                return;
            }
        }
    }
}
