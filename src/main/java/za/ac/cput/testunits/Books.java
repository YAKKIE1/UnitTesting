/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.testunits;

/**
 *
 * @author @author Ali Mohamed - 219113505
 */
public class Books {
    private int id, price;
    private String name;

    public Books(int id, int price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }
    
    public int getPrice(){
        return price;
    }
}
