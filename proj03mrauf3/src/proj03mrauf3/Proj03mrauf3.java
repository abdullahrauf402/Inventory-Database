package proj03mrauf3;

import java.util.Scanner;

public class Proj03mrauf3 {
// Tony, Steve, Peter, Bruce, Clark

    public static void main(String[] args) {
        Store s = new Store();
        Scanner scan = new Scanner(System.in);
        String user = "";
        Customer cur = null;
        boolean exit = false;
        while (!exit) {
            System.out.println("Username(or enter QUIT to exit): ");
            user = scan.next();
            if (user.equals("QUIT")) {
                exit = true;
            } else if (user.equals("Tony") || user.equals("Steve") || user.equals("Peter") || user.equals("Bruce") || user.equals("Clark")) {
                for (int i = 0; i < s.getCustomer().length; i++) {
                    if (s.getCustomer()[i].getUsername().equals(user)) {
                        cur = s.getCustomer()[i];
                    }
                }
                while (!user.equals("QUIT")) {
                    System.out.println("1. Shop media items");
                    System.out.println("2. Add funds and see balance");
                    System.out.println("3. Owned media items");
                    System.out.println("4. Use owned media items");
                    System.out.println("5. Log off");
                    int menu = scan.nextInt();
                    if (menu == 1) {
                        System.out.println("Shop media items:");
                        MediaItem[] m = s.getMediaItems();
                        for (int i = 0; i < m.length; i++) {
                            System.out.println(i + ".)" + m[i]);
                        }
                        System.out.println("Select an item to add to your list");
                        int item = scan.nextInt();
                        cur.buy(m[item]);
                    } else if (menu == 2) {
                        System.out.println("Add funds(enter 0 to see your current balance):");
                        double amt = scan.nextDouble();
                        cur.setBalance(cur.getBalance() + amt);
                        System.out.println(cur);
                    } else if (menu == 3) {
                        cur.mediaBought();
                    } else if (menu == 4) {
                        cur.useMediaBought();
                    } else if (menu == 5) {
                        System.out.println("LOGGED OFF...COME AGAIN SOON!");
                        user = "QUIT";
                    }
                }
            } else {
                System.out.println("Invalid username. Please enter a valid username.");
            }
        }
    }
}
