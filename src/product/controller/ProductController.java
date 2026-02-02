package product.controller;

import product.model.dao.ProductDao;
import product.model.dao.UserDao;
import product.model.dto.ProductDto;

import java.util.ArrayList;

public class ProductController {
    private ProductController(){}
    private static final ProductController instance=new ProductController();
    public static ProductController getInstance(){return instance;}
    private ProductDao pd=ProductDao.getInstance();

    public boolean pAdd(String product,int price,String content){
        int loginNo = UserController.getInstance().getLoginSession();
        boolean result = pd.pAdd(product, price, content , loginNo);
        return result;
    }

    public ArrayList<ProductDto> findALl(){
        ArrayList<ProductDto> result = pd.findAll();
        for(int index = 0 ; index <= result.size()-1 ; index++){
            ProductDto productDto = result.get(index);
            String pname = UserDao.getInstance().findName(productDto.getLoginNo());
            productDto.setPname(pname);
        }
        return result;
    }


}
