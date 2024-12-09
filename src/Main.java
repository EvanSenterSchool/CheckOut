import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean itemS;
        double priceTotal = 0;


        //Scan
        Scanner scan = new Scanner(System.in);

        //User
        do {
            double itemPrice = inputhelper.getRangedDouble(scan, "what is the price of your item", 0.50, 9.99);
            priceTotal = priceTotal + itemPrice;
            itemS = inputhelper.getYNConfirm(scan, "Would you like to add another item" );

        } while (itemS);
        System.out.println("Your total price is $" + priceTotal);

    }
}


