package product.model.dto;

public class ProductDto {
    private int productNo;
    private String product;
    private int price;
    private String content;
    private int loginNo;
    private String pname;

    public ProductDto() {
    }

    public ProductDto(int productNo, String product, int price, String content, int loginNo) {
        this.productNo = productNo;
        this.product = product;
        this.price = price;
        this.content = content;
        this.loginNo = loginNo;
    }

    public int getProductNo() { return productNo; }
    public void setProductNo(int productNo) { this.productNo = productNo; }
    public String getProduct() { return product; }
    public void setProduct(String product) { this.product = product; }
    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }
    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    public int getLoginNo() {
        return loginNo;
    }

    public void setLoginNo(int loginNo) {
        this.loginNo = loginNo;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    @Override
    public String toString() {
        return "ProductDto{" +
                "productNo=" + productNo +
                ", product='" + product + '\'' +
                ", price=" + price +
                ", content='" + content + '\'' +
                '}';
    }
}