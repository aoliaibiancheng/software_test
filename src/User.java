public abstract class User {
    private String name;
    private  String password;
    private String role;

    User(String name,String password,String role){
        this.name = name;
        this.password = password;
        this.role = role;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name  = name;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword(){
        return this.password;
    }
    public String getRole(){
        return this.role;
    }

    public abstract void showMenu();

    public boolean downloadFile(String fileID){
        System.out.println("下载文件... ...");
        System.out.println("下载成功！");
        return true;
    }

    public void showFileList(){
        System.out.println("列表... ...");
    }

    public boolean changeSelfInfo(String password) {
        if(Dataprocessing.update(name,password,role)) {
            this.password = password;
            return true;
        } else
            return false;
    }

    public void exitSystem() {
        System.out.println(("系统退出，谢谢使用！"));
        System.exit(0);
    }
}
