package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class DelOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("删除书籍");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要删除的书名");
        String name = scanner.nextLine();

        int i =0;
        for (; i <bookList.getUsedSize() ; i++) {
            Book book = bookList.getBook(i);
            if (book.getName().equals(name)){
                break;
            }
        }
        if (i>=bookList.getUsedSize()){
            System.out.println("no");
            return;
        }
        int pos = i;
        for (int j = pos; j <bookList.getUsedSize()-1 ; j++) {
            Book book = bookList.getBook(j+1);
            bookList.setBooks(j,book);
        }
        int currentSize = bookList.getUsedSize();
        bookList.setUsedSize(currentSize-1);
        System.out.println("删除书籍完毕！");
    }
}
