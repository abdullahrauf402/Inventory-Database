package proj03mrauf3;

public class Store {

    private MediaItem[] mi2;
    private Customer[] cust;

    public Store() {
        mi2 = new MediaItem[15];
        cust = new Customer[5];
        mi2[0] = new MediaItem("Chips", 1.0, false);
        mi2[1] = new MediaItem("Brownies", 3.0, false);
        mi2[2] = new MediaItem("SourPatch", 2.0, false);
        mi2[3] = new MediaItem("Fruits", 5.0, true);
        mi2[4] = new MediaItem("Nuts", 3.1, true);
        mi2[5] = new MediaItem("Cheese", 5.2, false);
        mi2[6] = new MediaItem("Cereal", 11.1, true);
        mi2[7] = new MediaItem("PopTarts", 6.5, true);
        mi2[8] = new MediaItem("Lemonade", 4.0, false);
        mi2[9] = new MediaItem("CocaCola", 5.4, true);
        mi2[10] = new MediaItem("FruitSnacks", 4.9, false);
        mi2[11] = new MediaItem("Eggs", 7.0, false);
        mi2[12] = new MediaItem("Waffles", 3.2, true);
        mi2[13] = new MediaItem("GoldFish", 3.2, true);
        mi2[14] = new MediaItem("IceCream", 4.5, true);
        cust[0] = new Customer("Tony", 200.0);
        cust[1] = new Customer("Steve", 147.6);
        cust[2] = new Customer("Peter", 17.0);
        cust[3] = new Customer("Bruce", 150.0);
        cust[4] = new Customer("Clark", 70.0);
    }

    public MediaItem[] getMediaItems() {
        return mi2;
    }

    public Customer[] getCustomer() {
        return cust;
    }
}
