/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inclasslab2;

/**
 *
 * @author 61010707
 */
public abstract class Fruit implements Ediable{

    protected Fruit() {
    }

    @Override
    public void howToEat() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Eat with mouse");
    }
    
    public abstract void haveSeed();
    
    
   
}
