/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.io.Serializable;

/**
 *
 * @author javcoder
 */
public class veriaties implements Serializable{
    private String name ;
    private String type ;
    private int price ;
    private int code ;
    private int quantity ;
    private int totalPrice ;

    public veriaties(String name, String type, int price, int code, int quantity , int total ) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.code = code;
        this.quantity = quantity;
        this.totalPrice = total ;
    }


    public veriaties() {
    }
    
    
    //sette and getter 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Veriaties {" + "name is " + name + "types is " + type + "price is " + price + "quantity is " + quantity +  "totolPrice is " + totalPrice + '}' ;
    }
    
    
    
}
