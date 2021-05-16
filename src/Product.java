public class Product implements Comparable {

    String productName;
    String productCode;
    int stock;

    public Product(String productName, String productCode, int stock) {
        this.productName = productName;
        this.productCode = productCode;
        this.stock = stock;
    }

    public void setName(String productName) {
        this.productName = productName;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
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

    @Override
    public String toString() {
        return
                "\n Product Name= '" + productName + '\'' +
                        ", Product Code= '" + productCode + '\'' +
                        ", Number in Stock= " + stock + "\n"
                ;
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Product)) {
            throw new IllegalArgumentException("Tried to compare a Product with a non-product!");
        }
        return this.productCode.compareTo(((Product) o).productCode);
    }
}
