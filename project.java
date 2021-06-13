package project;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class vending {

    public static String itemName;
    public static double itemPrice;
    public static int quantity;
    public static double totalPrice;
    public static double change;
    public static double machineAmount;
    public static double coutmerAmount;
    

    private static void dairy() {
        System.out.println("\nIndex  Items            Price\n");
        System.out.println("\n____   ______           _________\n");
        System.out.println("\n 1.    milk             55 rs/lt\n");
        System.out.println("\n 2.    curd             99 rs/kg\n");
        System.out.println("\n 3.    lassi            65 rs/lt\n");
        System.out.println("\n 4.    chees            174 rs/kg\n");
        System.out.println("\n 5.    butter           490 rs/kg\n");
        System.out.println("\n 6.    milk shake       30 rs/bottel\n");
        System.out.println("\n 7.    ice cream        300 rs/lt\n");
        System.out.println("\n 8.    cone ice cream   25 rs\n");
        System.out.println("\n 9.    ice cream cakes  500 rs/kg\n");
        
    }
    private static void soaps() {
        System.out.println("\n Index    Items    Price\n");
        System.out.println("\n _____    _____    _______\n");
        System.out.println("\n 1.       dove     40 Rs\n");
        System.out.println("\n 2.       lux      25 Rs\n");
        System.out.println("\n 3.       cintal   34 Rs\n");
        System.out.println("\n 4.       ayush    32 Rs\n");
        System.out.println("\n 5.       santoor  32 Rs\n");
        System.out.println("\n 6.       rexona   32 Rs\n");
        System.out.println("\n 7.       himalaya 40 Rs\n");
       
    }
    private static void snacks_hot() {
        System.out.println("\n Index    Items          Price \n");
        System.out.println("\n _____    ______         ________\n");
        System.out.println("\n 1.       chips          150 Rs/kg\n");
        System.out.println("\n 2.       bhujiya        200 Rs/kg\n");
        System.out.println("\n 3.       mixtuer        200 Rs/kg\n");
        System.out.println("\n 5.       chakodi        200 Rs/kg\n");
        System.out.println("\n 6.       mixed mixtuer  300 Rs/kg\n");  
        
    }
    private static void snacks_sweet() {
        System.out.println("\n Index    Items       Price \n");
        System.out.println("\n _____    _______     _______\n");
        System.out.println("\n 1.       biscuits    50 Rs\n");
        System.out.println("\n 2.       cookies     80 Rs\n");
        System.out.println("\n 3.       chocolates  150 Rs\n");
        System.out.println("\n 4.       sweets      200 Rs/kg\n"); 
        
    }
    private static void drinks() {
        System.out.println("\n Index     Items       price\n");
        System.out.println("\n _____     _____       _________\n");
        System.out.println("\n 1.        mango       70 Rs/lt\n");
        System.out.println("\n 2.        orange      60 Rs/lt\n");
        System.out.println("\n 3.        milk shake  70 Rs/lt\n");
        System.out.println("\n 4.        pine apple  60 Rs/lt \n");
        System.out.println("\n 5.        soft drinks 40 Rs\n");
        
    }
    private static void change() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n how much amount does coustmer have: " );
            coutmerAmount = sc.nextInt();
            if (machineAmount == coutmerAmount) {
                System.out.println(" \nBill paid!");
                System.out.println("Thankyou visit again :)\n");
            } else {
                change = coutmerAmount - machineAmount;
                System.out.println("\n here is your change: " + change);
                System.out.println("Bill paid!\n");
                System.out.println("Thankyou visit again :)\n");
            }
            sc.close();
        
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ch;
        String keepShopping ="y";

      Map<String, Double> cartMap = new HashMap<>();
      
        do{
            System.out.println("\nchoose in which categorie you want to shop\n");
            System.out.println("\n 1.dairy \n 2.soaps \n 3.snacks hot \n 4.snacks sweet\n 5.drinks\n 6.exit\n");
            System.out.println("\nenter your choice\n");
            ch = sc.nextInt();
            switch (ch) {
                case 1:dairy();
                cartFunc(sc, cartMap);
                break;

                case 2:soaps();
                cartFunc(sc, cartMap);
                break;

                case 3:snacks_hot();
                cartFunc(sc, cartMap);
                break;

                case 4:snacks_sweet();
                cartFunc(sc, cartMap);
                break;

                case 5:drinks();
                cartFunc(sc, cartMap);
                break;

                case 6:System.out.println("BYE!");
                break;
             }
             System.out.println("do you want to add more items? (y/n):  ");
             keepShopping = sc.next();
        
        }while(keepShopping.equalsIgnoreCase("y"));


        System.out.println("\nfinal Shopping Cart totals");
        double total=0 ;

            for (Map.Entry<String,Double> entry : cartMap.entrySet()) 
            {
                System.out.println("Item :  " + entry.getKey() + " | Total price : " + entry.getValue());
                total = total + entry.getValue();
            }

            machineAmount = total;
            
            System.out.println("\n total amount to be paid: \n " + machineAmount);
           
            change();
        
        
        sc.close();
    }
    
    static void cartFunc(Scanner sc, Map<String, Double> cartMap) 
    {
        System.out.print( "Enter the name of the item: " );
        itemName = sc.next();

        System.out.print( "Enter the unit price: " );
        itemPrice = sc.nextDouble();

        System.out.print( "Enter the quantity: " );
        quantity = sc.nextInt();
        sc.nextLine();

        cartMap.put(itemName, itemPrice*quantity);

    }
}

