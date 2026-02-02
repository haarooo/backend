package 도서관리.model.BookDto;

public class BookDto {
    private String name;
    private int bookNo;
    private boolean isAvailable;

    public BookDto(){};

    public BookDto(int bookNo , String name , boolean isAvailable) {
        this.name = name;
        this.bookNo = bookNo;
        this.isAvailable = isAvailable;
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBookNo() {
        return bookNo;
    }

    public void setBookNo(int bookNo) {
        this.bookNo = bookNo;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "BookDto{" +
                "name='" + name + '\'' +
                ", bookNo=" + bookNo +
                '}';
    }
}
