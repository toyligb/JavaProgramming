package zReplit;

import java.util.*;

public class Task084OnlineBookMerchants {

    public static void main(String[] args) {

        int freeBooks = 0;
        Scanner scan = new Scanner(System.in);
        boolean isPremiumCustomer = scan.nextBoolean();
        int nbooksPurchased = scan.nextInt();

        while (isPremiumCustomer) {
            if (nbooksPurchased < 8 && nbooksPurchased >= 5) {
                freeBooks++;
            } else if (nbooksPurchased >= 8) {
                freeBooks += 2;
            }
            break;
        }
        while (!isPremiumCustomer) {
            if (nbooksPurchased >= 12) {
                freeBooks += 2;
            } else if (nbooksPurchased >= 7) {
                freeBooks++;
            }
            break;
        }

        System.out.println(freeBooks);

    }

}
