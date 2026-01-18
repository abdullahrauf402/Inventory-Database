package proj03mrauf3;

import java.util.Scanner;

public class Customer {

    private String username;
    private double balance;
    private MediaItem[] mic;
    private int firstEmpty;

    public Customer() {
        username = "";
        balance = 0.0;
        mic = new MediaItem[10];
        firstEmpty = 0;
    }

    public Customer(String user, double bal) {
        this();
        setUsername(user);
        setBalance(bal);
        mic = new MediaItem[10];
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String user) {
        username = user;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double bal) {
        balance = bal;
    }

    public MediaItem[] getMi1() {
        return mic;
    }

    public String toString() {
        return getUsername() + " (Balance: $" + getBalance() + ")";
    }

    public void buy(MediaItem m) {
        if (firstEmpty < mic.length && balance >= m.getPrice()) {
            mic[firstEmpty] = m;
            firstEmpty++;
            setBalance(getBalance() - m.getPrice());
        } else {
            System.out.println("Insufficient Funds");
        }
    }

    public void mediaBought() {
        System.out.println("Items owned:");
        for (int i = 0; i < firstEmpty; i++) {
            System.out.println((i + 1) + ". " + mic[i].getName());
        }
    }

    public void useMediaBought() {
        System.out.println("Items owned:");
        for (int i = 0; i < firstEmpty; i++) {
            System.out.println((i + 1) + ". " + mic[i].getName());
        }
        System.out.println("Select an item to use:");
        Scanner scan = new Scanner(System.in);
        int u = scan.nextInt() - 1;
        if (u >= 0 && u < firstEmpty) {
            mic[u].use();
        } else {
            System.out.println("Invalid Choice");
        }
    }
}
