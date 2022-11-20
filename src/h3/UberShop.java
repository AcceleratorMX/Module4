package h3;

import java.util.*;

public class UberShop {
    public void printPrices(float[] prices) {
        for(float price: prices) {
            System.out.println(price + " jup.");
        }
    }

    public int[] findMinMaxPrices(int[] prices) {

        if (prices.length == 0){
            return new int[]{};
        }

        int min = prices[0], max = prices[0];

        for (int price:prices) {

            if (price < min) {
                min = price;
            }
            if (price > max) {
                max = price;
            }
        }

        //int a = min, b = max;

        if (min == max) {
            return new int[]{min};
        } else {
            return new int[]{min, max};
        }
    }

    //Test output
    public static void main(String[] args) {
        UberShop shop = new UberShop();

        //Should be [50, 1500]
        int[] prices = new int[] {100, 1500, 300, 50};
        int[] minMax = shop.findMinMaxPrices(prices);
        System.out.println(Arrays.toString(minMax));
    }

}