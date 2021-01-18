import book.Book;
import book.BookList;
import user.AdminUser;
import user.NormalUser;
import user.User;

import java.util.Scanner;

public class Main {
    public static User login(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的姓名");
        String name = scanner.nextLine();
        System.out.println("请输入你的身份：1-》管理员 0：普通用户");
        int choice = scanner.nextInt();
        if (choice == 1){
            return new AdminUser(name);
        }else {
            return new NormalUser(name);
        }
    }

    public static void main(String[] args) {
        BookList bookList = new BookList();
        //1.登录 user会引用一个对象 这个对象可能是AdminUser NormalUser
        User user = login();
        while (true){
            //会调用user引用的对象的 menu方法,返回对应的选择
            int choice = user.menu();
            //拿choice去调用对应类的 work 方法
            //这个work方法，调用谁的 ，怎么调用，交给doOperation
            user.doOperation(choice,bookList);
        }

    }
}
