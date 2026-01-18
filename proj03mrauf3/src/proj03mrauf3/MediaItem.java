package proj03mrauf3;

public class MediaItem {

    private String name;
    private double price;
    private boolean onSale;

    public MediaItem() {
        name = "";
        price = 0.0;
        onSale = false;
    }

    public MediaItem(String n, double p, boolean os) {
        this();
        setName(n);
        setPrice(p);
        setOnSale(os);
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public double getPrice() {
        if (onSale == true) {
            return price * 0.9;
        } else {
            return price;
        }
    }

    public void setPrice(double p) {
        price = p;
    }

    public boolean getOnSale() {
        return onSale;
    }

    public void setOnSale(boolean os) {
        onSale = os;
    }

    public String toString() {
        return getName() + " (Price: $" + getPrice() + " , On Sale?: " + getOnSale() + ")";
    }

    public void use() {
        System.out.println("Using " + getName());
    }
}
