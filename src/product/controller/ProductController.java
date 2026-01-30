package product.controller;

import product.model.dao.ProductDao;
import product.model.dto.ProductDto;

import java.util.ArrayList;

public class ProductController {
    private ProductController(){}
    private static final ProductController instance=new ProductController();
    public static ProductController getInstance(){return instance;}
    private ProductDao pd=ProductDao.getInstance();

    public boolean productAdd(String product,int price,String content){
        boolean result=pd.productAdd(product, price,content);
        return result;
    }

    public ArrayList<ProductDto> doGet(){
        return pd.ProductdoGet();
    }
}
