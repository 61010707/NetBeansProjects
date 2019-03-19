/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 61010707
 */
class Stock {

    private String symbol = "";
    private String name = "";
    private double previousClosingPrice = 0.0;
    private double currentPrice = 0.0;

    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public double getChangePercent() {
        return ((currentPrice- previousClosingPrice)*100)/previousClosingPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }
    
    
}
