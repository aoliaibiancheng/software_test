import java.util.Scanner; //通过scanner类来获取用户的输入 Scanner  S=new Scanner(System.in);

public class Main {
    @SuppressWarnings({ "resource" })//消除警告
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);

        boolean main_isopen = true; //用于控制程序的闭合

        String main_choice;

        while(main_isopen){
            //界面显示
            System.out.println("========欢迎进入档案管理系统=========");
            System.out.println("=========  1.登陆  ===============");
            System.out.println("=========  2.退出  ===============");
            System.out.println("=================================");
            System.out.print("请输入选项：");
            main_choice = scan1.next();

            if(main_choice.equals("1")){
                // 输入用户信息
                System.out.print("请输入用户名：");
                String input_name = scan2.next();
                System.out.print("请输入密码：");
                String input_password = scan3.next();

                //检查密码的正确性
                User user = Dataprocessing.search(input_name,input_password);
                if(user==null){
                    System.out.println("用户名与密码不符！");
                }else{
                    //打开对应身份的界面
                    user.showMenu();
                }
            } else if (main_choice.equals("2")) {
                //退出、关闭界面
                main_isopen=false;
            } else {
                System.out.println("输入错误！请重新输入！");
            }
        }



        System.out.println("Hello world!");
    }
}