package book;

public class BookList {
    public int usedSize;
    private Book[] books;

    public BookList() {
        this.books = new Book[10];
        books[0] = new Book("三国","罗贯中",12,"小说");
        books[1] = new Book("西游记","吴承恩",32,"小说");
        books[2] = new Book("水浒传","施耐庵",52,"小说");
        this.usedSize = 3;
    }

    //本来增删查改应该在这个类  但是想引用接口 所以不放在在这

    public  void setBooks(int pos,Book book){//尾插法增加书籍
        this.books[pos] = book;
    }

    public Book getBook(int pos){
        return this.books[pos];
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }
}
