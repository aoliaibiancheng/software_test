import java.util.Scanner;

public class Browser extends User {

    public Browser(String name, String password, String role) {
        super(name, password, role);
    }

    @SuppressWarnings("resource")
    public void showMenu() {

        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        // 控制界面的开关
        boolean browser_isopen = true;
        // 记录用户的选择
        String browser_choice;

        while (browser_isopen) {

            // 界面显示
            System.out.println("=======欢迎进入档案浏览员菜单=======");
            System.out.println("            1.下载文件");
            System.out.println("            2.文件列表");
            System.out.println("            3.修改密码");
            System.out.println("            4.退    出");
            System.out.println("====================================");
            System.out.print("请输入选项：");
            browser_choice = scan1.next();

            if (browser_choice.equals("1")) {

                System.out.print("请输入档案号：");
                String fileID = scan2.next();

                // 下载文件
                super.downloadFile(fileID);

            } else if (browser_choice.equals("2")) {

                // 列出文件
                System.out.println("文件列表");
                super.showFileList();

            } else if (browser_choice.equals("3")) {

                System.out.print("请输入新密码:");
                String newpassword = scan2.next();

                // 修改密码
                if (this.changeSelfInfo(newpassword)) {
                    System.out.println("修改成功!");
                } else {
                    System.out.println("修改失败");
                }

            } else if (browser_choice.equals("4")) {
                // 关闭页面
                browser_isopen = false;
            } else {
                System.out.println("输入格式有误！请重新输入！");
            }

        }
    }
}