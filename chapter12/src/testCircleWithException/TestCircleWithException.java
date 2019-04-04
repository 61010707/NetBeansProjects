/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testCircleWithException;

/**
 *
 * @author 61010707
 */
public class TestCircleWithException {
    
    public static void main(String[] args) {
        CircleWithExceptiuon circle = new CircleWithExceptiuon();
        CircleWithExceptiuon circle1 = new CircleWithExceptiuon(-1.1);
    }
    
}

class CircleWithExceptiuon {
    
    private double radius = 0;
    
    public CircleWithExceptiuon() throws Exception {
        setRadius(1.0);
    }
    
    CircleWithExceptiuon(double radius) throws Exception {
        setRadius(radius);
    }
    
    public void setRadius(double radius) throws Exception {
        if (radius <= 0) {
            throw new Exception("radius cannot equal to 0");
        } else {
            
            this.radius = radius;
        }
        
    }
    
}
