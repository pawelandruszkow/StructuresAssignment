public class Product {

    String productName;
    String productCode;
    int stock;

    public void setName(String productName){
        this.productName = productName;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductCode() {
        return productCode;
    }

    public int getInStock() {
        return stock;
    }
}
