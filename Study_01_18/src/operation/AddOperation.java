package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class AddOperation implements IOperation {

    @Override
    public void work(BookList bookList) {
        System.out.println("增加书籍 ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入图书的名字");
        String name = scanner.nextLine();
        System.out.println("请输入图书的作者");
        String author = scanner.nextLine();
        System.out.println("请输入图书的价格");
        int price = scanner.nextInt();
        System.out.println("请输入图书的类型");
        String type = scanner.next();
        Book book = new Book(name,author,price,type);
        int currentSize = bookList.getUsedSize();

        bookList.setBooks(currentSize,book);
        bookList.setUsedSize(currentSize+1);
    }
}
