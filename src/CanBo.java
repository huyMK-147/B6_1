import java.util.Scanner;

public class CanBo {
    static Scanner sc = new Scanner(System.in);
    protected int id;
    protected String ten;
    protected int namSinh;
    protected String gioiTinh;
    protected String diaChi;
    static int temp = 1;

    public int getId() {
        return id;
    }

    public CanBo()
    {
        id = temp;
        temp++;
    }

    public void inputcb()
    {
        System.out.print("    Nhập vào tên: ");
        ten = sc.nextLine();
        System.out.print("    Nhập vào năm sinh: ");
        namSinh = sc.nextInt();
        sc.nextLine();
        System.out.print("    Nhập vào giới tính: ");
        gioiTinh = sc.nextLine();
        System.out.print("    Nhập vào địa chỉ: ");
        diaChi = sc.nextLine();
    }

    public void outputcb()
    {
        System.out.println("    ID: " + id);
        System.out.println("    Tên: " + ten);
        System.out.println("    Năm sinh: " + namSinh);
        System.out.println("    Giới tính: " + gioiTinh);
        System.out.println("    Địa chỉ: " + diaChi);
    }
}
