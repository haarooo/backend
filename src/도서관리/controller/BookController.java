package 도서관리.controller;

import product.controller.UserController;
import 도서관리.model.BookDao.BookDao;
import 도서관리.model.BookDao.UserDao;

public class BookController {

    private BookController(){};
    private static final BookController instance = new BookController();
    public static BookController getInstance(){return instance;}
    private BookDao bd = BookDao.getInstance();

    public boolean borrow(String name){
        boolean result = bd.borrow(name);
        return result;
    }

    public boolean bookReturn(String name){
        boolean result = bd.bookReturn(name);
        return result;
    }
}


