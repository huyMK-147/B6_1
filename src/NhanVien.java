import java.util.Scanner;

public class NhanVien extends CanBo{
    static Scanner sc = new Scanner(System.in);
    private String congViec;

    public void inputnv()
    {
        inputcb();
        System.out.print("    Nhập vào công việc: ");
        congViec = sc.nextLine();
    }

    public void outputnv()
    {
        outputcb();
        System.out.println("    Công việc: " + congViec);
    }
}
