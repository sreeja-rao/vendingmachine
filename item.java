package project;

import java.text.NumberFormat;

public class item {

    private static String Name;
    private static double price;
    private static int quantity;

    public item(String itemName, double itemPrice, int numPurchased) {
        Name = itemName;
        price = itemPrice;
        quantity = numPurchased;

    }
    public String getName() {
        return Name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString(){
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        String strTab = Name.length() > 8 ? "\t" : "\t\t";
        return (Name + strTab + fmt.format(price) + "\t\t" + quantity + "\t\t" + fmt.format(price*quantity));

    }


}
