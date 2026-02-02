package 도서관리.model.BookDao;

import product.model.dao.UserDao;
import product.model.dto.ProductDto;
import 도서관리.model.BookDto.BookDto;

import java.util.ArrayList;

public class BookDao {
    private BookDao(){};
    private static final BookDao instance = new BookDao();
    public static BookDao getInstance(){return instance;}

    private static final ArrayList<BookDto> bookList = new ArrayList<>();
    private static final ArrayList<BookDto> myList = new ArrayList<>();
    private static int bookNo;

    //도서 대출 함수
    public boolean borrow(String name) {
        for(int index = 0 ; index <= bookList.size() -1 ; index++){
            if(bookList.get(index).getName().equals(name)){
               false = bookList.get(index).isAvailable()
               //내 대출목록에 추가
               return true;
            }
        }
        return false;
    }

    //도서 반납 함수
    public boolean bookReturn(String name){
        for(int index = 0 ; index<= myList.size()-1 ; index++){
            if(myList.get(index).getName().equals(name)){
                BookDto result = myList.get(index);
                myList.remove(result);
                bookList.add(result);
                return true;
            }
        }
        return false;
    }




}//c end
