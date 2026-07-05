public class Expense {

    //Attributt
    private String itemName;
    private Category category;
    private String purchaseDate;
    private int quantity;
    private double price;

    //Constructor
    public Expense(String itemName, Category category, String purchaseDate, int quantity, double price){
        this.itemName=itemName;
        this.category=category;
        this.purchaseDate=purchaseDate;
        this.quantity=quantity;
        this.price=price;
    }

    //Setters & Getters
    public String getName() {
        return itemName;
    }

    public void setName(String itemName) {
        this.itemName = itemName;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //toString
    @Override
    public String toString() {
        return "Item Name = " + itemName + ", Category = " + category + ", PurchaseDate = " + purchaseDate
                + ", Quantity = " + quantity + ", Price = " + price ;
    }

}
