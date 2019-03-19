/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 61010707
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Stock");
        Stock stock = new Stock("ORCL", "Oracel Corporation");
        stock.setPreviousClosingPrice(34.5);
        stock.setCurrentPrice(34.35);
        System.out.println("Stock change percent : " + stock.getChangePercent() + "%");
    }
}
