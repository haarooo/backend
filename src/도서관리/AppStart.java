package 도서관리;

import product.view.ProductView;
import 도서관리.view.BookView;

public class AppStart {
    public static void main(String[] args) {
        BookView.getInstance().indexView();
    }
}
