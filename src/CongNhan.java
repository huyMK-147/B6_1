import java.util.Scanner;

public class CongNhan extends CanBo{
    static Scanner sc = new Scanner(System.in);
    private String bac;

    public void inputcn()
    {
        inputcb();
        System.out.print("    Nhập vào bậc: ");
        bac = sc.nextLine();
    }

    public void outputcn()
    {
        outputcb();
        System.out.println("    Bậc: " + bac);
    }
}
