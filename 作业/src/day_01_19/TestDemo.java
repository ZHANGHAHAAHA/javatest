package day_01_19;

import java.util.Scanner;

class UserError extends Exception {
    public UserError(String message) {
        super(message);
    }
}
class PasswordError extends Exception {
    public PasswordError(String message) {
        super(message);
    }
}
public class TestDemo {
    private static String userName = "admin" ;
    private static String password = "123456";

    public static void main(String[] args) {
        try {
            login("admin", "123456");
        } catch (UserError userError) {
            userError.printStackTrace();
        } catch (PasswordError passwordError) {
            passwordError.printStackTrace();
        }
    }
    public static void login(String userName, String password) throws UserError, PasswordError {
        System.out.println("欢迎来到登陆界面");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名");
        userName = scanner.nextLine();
        System.out.println("请输入密码");
        password = scanner.nextLine();
        if (!TestDemo.userName.equals(userName)) {
            throw new UserError("用户名错误");
        }
        if (!TestDemo.password.equals(password)) {
            throw new PasswordError("密码错误");
        }
        System.out.println("登陆成功");
    }
//    public static void main(String[] args) {
//        String s1="abc"+"def";//1
//        String s2=new String(s1);//2
//        if(s1.equals(s2))//3
//            System.out.println(".equals succeeded");//4
//        if(s1==s2)//5
//            System.out.println("==succeeded");//6
//        String s3 = s1.substring(1,3);
//        System.out.println(s3.toString());
//    }

//        public static boolean isAdmin(String userId){
//            return userId.toLowerCase()=="admin";
//        }
//        public static void main(String[] args){
//            System.out.println(isAdmin("Admin"));
//
//    }

//        String str = new String("good");
//        char[ ] ch = { 'a' , 'b' , 'c' };
//        public static void main(String args[]){
//            TestDemo ex = new TestDemo();
//            ex.change(ex.str,ex.ch);
//            System.out.print(ex.str + " and ");
//            System.out.print(ex.ch);
//        }
//        public void change(String str,char ch[ ]){
//            str = "test ok";
//            ch[0] = 'g';
//        }

}
