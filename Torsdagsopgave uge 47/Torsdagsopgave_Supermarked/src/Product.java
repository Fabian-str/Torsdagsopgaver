public class Product {

    private long productID;
    private String productName;
    private String priceDate;
    private double price;
    private boolean isBudgetBrand;
    private double quantity;
    private String unit;
    private boolean isWeighted;
    private boolean isBio;
    private boolean isAvailable;

    public Product(long productID, String productName, String priceDate, double price, boolean isBudgetBrand, double quantity, String unit, boolean isWeighted, boolean isBio, boolean isAvailable) {
        this.productID = productID;
        this.productName = productName;
        this.priceDate = priceDate;
        this.price = price;
        this.isBudgetBrand = isBudgetBrand;
        this.quantity = quantity;
        this.unit = unit;
        this.isWeighted = isWeighted;
        this.isBio = isBio;
        this.isAvailable = isAvailable;
    }

    public long getProductID() {
        return productID;
    }

    public void setProductID(long productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPriceDate() {
        return priceDate;
    }

    public void setPriceDate(String priceDate) {
        this.priceDate = priceDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isBudgetBrand() {
        return isBudgetBrand;
    }

    public void setBudgetBrand(boolean budgetBrand) {
        isBudgetBrand = budgetBrand;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public boolean isWeighted() {
        return isWeighted;
    }

    public void setWeighted(boolean weighted) {
        isWeighted = weighted;
    }

    public boolean isBio() {
        return isBio;
    }

    public void setBio(boolean bio) {
        isBio = bio;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}