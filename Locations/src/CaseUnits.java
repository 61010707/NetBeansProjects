/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 61010707
 */
public interface CaseUnits {

    static Location findHighestValue(double[][] doubles) {
        Location highestCase = new Location(-1, -1, Double.MIN_VALUE);
        for (int row = 0; row < doubles.length; row++) {
            for (int col = 0; col < doubles[row].length; col++) {
                double value = doubles[row][col];
                if (value > highestCase.getMaxValue()) {
                    highestCase = new Location(row, col, value);
                }
            }
        }
        return highestCase;
    }

}
