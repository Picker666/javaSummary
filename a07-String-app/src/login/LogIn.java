package login;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        logIn();
    }

    public static void logIn () {
        Scanner scanner = new Scanner(System.in);

        String name = scanKeyIn(scanner, "请输入名字：");
        String password = scanKeyIn(scanner, "请输入密码：");
        verify(scanner, name, password);
    }

    public static String scanKeyIn (Scanner scanner, String Remind) {
        System.out.print(Remind);
        String keyIn = scanner.next();
        return keyIn;
    }

    public static void verify (Scanner scanner, String name, String password) {
        int times = 3;
        String nm = scanKeyIn(scanner, "请输入名字：");
        if (!nm.equals(name)) {
            System.out.println("用户名不存在");
            verify(scanner, name, password);
            return;
        }
        do {
            String psw = scanKeyIn(scanner, "请输入密码：");

            if (password.equals(psw)) {
                System.out.println("登陆成功！");
                return;
            }
        } while (times-- > 1);

        System.out.println("登陆失败！");
    }
}
