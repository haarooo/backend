package product.model.dao;

import product.model.dto.ProductDto;
import product.model.dto.UserDto;
import 종합과제2.model.dao.WaitingDao;
import 종합과제2.model.dto.WaitingDto;

import java.util.ArrayList;

public class ProductDao {
    private ProductDao() {};
    private static final ProductDao instance = new ProductDao();
    public static ProductDao getInstance() {//싱글톤을 반환하는 메소드
        return instance;
    }
    private static final ArrayList<ProductDto> productLists = new ArrayList<>();
    private static int productNo;

    //제품 등록 함수
    public boolean pAdd(String product, int price, String content, int loginNo) {
        ProductDto productDto = new ProductDto(productNo , product, price, content , loginNo);
        boolean productResult = productLists.add(productDto);
        if(productResult){productNo++;}
        return productResult;
    }

    //반환
    public ArrayList<ProductDto> findAll(){
        return productLists ;
    }

}// c end

