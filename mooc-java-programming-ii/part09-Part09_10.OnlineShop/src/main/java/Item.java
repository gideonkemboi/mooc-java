
public class Item {

    private String product;
    private int qty;
    private int unitPrice;

    public Item(String product, int qty, int unitPrice) {
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }
    //; a constructor that creates an item corresponding to the product given as a parameter. 
    //qty tells us how many of the product are in the item, while unitPrice is the price of a single product.

    public int price() {
        return unitPrice * qty;
    }
    // return the price of the item. You get the items price by multiplying its unit price by its quantity(qty).

    public void increaseQuantity() {
        this.qty++;
    }
    // increases the quantity by one.

    public String toString() {
        return this.product + ": " + this.qty;
    }
    // returns the string representation of the item. which must match the format shown in the example below.

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Item)) {
            return false;
        }

        Item compared = (Item) obj;
        return (this.product.equals(compared.product)) && (this.unitPrice == compared.unitPrice);
    }

    @Override
    public int hashCode() {
        return this.product.hashCode();
    }
}
