import java.util.Scanner;

public class KySu extends CanBo{
    static Scanner sc = new Scanner(System.in);
    private String daoTao;

    public void inputks()
    {
        inputcb();
        System.out.print("    Nhập vào ngành đào tạo: ");
        daoTao = sc.nextLine();
    }

    public void outputks()
    {
        outputcb();
        System.out.println("    Ngành đào tạo: " + daoTao);
    }
}
